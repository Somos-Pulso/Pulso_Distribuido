package web.pulso.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.pulso.dtos.request.InstituicaoRequestDTO;
import web.pulso.dtos.response.InstituicaoResponseDTO;
import web.pulso.mappers.InstituicaoMapper;
import web.pulso.models.Instituicao;
import web.pulso.service.InstituicaoService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/instituicoes")
public class InstituicaoController {

    private final InstituicaoService instituicaoService;

    public InstituicaoController(InstituicaoService instituicaoService) {
        this.instituicaoService = instituicaoService;
    }

    @PostMapping
    public ResponseEntity<InstituicaoResponseDTO> criarInstituicao(@RequestBody InstituicaoRequestDTO instituicaoRequestDTO) {
        Instituicao instituicao = InstituicaoMapper.toEntity(instituicaoRequestDTO);
        Instituicao instituicaoSalva = instituicaoService.salvar(instituicao);
        InstituicaoResponseDTO responseDTO = InstituicaoMapper.toResponseDTO(instituicaoSalva);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

    @GetMapping
    public ResponseEntity<List<InstituicaoResponseDTO>> listarInstituicoes() {
        List<Instituicao> instituicoes = instituicaoService.listarTodas();
        List<InstituicaoResponseDTO> responseDTOs = instituicoes.stream()
                .map(InstituicaoMapper::toResponseDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(responseDTOs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InstituicaoResponseDTO> buscarPorId(@PathVariable Long id) {
        Optional<Instituicao> instituicao = instituicaoService.buscarPorId(id);
        return instituicao.map(inst -> ResponseEntity.ok(InstituicaoMapper.toResponseDTO(inst)))
                         .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        instituicaoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}