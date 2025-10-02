package web.pulso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.pulso.models.Pessoa;
import java.util.List;
import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
    Optional<Pessoa> findByEmail(String email);
    List<Pessoa> findByNomeContainingIgnoreCase(String nome); // Pode ter mais de uma pessoa com o mesmo nome
    Optional<Pessoa> findByTelefone(String telefone);
    
}