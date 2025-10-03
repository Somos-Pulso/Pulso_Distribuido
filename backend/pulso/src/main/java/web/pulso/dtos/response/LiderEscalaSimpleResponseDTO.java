package web.pulso.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LiderEscalaSimpleResponseDTO {
    private Long id;
    private String especialidadeNome;
}