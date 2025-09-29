package web.pulso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "instituicoes")
public class Instituicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String endereco;
    private String cnpj;
    
    @Column(name = "exige_vinculo")
    private Boolean exigeVinculo;

    @OneToMany(mappedBy = "instituicao", fetch = FetchType.LAZY)
    private List<Vinculo> vinculos;

    @OneToMany(mappedBy = "instituicao", fetch = FetchType.LAZY)
    private List<Setor> setores;


}