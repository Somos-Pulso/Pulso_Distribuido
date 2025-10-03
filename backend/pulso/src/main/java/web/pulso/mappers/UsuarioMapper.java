package web.pulso.mappers;

import org.springframework.stereotype.Component;
import web.pulso.dtos.request.UsuarioRequestDTO;
import web.pulso.dtos.response.UsuarioResponseDTO;
import web.pulso.dtos.response.PessoaResponseDTO;
import web.pulso.dtos.response.InstituicaoResponseDTO;
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

        // Mapear pessoa sem referências circulares
        if (usuario.getPessoa() != null) {
            PessoaResponseDTO pessoaDTO = new PessoaResponseDTO();
            pessoaDTO.setId(usuario.getPessoa().getId());
            pessoaDTO.setNome(usuario.getPessoa().getNome());
            pessoaDTO.setEmail(usuario.getPessoa().getEmail());
            pessoaDTO.setTelefone(usuario.getPessoa().getTelefone());
            pessoaDTO.setFotoPerfil(usuario.getPessoa().getFotoPerfil());
            dto.setPessoa(pessoaDTO);
        }

        // Mapear instituição sem referências circulares
        if (usuario.getInstituicao() != null) {
            InstituicaoResponseDTO instituicaoDTO = new InstituicaoResponseDTO();
            instituicaoDTO.setId(usuario.getInstituicao().getId());
            instituicaoDTO.setNome(usuario.getInstituicao().getNome());
            instituicaoDTO.setEmail(usuario.getInstituicao().getEmail());
            instituicaoDTO.setTelefone(usuario.getInstituicao().getTelefone());
            instituicaoDTO.setFotoPerfil(usuario.getInstituicao().getFotoPerfil());
            instituicaoDTO.setEndereco(usuario.getInstituicao().getEndereco());
            instituicaoDTO.setCnpj(usuario.getInstituicao().getCnpj());
            instituicaoDTO.setExigeVinculo(usuario.getInstituicao().getExigeVinculo());
            dto.setInstituicao(instituicaoDTO);
        }

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

        // Para criação/atualização, não precisa mais definir pessoa
        // A pessoa será criada separadamente com referência ao usuário

        return usuario;
    }
}