package web.pulso.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.pulso.dtos.request.EspecialidadeRequestDTO;
import web.pulso.dtos.response.EspecialidadeResponseDTO;
import web.pulso.mappers.EspecialidadeMapper;
import web.pulso.models.Especialidade;
import web.pulso.service.EspecialidadeService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/especialidades")
public class EspecialidadeController {

    private final EspecialidadeService especialidadeService;

    public EspecialidadeController(EspecialidadeService especialidadeService) {
        this.especialidadeService = especialidadeService;
    }

    @PostMapping
    public ResponseEntity<EspecialidadeResponseDTO> criarEspecialidade(@RequestBody EspecialidadeRequestDTO especialidadeRequestDTO) {
        Especialidade especialidade = EspecialidadeMapper.toEntity(especialidadeRequestDTO);
        Especialidade especialidadeSalva = especialidadeService.salvar(especialidade);
        EspecialidadeResponseDTO responseDTO = EspecialidadeMapper.toResponseDTO(especialidadeSalva);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }

    @GetMapping
    public ResponseEntity<List<EspecialidadeResponseDTO>> listarEspecialidades() {
        List<Especialidade> especialidades = especialidadeService.listarTodas();
        List<EspecialidadeResponseDTO> responseDTOs = especialidades.stream()
                .map(EspecialidadeMapper::toResponseDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(responseDTOs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EspecialidadeResponseDTO> buscarPorId(@PathVariable Long id) {
        Optional<Especialidade> especialidade = especialidadeService.buscarPorId(id);
        return especialidade.map(esp -> ResponseEntity.ok(EspecialidadeMapper.toResponseDTO(esp)))
                           .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        especialidadeService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}