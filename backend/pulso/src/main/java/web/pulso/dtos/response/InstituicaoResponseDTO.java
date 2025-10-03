package web.pulso.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstituicaoResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String fotoPerfil;
    private String endereco;
    private String cnpj;
    private Boolean exigeVinculo;
    
    
}