package web.pulso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.pulso.models.Alocacao;
import web.pulso.models.Profissional;
import web.pulso.models.Plantao;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface AlocacaoRepository extends JpaRepository<Alocacao, Long> {
    
    List<Alocacao> findByProfissional(Profissional profissional);
    List<Alocacao> findByPlantao(Plantao plantao);
    List<Alocacao> findByProfissionalId(Long profissionalId);
    List<Alocacao> findByPlantaoId(Long plantaoId);
    List<Alocacao> findByDataHoraAlocacaoBetween(LocalDateTime inicio, LocalDateTime fim);
    Optional<Alocacao> findByProfissionalIdAndPlantaoId(Long profissionalId, Long plantaoId);
    
}