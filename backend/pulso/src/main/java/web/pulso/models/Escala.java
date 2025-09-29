package web.pulso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import web.pulso.models.enums.StatusEscala;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "escalas")
public class Escala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    
    @Column(name = "mes_referencia")
    private Date mesReferencia;
    
    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    
    @Column(name = "data_publicacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPublicacao;

    @Enumerated(EnumType.STRING)
    private StatusEscala status;

    @ManyToOne
    @JoinColumn(name = "lider_escala_id")
    private Usuario liderEscala;

    @ManyToOne
    @JoinColumn(name = "setor_id")
    private Setor setor;


}