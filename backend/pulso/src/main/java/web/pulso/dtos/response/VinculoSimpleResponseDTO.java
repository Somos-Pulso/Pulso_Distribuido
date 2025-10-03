package web.pulso.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import web.pulso.models.enums.TipoVinculo;

@Data
@NoArgsConstructor
public class VinculoSimpleResponseDTO {
    
    private Long id;
    private TipoVinculo tipoVinculo;
}