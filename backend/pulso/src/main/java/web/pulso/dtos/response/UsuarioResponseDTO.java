package web.pulso.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioResponseDTO {
    private Long id;
    private String matricula;
    private Boolean ativo;
    private Date ultimoLogin;
    private Date criadoEm;
    private Date atualizadoEm;
    
   
}