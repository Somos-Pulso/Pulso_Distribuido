package web.pulso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import web.pulso.models.enums.TipoVinculo;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vinculos")
public class Vinculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_vinculo", nullable = false) //enum com os tipos de vínculo CLT/PJ
    private TipoVinculo tipoVinculo;

    @ManyToOne
    @JoinColumn(name = "instituicao_id", nullable = false) //tem que ter uma instituição associada
    private Instituicao instituicao;

    @OneToOne(mappedBy = "vinculo")//um vínculo está associado a um líder de escala
    private LiderEscala liderEscala;

    @ManyToOne
    @JoinColumn(name = "profissional_id", nullable = false) //um vínculo está associado a um profissional
    private Profissional profissional;
}