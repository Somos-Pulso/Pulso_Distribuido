package web.pulso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import web.pulso.models.enums.StatusTroca;
import web.pulso.models.enums.TipoTroca;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Troca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 1000)
    private String comentario;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoTroca tipo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusTroca status;

    @ManyToOne
    @JoinColumn(name = "profissional_id", nullable = false)
    private Profissional profissional;

    @ManyToOne
    @JoinColumn(name = "plantao_id", nullable = false)
    private Plantao plantao;
}