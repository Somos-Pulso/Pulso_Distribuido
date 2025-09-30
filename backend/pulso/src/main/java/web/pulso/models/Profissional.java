package web.pulso.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import web.pulso.models.enums.TipoPix;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = true) //Dois profissionais seriam 
//considerados iguais se tivessem o mesmo crm e anoFormacao, 
//mesmo que tivessem id e email diferentes(herdados de Usuario)
@NoArgsConstructor
public class Profissional extends Usuario {

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

    @ManyToMany
    @JoinTable(
        name = "profissional_especialidade",
        joinColumns = @JoinColumn(name = "profissional_id"),
        inverseJoinColumns = @JoinColumn(name = "especialidade_id")//relação many to many precisa de uma tabela intermediária
    )
    private Set<Especialidade> especialidades; // set é uma interface tipo list, só que não permite elementos duplicados

    @OneToMany(mappedBy = "profissional")
    private List<Troca> trocas;

    @OneToMany(mappedBy = "profissional")
    private List<Alocacao> alocacoes;
}