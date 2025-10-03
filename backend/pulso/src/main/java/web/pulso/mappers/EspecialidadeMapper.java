package web.pulso.mappers;

import web.pulso.dtos.request.EspecialidadeRequestDTO;
import web.pulso.dtos.response.*;
import web.pulso.models.Especialidade;
import web.pulso.models.Setor;
import web.pulso.models.LiderEscala;
import web.pulso.models.Profissional;
import java.util.stream.Collectors;

public class EspecialidadeMapper {
    
    public static EspecialidadeResponseDTO toResponseDTO(Especialidade especialidade) {
        if (especialidade == null) {
            return null;
        }
        
        EspecialidadeResponseDTO dto = new EspecialidadeResponseDTO();
        dto.setId(especialidade.getId());
        dto.setNome(especialidade.getNome());

        // Mapear relacionamentos para os DTOS
        if (especialidade.getSetores() != null) {
            dto.setSetores(especialidade.getSetores().stream()
                .map(EspecialidadeMapper::toSetorSimpleDTO)
                .collect(Collectors.toList()));
        }
        
        if (especialidade.getLideresEscala() != null) {
            dto.setLideresEscala(especialidade.getLideresEscala().stream()
                .map(EspecialidadeMapper::toLiderEscalaSimpleDTO)
                .collect(Collectors.toList()));
        }
        
        if (especialidade.getProfissionais() != null) {
            dto.setProfissionais(especialidade.getProfissionais().stream()
                .map(EspecialidadeMapper::toProfissionalSimpleDTO)
                .collect(Collectors.toList()));
        }
        
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
    
    private static SetorSimpleResponseDTO toSetorSimpleDTO(Setor setor) {
        if (setor == null) {
            return null;
        }
        
        SetorSimpleResponseDTO dto = new SetorSimpleResponseDTO();
        dto.setId(setor.getId());
        dto.setNome(setor.getNome());
        
        return dto;
    }
    
    private static LiderEscalaSimpleResponseDTO toLiderEscalaSimpleDTO(LiderEscala liderEscala) {
        if (liderEscala == null) {
            return null;
        }
        
        LiderEscalaSimpleResponseDTO dto = new LiderEscalaSimpleResponseDTO();
        dto.setId(liderEscala.getId());
        if (liderEscala.getEspecialidade() != null) {
            dto.setEspecialidadeNome(liderEscala.getEspecialidade().getNome());
        }
        
        return dto;
    }
    
    private static ProfissionalSimpleResponseDTO toProfissionalSimpleDTO(Profissional profissional) {
        if (profissional == null) {
            return null;
        }
        
        ProfissionalSimpleResponseDTO dto = new ProfissionalSimpleResponseDTO();
        dto.setId(profissional.getId());
        dto.setCrm(profissional.getCrm());
        if (profissional.getEspecialidade() != null) {
            dto.setEspecialidadeNome(profissional.getEspecialidade().getNome());
        }
        
        return dto;
    }
}