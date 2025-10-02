package web.pulso.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.pulso.models.Especialidade;
import web.pulso.repository.EspecialidadeRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/especialidades")
public class EspecialidadeController {

    private final EspecialidadeRepository especialidadeRepository;

    public EspecialidadeController(EspecialidadeRepository especialidadeRepository) {
        this.especialidadeRepository = especialidadeRepository;
    }

    @PostMapping
    public ResponseEntity<Especialidade> criarEspecialidade(@RequestBody Especialidade especialidade) {
        Especialidade especialidadeSalva = especialidadeRepository.save(especialidade);
        return ResponseEntity.status(HttpStatus.CREATED).body(especialidadeSalva);
    }

    @GetMapping
    public ResponseEntity<List<Especialidade>> listarEspecialidades() {
        List<Especialidade> especialidades = especialidadeRepository.findAll();
        return ResponseEntity.ok(especialidades);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Especialidade> buscarPorId(@PathVariable Long id) {
        Optional<Especialidade> especialidade = especialidadeRepository.findById(id);
        return especialidade.map(ResponseEntity::ok)
                           .orElse(ResponseEntity.notFound().build());
    }
}