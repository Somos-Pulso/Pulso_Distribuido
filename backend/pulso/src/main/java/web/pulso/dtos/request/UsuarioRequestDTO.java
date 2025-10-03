package web.pulso.dtos.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequestDTO {
    private String matricula;
    private String senha;
    private Boolean ativo;
    private Date ultimoLogin;
}