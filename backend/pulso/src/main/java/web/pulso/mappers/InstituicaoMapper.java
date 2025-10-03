package web.pulso.mappers;

import web.pulso.dtos.request.InstituicaoRequestDTO;
import web.pulso.dtos.response.*;
import web.pulso.models.Instituicao;
import web.pulso.models.Setor;
import web.pulso.models.Vinculo;
import java.util.stream.Collectors;

public class InstituicaoMapper {
    
    public static InstituicaoResponseDTO toResponseDTO(Instituicao instituicao) {
        if (instituicao == null) {
            return null;
        }
        
        InstituicaoResponseDTO dto = new InstituicaoResponseDTO();
        dto.setId(instituicao.getId());
        dto.setNome(instituicao.getNome());
        dto.setEmail(instituicao.getEmail());
        dto.setTelefone(instituicao.getTelefone());
        dto.setFotoPerfil(instituicao.getFotoPerfil());
        dto.setEndereco(instituicao.getEndereco());
        dto.setCnpj(instituicao.getCnpj());
        dto.setExigeVinculo(instituicao.getExigeVinculo());
        
        // Mapear relacionamentos para DTOs simples
        if (instituicao.getVinculos() != null) {
            dto.setVinculos(instituicao.getVinculos().stream()
                .map(InstituicaoMapper::toVinculoSimpleDTO)
                .collect(Collectors.toList()));
        }
        
        if (instituicao.getSetores() != null) {
            dto.setSetores(instituicao.getSetores().stream()
                .map(InstituicaoMapper::toSetorSimpleDTO)
                .collect(Collectors.toList()));
        }
        
        if (instituicao.getUsuario() != null) {
            dto.setUsuario(toUsuarioSimpleDTO(instituicao.getUsuario()));
        }
        
        return dto;
    }
    
    public static Instituicao toEntity(InstituicaoRequestDTO dto) {
        if (dto == null) {
            return null;
        }
        
        Instituicao instituicao = new Instituicao();
        instituicao.setNome(dto.getNome());
        instituicao.setEmail(dto.getEmail());
        instituicao.setTelefone(dto.getTelefone());
        instituicao.setFotoPerfil(dto.getFotoPerfil());
        instituicao.setEndereco(dto.getEndereco());
        instituicao.setCnpj(dto.getCnpj());
        instituicao.setExigeVinculo(dto.getExigeVinculo());
        
        // Definir apenas a referência do usuário por ID
        if (dto.getUsuarioId() != null) {
            web.pulso.models.Usuario usuario = new web.pulso.models.Usuario();
            usuario.setId(dto.getUsuarioId());
            instituicao.setUsuario(usuario);
        }
        
        return instituicao;
    }
    
    private static VinculoSimpleResponseDTO toVinculoSimpleDTO(Vinculo vinculo) {
        if (vinculo == null) {
            return null;
        }
        
        VinculoSimpleResponseDTO dto = new VinculoSimpleResponseDTO();
        dto.setId(vinculo.getId());
        dto.setTipoVinculo(vinculo.getTipoVinculo());
        
        return dto;
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
    
    private static UsuarioSimpleResponseDTO toUsuarioSimpleDTO(web.pulso.models.Usuario usuario) {
        if (usuario == null) {
            return null;
        }
        
        UsuarioSimpleResponseDTO dto = new UsuarioSimpleResponseDTO();
        dto.setId(usuario.getId());
        dto.setMatricula(usuario.getMatricula());
        dto.setAtivo(usuario.getAtivo());
        
        return dto;
    }
}