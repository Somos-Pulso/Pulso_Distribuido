package web.pulso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.pulso.models.Setor;
import web.pulso.models.Instituicao;
import java.util.List;
import java.util.Optional;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long> {
    
    Optional<Setor> findByNome(String nome);
    List<Setor> findByInstituicao(Instituicao instituicao);
    List<Setor> findByInstituicaoId(Long instituicaoId);
    List<Setor> findByNomeContainingIgnoreCase(String nome);
    
}