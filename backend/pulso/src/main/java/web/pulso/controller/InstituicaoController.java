package web.pulso.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.pulso.models.Instituicao;
import web.pulso.service.InstituicaoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/instituicoes")
public class InstituicaoController {

    private final InstituicaoService instituicaoService;

    public InstituicaoController(InstituicaoService instituicaoService) {
        this.instituicaoService = instituicaoService;
    }

    @PostMapping
    public ResponseEntity<Instituicao> criarInstituicao(@RequestBody Instituicao instituicao) {
        Instituicao instituicaoSalva = instituicaoService.salvar(instituicao);
        return ResponseEntity.status(HttpStatus.CREATED).body(instituicaoSalva);
    }

    @GetMapping
    public ResponseEntity<List<Instituicao>> listarInstituicoes() {
        List<Instituicao> instituicoes = instituicaoService.listarTodas();
        return ResponseEntity.ok(instituicoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Instituicao> buscarPorId(@PathVariable Long id) {
        Optional<Instituicao> instituicao = instituicaoService.buscarPorId(id);
        return instituicao.map(ResponseEntity::ok)
                         .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        instituicaoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}