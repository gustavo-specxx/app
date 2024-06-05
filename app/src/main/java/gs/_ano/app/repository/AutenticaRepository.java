package gs._ano.app.repository;

import java.util.Optional;

import gs._ano.app.entity.Autentica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutenticaRepository extends JpaRepository<Autentica, Long> {
    Optional<Autentica> findByEmail(String email);
}
