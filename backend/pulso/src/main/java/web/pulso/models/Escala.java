package web.pulso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import web.pulso.models.enums.StatusEscala;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Escala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(name = "mes_referencia", nullable = false)
    private LocalDate mesReferencia;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusEscala status;

    @Column(name = "data_criacao", nullable = false)
    private LocalDateTime dataCriacao;

    @Column(name = "data_atualizacao", nullable = false)
    private LocalDateTime dataAtualizacao;

    @ManyToOne
    @JoinColumn(name = "setor_id", nullable = false)//uma ou mais escalas estão associadas a um setor
    private Setor setor;

    @ManyToOne
    @JoinColumn(name = "lider_escala_id", nullable = false) //uma ou mais escalas estão associadas a um líder de escala
    private LiderEscala liderEscala;

    @OneToMany(mappedBy = "escala") //uma escala pode ter muitos plantões
    private List<Plantao> plantoes;
}