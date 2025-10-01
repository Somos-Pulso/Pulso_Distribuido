package web.pulso.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import web.pulso.models.enums.TipoPix;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Profissional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "pessoa_id", nullable = false)
    private Pessoa pessoa;

    @Column(name = "ano_formacao", nullable = false)
    private LocalDate anoFormacao;

    @Column(nullable = false)
    private String pix;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pix", nullable = false)
    private TipoPix tipoPix;

    @Column(nullable = false)
    private String crm;

    @Column(name = "data_nasc", nullable = false)
    private LocalDate dataNasc;

    @OneToMany(mappedBy = "profissional")
    private List<Vinculo> vinculos;

    // Um profissional tem UMA especialidade principal
    @ManyToOne
    @JoinColumn(name = "especialidade_id", nullable = false)
    private Especialidade especialidade;

    @OneToMany(mappedBy = "profissional")
    private List<Troca> trocas;

    @OneToMany(mappedBy = "profissional")
    private List<Alocacao> alocacoes;
}