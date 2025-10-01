package web.pulso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String matricula;
    private String email;
    private String telefone;
    
    @Column(name = "foto_perfil") //tratar conversão de camelcase para o banco de dados
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

    @PrePersist
    protected void onCreate() { // Define data de criação e atualização ao persistir
        criadoEm = new Date();
        atualizadoEm = new Date();
    }

    @PreUpdate
    protected void onUpdate() { // Atualiza a data de atualização ao modificar
        atualizadoEm = new Date();
    }
}