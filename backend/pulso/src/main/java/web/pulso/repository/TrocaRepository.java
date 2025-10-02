package web.pulso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.pulso.models.Troca;
import web.pulso.models.Profissional;
import web.pulso.models.Plantao;
import web.pulso.models.enums.StatusTroca;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TrocaRepository extends JpaRepository<Troca, Long> {
    
    List<Troca> findByProfissionalSolicitante(Profissional profissional);
    List<Troca> findByPlantao(Plantao plantao);
    List<Troca> findByStatus(StatusTroca status);
    List<Troca> findByProfissionalSolicitanteId(Long profissionalId);
    List<Troca> findByPlantaoId(Long plantaoId);
    List<Troca> findByDataHoraSolicitacaoBetween(LocalDateTime inicio, LocalDateTime fim); //verificar se é entre ou maior que a dataHora
    List<Troca> findByStatusAndProfissionalSolicitanteId(StatusTroca status, Long profissionalId);//filtrar por status(confirmado, pendente ou recusado) e profissional solicitante
    
}