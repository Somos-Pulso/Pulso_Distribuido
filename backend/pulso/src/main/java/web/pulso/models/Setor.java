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
@Table(name = "setores")
public class Setor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "instituicao_id") // uma instituição pode ter muitos setores
    private Instituicao instituicao;
    
    @ManyToMany
    @JoinTable(
        name = "setor_especialidade",
        joinColumns = @JoinColumn(name = "setor_id"),
        inverseJoinColumns = @JoinColumn(name = "especialidade_id")
    )
    private List<Especialidade> especialidades = new ArrayList<>(); // inicializa a lista para garantir que nunca será nula
    
    @ManyToOne
    @JoinColumn(name = "escala_id")
    private Escala escala;
}