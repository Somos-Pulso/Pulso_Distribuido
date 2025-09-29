package web.pulso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import web.pulso.models.enums.TipoNotificacao;
import web.pulso.models.enums.StatusNotificacao;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "notificacoes")
public class Notificacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String conteudo;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_notificacao")
    private TipoNotificacao tipoNotificacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_notificacao")
    private StatusNotificacao statusNotificacao;

    @ManyToOne
    @JoinColumn(name = "destinatario_id")
    private Usuario destinatario;

    @ManyToOne
    @JoinColumn(name = "remetente_id")
    private Usuario remetente;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Column(name = "data_leitura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataLeitura;



    @PrePersist
    protected void onCreate() {
        dataCriacao = new Date();
        statusNotificacao = StatusNotificacao.PENDENTE;
    }
}