package web.pulso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.pulso.models.Escala;
import web.pulso.models.LiderEscala;
import web.pulso.models.Setor;
import web.pulso.models.enums.StatusEscala;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface EscalaRepository extends JpaRepository<Escala, Long> {
    
    List<Escala> findByLiderEscala(LiderEscala liderEscala);
    List<Escala> findBySetor(Setor setor);
    List<Escala> findByStatus(StatusEscala status);
    List<Escala> findByMesReferencia(LocalDate mesReferencia);
    List<Escala> findBySetorIdAndMesReferencia(Long setorId, LocalDate mesReferencia);
    List<Escala> findByLiderEscalaIdAndStatus(Long liderEscalaId, StatusEscala status);
    List<Escala> findByNomeContainingIgnoreCase(String nome);
    
}