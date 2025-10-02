package web.pulso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.pulso.models.Profissional;
import web.pulso.models.Especialidade;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
    
    Optional<Profissional> findByCrm(String crm);
    Optional<Profissional> findByPessoaEmail(String email);
    List<Profissional> findByEspecialidade(Especialidade especialidade);
    List<Profissional> findByEspecialidadeId(Long especialidadeId);
    
}