package web.pulso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.pulso.models.Vinculo;
import web.pulso.models.Instituicao;
import web.pulso.models.Profissional;
import web.pulso.models.enums.TipoVinculo;
import java.util.List;
import java.util.Optional;

@Repository
public interface VinculoRepository extends JpaRepository<Vinculo, Long> {
    
    List<Vinculo> findByInstituicao(Instituicao instituicao);
    List<Vinculo> findByProfissional(Profissional profissional);
    List<Vinculo> findByTipoVinculo(TipoVinculo tipoVinculo);
    List<Vinculo> findByInstituicaoId(Long instituicaoId);
    List<Vinculo> findByProfissionalId(Long profissionalId);
    Optional<Vinculo> findByLiderEscalaId(Long liderEscalaId);
    
}