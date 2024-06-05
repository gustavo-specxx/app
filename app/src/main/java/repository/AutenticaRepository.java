package repository;

import entity.Autentica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AutenticaRepository extends JpaRepository<Autentica, Integer> {
    Optional<Autentica> findByEmail(String email);
}
