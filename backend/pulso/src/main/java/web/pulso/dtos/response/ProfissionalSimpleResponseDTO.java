package web.pulso.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfissionalSimpleResponseDTO {
    private Long id;
    private String crm;
    private String especialidadeNome;
}