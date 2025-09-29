package web.pulso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String matricula;
    private String email;
    private String telefone;
    private String fotoPerfil;
    private String senha;
    private Boolean ativo;
    
    @Column(name = "ultimo_login")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimoLogin;
    
    @Column(name = "criado_em")
    @Temporal(TemporalType.TIMESTAMP)
    private Date criadoEm;
    
    @Column(name = "atualizado_em")
    @Temporal(TemporalType.TIMESTAMP)
    private Date atualizadoEm;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<Vinculo> vinculos;

    @OneToMany(mappedBy = "liderEscala", fetch = FetchType.LAZY)
    private List<Escala> escalasLideradas;

    @PrePersist
    protected void onCreate() {
        criadoEm = new Date();
        atualizadoEm = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        atualizadoEm = new Date();
    }


}