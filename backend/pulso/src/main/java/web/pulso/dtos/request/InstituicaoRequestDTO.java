package web.pulso.dtos.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InstituicaoRequestDTO {
    
    private String nome;
    private String email;
    private String telefone;
    private String fotoPerfil;
    private String endereco;
    private String cnpj;
    private Boolean exigeVinculo;
    private Long usuarioId; // FK para o usuario responsável pela instituição
}