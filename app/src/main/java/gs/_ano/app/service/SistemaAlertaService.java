package gs._ano.app.service;

import gs._ano.app.entity.SistemaAlerta;
import org.springframework.stereotype.Service;
import gs._ano.app.repository.SistemaAlertaRepository;

import java.util.List;

@Service
public class SistemaAlertaService {
    private final SistemaAlertaRepository sistemaAlertaRepository;

    public SistemaAlertaService(SistemaAlertaRepository sistemaAlertaRepository) {
        this.sistemaAlertaRepository = sistemaAlertaRepository;
    }

    public List<SistemaAlerta> getAllAlertas() {
        return sistemaAlertaRepository.findAll();
    }
}
