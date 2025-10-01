package web.pulso.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.ArrayList;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "lideres_escala")
public class LiderEscala extends Usuario {

    @ManyToMany
    @JoinTable(
        name = "lider_escala_especialidade",
        joinColumns = @JoinColumn(name = "lider_escala_id"),
        inverseJoinColumns = @JoinColumn(name = "especialidade_id")
    )
    private List<Especialidade> especialidades = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "vinculo_id", nullable = false)
    private Vinculo vinculo;

    @OneToMany(mappedBy = "liderEscala")
    private List<Escala> escalas = new ArrayList<>();
}