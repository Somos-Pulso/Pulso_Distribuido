package web.pulso.mappers;

import org.springframework.stereotype.Component;
import web.pulso.dtos.request.PessoaRequestDTO;
import web.pulso.dtos.response.PessoaResponseDTO;
import web.pulso.dtos.response.UsuarioSimpleResponseDTO;
import web.pulso.dtos.response.ProfissionalSimpleResponseDTO;
import web.pulso.dtos.response.LiderEscalaSimpleResponseDTO;
import web.pulso.models.Pessoa;

@Component
public class PessoaMapper {

    public PessoaResponseDTO toResponseDTO(Pessoa pessoa) {
        if (pessoa == null) {
            return null;
        }

        PessoaResponseDTO dto = new PessoaResponseDTO();
        dto.setId(pessoa.getId());
        dto.setNome(pessoa.getNome());
        dto.setEmail(pessoa.getEmail());
        dto.setTelefone(pessoa.getTelefone());
        dto.setFotoPerfil(pessoa.getFotoPerfil());

        // Mapear usuario sem referências circulares
        if (pessoa.getUsuario() != null) {
            UsuarioSimpleResponseDTO usuarioDTO = new UsuarioSimpleResponseDTO();
            usuarioDTO.setId(pessoa.getUsuario().getId());
            usuarioDTO.setMatricula(pessoa.getUsuario().getMatricula());
            usuarioDTO.setAtivo(pessoa.getUsuario().getAtivo());
            dto.setUsuario(usuarioDTO);
        }

        // Mapear profissional sem referências circulares
        if (pessoa.getProfissional() != null) {
            ProfissionalSimpleResponseDTO profissionalDTO = new ProfissionalSimpleResponseDTO();
            profissionalDTO.setId(pessoa.getProfissional().getId());
            profissionalDTO.setCrm(pessoa.getProfissional().getCrm());
            if (pessoa.getProfissional().getEspecialidade() != null) {
                profissionalDTO.setEspecialidadeNome(pessoa.getProfissional().getEspecialidade().getNome());
            }
            dto.setProfissional(profissionalDTO);
        }

        // Mapear lider escala sem referências circulares
        if (pessoa.getLiderEscala() != null) {
            LiderEscalaSimpleResponseDTO liderDTO = new LiderEscalaSimpleResponseDTO();
            liderDTO.setId(pessoa.getLiderEscala().getId());
            if (pessoa.getLiderEscala().getEspecialidade() != null) {
                liderDTO.setEspecialidadeNome(pessoa.getLiderEscala().getEspecialidade().getNome());
            }
            dto.setLiderEscala(liderDTO);
        }

        return dto;
    }

    public Pessoa toEntity(PessoaRequestDTO requestDTO) {
        if (requestDTO == null) {
            return null;
        }

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(requestDTO.getNome());
        pessoa.setEmail(requestDTO.getEmail());
        pessoa.setTelefone(requestDTO.getTelefone());
        pessoa.setFotoPerfil(requestDTO.getFotoPerfil());

        // Definir apenas a referência do usuário por ID
        if (requestDTO.getUsuarioId() != null) {
            web.pulso.models.Usuario usuario = new web.pulso.models.Usuario();
            usuario.setId(requestDTO.getUsuarioId());
            pessoa.setUsuario(usuario);
        }

        return pessoa;
    }
}