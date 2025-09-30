package web.pulso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "especialidades")
public class Especialidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    
    @ManyToMany(mappedBy = "especialidades")
    private List<Setor> setores = new ArrayList<>();
    
    @ManyToMany(mappedBy = "especialidades")
    private List<LiderEscala> lideresEscala = new ArrayList<>();
    
    @ManyToMany(mappedBy = "especialidades")
    private List<Profissional> profissionais = new ArrayList<>();
}