package web.pulso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import web.pulso.models.enums.TipoTroca;
import web.pulso.models.enums.StatusTroca;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "trocas")
public class Troca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comentario;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_troca")
    private TipoTroca tipoTroca;

    @Enumerated(EnumType.STRING)
    private StatusTroca status;

    @ManyToOne
    @JoinColumn(name = "plantao_id")
    private Plantao plantao;

    @ManyToOne
    @JoinColumn(name = "solicitante_id")
    private Usuario solicitante;

    @ManyToOne
    @JoinColumn(name = "interessado_id")
    private Usuario interessado;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;



    @PrePersist
    protected void onCreate() {
        dataCriacao = new Date();
    }
}