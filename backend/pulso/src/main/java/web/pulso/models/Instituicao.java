package web.pulso.models;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "instituicoes")
public class Instituicao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String email;
    
    private String telefone;
    
    @Column(name = "foto_perfil")
    private String fotoPerfil;
    
    private String endereco;
    
    private String cnpj;
    
    @Column(name = "exige_vinculo")
    private Boolean exigeVinculo;

    @OneToMany(mappedBy = "instituicao", fetch = FetchType.LAZY) //uma instituição pode ter muitos vínculos
    private List<Vinculo> vinculos;

    @OneToMany(mappedBy = "instituicao", fetch = FetchType.LAZY)
    private List<Setor> setores;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}