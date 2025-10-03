package web.pulso.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InstituicaoSimpleResponseDTO {
    
    private Long id;
    private String nome;
    private String email;
}