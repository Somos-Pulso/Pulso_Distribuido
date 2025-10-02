package web.pulso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.pulso.models.LiderEscala;
import web.pulso.models.Especialidade;
import java.util.List;
import java.util.Optional;

@Repository
public interface LiderEscalaRepository extends JpaRepository<LiderEscala, Long> {
    
    Optional<LiderEscala> findByPessoaEmail(String email);
    List<LiderEscala> findByEspecialidade(Especialidade especialidade);
    List<LiderEscala> findByEspecialidadeId(Long especialidadeId);
    Optional<LiderEscala> findByVinculoId(Long vinculoId);
    
}