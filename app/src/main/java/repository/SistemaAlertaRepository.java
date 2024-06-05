package repository;

import entity.SistemaAlerta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SistemaAlertaRepository extends JpaRepository<SistemaAlerta, Integer> {}
