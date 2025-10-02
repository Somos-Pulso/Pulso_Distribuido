package web.pulso.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.pulso.models.Instituicao;
import web.pulso.repository.InstituicaoRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/instituicoes")
public class InstituicaoController {

    private final InstituicaoRepository instituicaoRepository;

    public InstituicaoController(InstituicaoRepository instituicaoRepository) {
        this.instituicaoRepository = instituicaoRepository;
    }

    @PostMapping
    public ResponseEntity<Instituicao> criarInstituicao(@RequestBody Instituicao instituicao) {
        Instituicao instituicaoSalva = instituicaoRepository.save(instituicao);
        return ResponseEntity.status(HttpStatus.CREATED).body(instituicaoSalva);
    }

    @GetMapping
    public ResponseEntity<List<Instituicao>> listarInstituicoes() {
        List<Instituicao> instituicoes = instituicaoRepository.findAll();
        return ResponseEntity.ok(instituicoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Instituicao> buscarPorId(@PathVariable Long id) {
        Optional<Instituicao> instituicao = instituicaoRepository.findById(id);
        return instituicao.map(ResponseEntity::ok)
                         .orElse(ResponseEntity.notFound().build());
    }
}