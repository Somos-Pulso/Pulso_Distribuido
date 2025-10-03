package web.pulso.mappers;

import web.pulso.dtos.request.InstituicaoRequestDTO;
import web.pulso.dtos.response.InstituicaoResponseDTO;
import web.pulso.models.Instituicao;
import web.pulso.models.Usuario;

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
        
    
        if (dto.getUsuarioId() != null) {

            Usuario usuario = new Usuario();
            usuario.setId(dto.getUsuarioId());
            instituicao.setUsuario(usuario);
        }
        
        return instituicao;
    }
}