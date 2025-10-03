package web.pulso.dtos.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
public class EspecialidadeResponseDTO {
    
    private Long id;
    private String nome;
    
    // DTOs simples para evitar referências circulares
    private List<SetorSimpleResponseDTO> setores;
    private List<LiderEscalaSimpleResponseDTO> lideresEscala;
    private List<ProfissionalSimpleResponseDTO> profissionais;
}