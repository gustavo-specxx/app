package gs._ano.app.service;

import gs._ano.app.entity.Autentica;
import gs._ano.app.repository.AutenticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutenticaService {

    @Autowired
    private AutenticaRepository autenticaRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; // Injeção do PasswordEncoder

    public Autentica save(Autentica autentica) {
        String encodedPassword = passwordEncoder.encode(autentica.getSenhaUsuario());
        autentica.setSenhaUsuario(encodedPassword);
        return autenticaRepository.save(autentica);
    }

    public boolean changePassword(Long id, String novaSenha) {
        Optional<Autentica> autenticaOptional = autenticaRepository.findById(id);
        if (autenticaOptional.isPresent()) {
            Autentica autentica = autenticaOptional.get();
            autentica.setSenhaUsuario(passwordEncoder.encode(novaSenha));
            autenticaRepository.save(autentica);
            return true;
        }
        return false;
    }

    public Optional<Autentica> findByEmail(String email) {
        return autenticaRepository.findByEmail(email);
    }
}
