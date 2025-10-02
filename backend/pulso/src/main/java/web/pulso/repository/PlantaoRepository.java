package web.pulso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.pulso.models.Plantao;
import web.pulso.models.Escala;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PlantaoRepository extends JpaRepository<Plantao, Long> {
    
    List<Plantao> findByEscala(Escala escala);

    List<Plantao> findByEscalaId(Long escalaId);
    List<Plantao> findByHoraEntradaBetween(LocalDateTime inicio, LocalDateTime fim); // verifica o intervalo entre entrada e saída
    List<Plantao> findByHoraEntradaAfter(LocalDateTime dataHora); //verfica se a hora de entrada é depois da dataHora
    List<Plantao> findByHoraEntradaBefore(LocalDateTime dataHora); //verifica se a hora de entrada é antes da dataHora
    List<Plantao> findByQuantidadeProfissionais(Integer quantidade); //qtd de profissionais no plantão
    
}