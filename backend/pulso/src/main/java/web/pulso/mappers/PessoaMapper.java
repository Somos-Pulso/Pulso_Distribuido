package web.pulso.mappers;

import org.springframework.stereotype.Component;
import web.pulso.dtos.request.PessoaRequestDTO;
import web.pulso.dtos.response.PessoaResponseDTO;
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