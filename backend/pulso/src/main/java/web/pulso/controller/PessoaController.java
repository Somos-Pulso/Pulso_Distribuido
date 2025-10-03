package web.pulso.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.pulso.dtos.request.PessoaRequestDTO;
import web.pulso.dtos.response.PessoaResponseDTO;
import web.pulso.models.Pessoa;
import web.pulso.service.PessoaService;
import web.pulso.mappers.PessoaMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;
    private final PessoaMapper pessoaMapper;

    public PessoaController(PessoaService pessoaService, PessoaMapper pessoaMapper) {
        this.pessoaService = pessoaService;
        this.pessoaMapper = pessoaMapper;
    }

    @PostMapping
    public ResponseEntity<PessoaResponseDTO> criarPessoa(@RequestBody PessoaRequestDTO pessoaRequestDTO) {
        Pessoa pessoa = pessoaMapper.toEntity(pessoaRequestDTO);
        Pessoa pessoaSalva = pessoaService.salvar(pessoa);
        PessoaResponseDTO pessoaResponseDTO = pessoaMapper.toResponseDTO(pessoaSalva);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaResponseDTO);
    }

    @GetMapping
    public ResponseEntity<List<PessoaResponseDTO>> listarPessoas() {
        List<Pessoa> pessoas = pessoaService.listarTodas();
        List<PessoaResponseDTO> pessoasResponseDTO = pessoas.stream()
                .map(pessoaMapper::toResponseDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(pessoasResponseDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaResponseDTO> buscarPorId(@PathVariable Long id) {
        Optional<Pessoa> pessoa = pessoaService.buscarPorId(id);
        return pessoa.map(p -> ResponseEntity.ok(pessoaMapper.toResponseDTO(p)))
                    .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        pessoaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}