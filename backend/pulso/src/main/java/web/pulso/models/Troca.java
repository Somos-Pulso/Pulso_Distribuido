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

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public TipoTroca getTipoTroca() {
        return tipoTroca;
    }

    public void setTipoTroca(TipoTroca tipoTroca) {
        this.tipoTroca = tipoTroca;
    }

    public StatusTroca getStatus() {
        return status;
    }

    public void setStatus(StatusTroca status) {
        this.status = status;
    }

    public Plantao getPlantao() {
        return plantao;
    }

    public void setPlantao(Plantao plantao) {
        this.plantao = plantao;
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }

    public Usuario getInteressado() {
        return interessado;
    }

    public void setInteressado(Usuario interessado) {
        this.interessado = interessado;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @PrePersist
    protected void onCreate() {
        dataCriacao = new Date();
    }
}