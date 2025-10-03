package web.pulso.mappers;

import web.pulso.dtos.request.EspecialidadeRequestDTO;
import web.pulso.dtos.response.EspecialidadeResponseDTO;
import web.pulso.models.Especialidade;

public class EspecialidadeMapper {
    
    public static EspecialidadeResponseDTO toResponseDTO(Especialidade especialidade) {
        if (especialidade == null) {
            return null;
        }
        
        EspecialidadeResponseDTO dto = new EspecialidadeResponseDTO();
        dto.setId(especialidade.getId());
        dto.setNome(especialidade.getNome());
        
        return dto;
    }
    
    public static Especialidade toEntity(EspecialidadeRequestDTO dto) {
        if (dto == null) {
            return null;
        }
        
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(dto.getNome());
        
        return especialidade;
    }
}