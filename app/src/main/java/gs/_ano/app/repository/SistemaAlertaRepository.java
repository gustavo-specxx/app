package gs._ano.app.repository;

import gs._ano.app.entity.SistemaAlerta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SistemaAlertaRepository extends JpaRepository<SistemaAlerta, Integer> {
    List<SistemaAlerta> findByTipoAlerta(Integer tipoAlerta);
}
