package web.pulso.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "instituicoes")
public class Instituicao extends Usuario {
    
    private String endereco;
    
    private String cnpj;
    
    @Column(name = "exige_vinculo")
    private Boolean exigeVinculo;

    @OneToMany(mappedBy = "instituicao", fetch = FetchType.LAZY) //uma instituição pode ter muitos vínculos
    private List<Vinculo> vinculos;

    @OneToMany(mappedBy = "instituicao", fetch = FetchType.LAZY)
    private List<Setor> setores;
}