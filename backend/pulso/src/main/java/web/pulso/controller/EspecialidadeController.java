package web.pulso.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.pulso.models.Especialidade;
import web.pulso.service.EspecialidadeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/especialidades")
public class EspecialidadeController {

    private final EspecialidadeService especialidadeService;

    public EspecialidadeController(EspecialidadeService especialidadeService) {
        this.especialidadeService = especialidadeService;
    }

    @PostMapping
    public ResponseEntity<Especialidade> criarEspecialidade(@RequestBody Especialidade especialidade) {
        Especialidade especialidadeSalva = especialidadeService.salvar(especialidade);
        return ResponseEntity.status(HttpStatus.CREATED).body(especialidadeSalva);
    }

    @GetMapping
    public ResponseEntity<List<Especialidade>> listarEspecialidades() {
        List<Especialidade> especialidades = especialidadeService.listarTodas();
        return ResponseEntity.ok(especialidades);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Especialidade> buscarPorId(@PathVariable Long id) {
        Optional<Especialidade> especialidade = especialidadeService.buscarPorId(id);
        return especialidade.map(ResponseEntity::ok)
                           .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEspecialidade(@PathVariable Long id) {
        if (especialidadeService.buscarPorId(id).isPresent()) {
            especialidadeService.deletar(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}