package web.pulso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.pulso.models.Instituicao;
import java.util.List;
import java.util.Optional;

@Repository
public interface InstituicaoRepository extends JpaRepository<Instituicao, Long> {
    
    Optional<Instituicao> findByCnpj(String cnpj);
    List<Instituicao> findByNomeContainingIgnoreCase(String nome); //tá como lista pq pode ter mais de uma com o mesmo nome, por ex: "Hospital São Paulo", "Hospital das Clínicas", "Hospital Regional", "Mini Hospital Central"
    Optional<Instituicao> findByEmail(String email);
    
}