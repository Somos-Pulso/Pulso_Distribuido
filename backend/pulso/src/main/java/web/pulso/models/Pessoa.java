package web.pulso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pessoas")
public class Pessoa {

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

    // Relacionamentos
    @OneToOne(mappedBy = "pessoa")
    private LiderEscala liderEscala;

    @OneToOne(mappedBy = "pessoa")
    private Profissional profissional;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}