package service;

import entity.SistemaAlerta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.SistemaAlertaRepository;

import java.util.List;

@Service
public class SistemaAlertaService {
    @Autowired
    private SistemaAlertaRepository sistemaAlertaRepository;

    public List<SistemaAlerta> getAllAlertas() {
        return sistemaAlertaRepository.findAll();
    }
}
