package gs._ano.app.controller;

import gs._ano.app.entity.Autentica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import gs._ano.app.service.AutenticaService;

@RestController
@RequestMapping("/autentica")
public class AutenticaController {

    @Autowired
    private AutenticaService autenticaService;

    @PostMapping("/save")
    public Autentica saveAutentica(@RequestBody Autentica autentica) {
        return autenticaService.save(autentica);
    }

    @PostMapping("/change-password")
    public ResponseEntity<String> changePassword(@RequestParam Long id, @RequestParam String novaSenha) {
        boolean updated = autenticaService.changePassword(id, novaSenha);
        if (updated) {
            return ResponseEntity.ok("Senha alterada com sucesso.");
        } else {
            return ResponseEntity.badRequest().body("Falha ao alterar a senha.");
        }
    }
}
