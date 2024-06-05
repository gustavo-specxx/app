package gs._ano.app.service;

import gs._ano.app.entity.PredicaoIA;
import gs._ano.app.repository.PredicaoIARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PredicaoIAService {

    @Autowired
    private PredicaoIARepository predicaoIARepository;

    public List<PredicaoIA> getPredicoesByDados(String dados) {
        return predicaoIARepository.findByDados(dados); // Ajuste conforme necessário
    }
}
