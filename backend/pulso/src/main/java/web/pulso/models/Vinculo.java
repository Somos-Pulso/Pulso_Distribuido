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

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "instituicao_id")
    private Instituicao instituicao;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_vinculo")
    private TipoVinculo tipoVinculo;


}