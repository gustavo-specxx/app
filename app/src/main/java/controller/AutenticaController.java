package controller;

import entity.Autentica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AutenticaService;

@RestController
@RequestMapping("/autentica")
public class AutenticaController {
    @Autowired
    private AutenticaService autenticaService;

    @PostMapping
    public Autentica createAutentica(@RequestBody Autentica autentica) {
        return autenticaService.save(autentica);
    }

    @PostMapping("/change-password")
    public void changePassword(@RequestParam String email, @RequestParam String newPassword) {
        autenticaService.changePassword(email, newPassword);
    }
}
