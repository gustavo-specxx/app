package controller;

import entity.PredicaoIA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PredicaoIAService;

import java.util.List;

@RestController
@RequestMapping("/predicoes")
public class PredicaoIAController {
    @Autowired
    private PredicaoIAService predicaoIAService;

    @GetMapping("/{usuarioId}")
    public List<PredicaoIA> getPredicoesByUsuarioId(@PathVariable Integer usuarioId) {
        return predicaoIAService.getPredicoesByUsuarioId(usuarioId);
    }
}
