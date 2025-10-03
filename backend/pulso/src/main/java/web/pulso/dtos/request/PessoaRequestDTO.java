package web.pulso.dtos.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaRequestDTO {
    private String nome;
    private String email;
    private String telefone;
    private String fotoPerfil;
    private Long usuarioId; // FK para o usuario responsável pelos dados da pessoa
}