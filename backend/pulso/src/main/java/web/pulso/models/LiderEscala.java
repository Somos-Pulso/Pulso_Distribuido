package web.pulso.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@Entity
@Table(name = "lideres_escala")
public class LiderEscala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "pessoa_id", nullable = false)
    private Pessoa pessoa;

    // Um líder de escala tem UMA especialidade principal
    @ManyToOne
    @JoinColumn(name = "especialidade_id", nullable = false)
    private Especialidade especialidade;

    @OneToOne
    @JoinColumn(name = "vinculo_id", nullable = false)
    private Vinculo vinculo;

    @OneToMany(mappedBy = "liderEscala")
    private List<Escala> escalas = new ArrayList<>();
}