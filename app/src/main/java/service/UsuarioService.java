package service;

import entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> findById(Integer id) {
        return usuarioRepository.findById(id);
    }

    public List<Usuario> getAllUsuarios() {
        return null;
    }

    public Usuario createUsuario(Usuario usuario) {
        return usuario;
    }

    public Usuario updateUsuario(Long id, Usuario usuario) {
        return usuario;
    }

    public void deleteUsuario(Long id) {
    }
}
