package web.pulso.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioSimpleResponseDTO {
    private Long id;
    private String matricula;
    private Boolean ativo;
}