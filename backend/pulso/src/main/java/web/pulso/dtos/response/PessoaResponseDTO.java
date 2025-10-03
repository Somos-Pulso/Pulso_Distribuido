package web.pulso.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String fotoPerfil;
    
   
}