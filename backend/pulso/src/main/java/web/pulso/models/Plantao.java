package web.pulso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import web.pulso.models.enums.FormaPagamento;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "plantoes")
public class Plantao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hora_entrada")
    private Date horaEntrada;
    
    @Column(name = "hora_saida")
    private Date horaSaida;
    
    @Column(name = "valor_estimado")
    private Double valorEstimado;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pagamento")
    private FormaPagamento formaPagamento;
    
    @Column(name = "data_pagamento")
    private Date dataPagamento;
    
    private String comentario;
    
    @Column(name = "quantidade_profissionais")
    private Integer quantidadeProfissionais;

    @ManyToOne
    @JoinColumn(name = "escala_id")
    private Escala escala;

    @ManyToOne
    @JoinColumn(name = "profissional_id")
    private Usuario profissional;


}