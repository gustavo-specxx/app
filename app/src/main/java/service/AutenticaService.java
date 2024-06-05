package service;

import entity.Autentica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AutenticaRepository;

import java.util.Optional;

@Service
public class AutenticaService {
    @Autowired
    private AutenticaRepository autenticaRepository;

    public Autentica save(Autentica autentica) {
        return autenticaRepository.save(autentica);
    }

    public Optional<Autentica> findById(Integer id) {
        return autenticaRepository.findById(id);
    }

    public void changePassword(String email, String newPassword) {
        Optional<Autentica> autentica = autenticaRepository.findByEmail(email);
        if (autentica.isPresent()) {
            Autentica auth = autentica.get();
            auth.setSenha_usuario(newPassword);
            autenticaRepository.save(auth);
        } else {
            throw new RuntimeException("Usuário não encontrado");
        }
    }
}
