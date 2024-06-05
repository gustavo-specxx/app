package service;

import entity.PredicaoIA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PredicaoIARepository;

import java.util.List;

@Service
public class PredicaoIAService {
    @Autowired
    private PredicaoIARepository predicaoIARepository;

    public List<PredicaoIA> getPredicoesByUsuarioId(Integer usuarioId) {
        return predicaoIARepository.findByUsuarioId(usuarioId);
    }
}
