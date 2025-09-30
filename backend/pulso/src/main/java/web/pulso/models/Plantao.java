package web.pulso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import web.pulso.models.enums.FormaPagamento;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plantao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hora_entrada", nullable = false)
    private LocalDateTime horaEntrada;

    @Column(name = "hora_saida", nullable = false)
    private LocalDateTime horaSaida;

    @Column(name = "estimativa_valor", nullable = false)
    private int estimativaValor;

    @Enumerated(EnumType.STRING)
    @Column(name = "forma_pagamento", nullable = false)
    private FormaPagamento formaPagamento;

    @Column(name = "estimativa_pagamento", nullable = false)
    private LocalDate estimativaPagamento;

    @Column(length = 1000)
    private String comentario;

    @Column(name = "quantidade_profissionais", nullable = false)
    private Integer quantidadeProfissionais;

    @Column(name = "data_criacao", nullable = false)
    private LocalDateTime dataCriacao;

    @Column(name = "data_atualizacao", nullable = false)
    private LocalDateTime dataAtualizacao;

    @ManyToOne
    @JoinColumn(name = "escala_id", nullable = false)
    private Escala escala;

    @OneToMany(mappedBy = "plantao")
    private List<Alocacao> alocacoes;

    @OneToMany(mappedBy = "plantao")
    private List<Troca> trocas;
}