package gs._ano.app.controller;

import gs._ano.app.entity.PredicaoIA;
import gs._ano.app.service.PredicaoIAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/predicoes")
public class PredicaoIAController {

    @Autowired
    private PredicaoIAService predicaoIAService;

    @GetMapping("/{dados}")
    public List<PredicaoIA> getPredicoesByDados(@PathVariable String dados) {
        return predicaoIAService.getPredicoesByDados(dados); // Ajuste conforme necessário
    }
}
