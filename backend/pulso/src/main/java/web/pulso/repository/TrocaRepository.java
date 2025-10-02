package web.pulso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.pulso.models.Troca;
import web.pulso.models.Profissional;
import web.pulso.models.Plantao;
import web.pulso.models.enums.StatusTroca;
import java.util.List;

@Repository
public interface TrocaRepository extends JpaRepository<Troca, Long> {
    
    List<Troca> findByProfissional(Profissional profissional);
    List<Troca> findByPlantao(Plantao plantao);
    List<Troca> findByStatus(StatusTroca status);
    List<Troca> findByProfissionalId(Long profissionalId);
    List<Troca> findByPlantaoId(Long plantaoId);
    List<Troca> findByTipo(String tipo);
    List<Troca> findByStatusAndProfissionalId(StatusTroca status, Long profissionalId);
    
}