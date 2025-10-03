package web.pulso.mappers;

import org.springframework.stereotype.Component;
import web.pulso.dtos.request.UsuarioRequestDTO;
import web.pulso.dtos.response.UsuarioResponseDTO;
import web.pulso.models.Usuario;

@Component
public class UsuarioMapper {

    public UsuarioResponseDTO toResponseDTO(Usuario usuario) {
        if (usuario == null) {
            return null;
        }

        UsuarioResponseDTO dto = new UsuarioResponseDTO();
        dto.setId(usuario.getId());
        dto.setMatricula(usuario.getMatricula());
        dto.setAtivo(usuario.getAtivo());
        dto.setUltimoLogin(usuario.getUltimoLogin());
        dto.setCriadoEm(usuario.getCriadoEm());
        dto.setAtualizadoEm(usuario.getAtualizadoEm());

        return dto;
    }

    public Usuario toEntity(UsuarioRequestDTO requestDTO) {
        if (requestDTO == null) {
            return null;
        }

        Usuario usuario = new Usuario();
        usuario.setMatricula(requestDTO.getMatricula());
        usuario.setSenha(requestDTO.getSenha());
        usuario.setAtivo(requestDTO.getAtivo());
        usuario.setUltimoLogin(requestDTO.getUltimoLogin());

        

        return usuario;
    }
}