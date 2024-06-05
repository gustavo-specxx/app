package gs._ano.app.controller;

import gs._ano.app.entity.Usuario;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import gs._ano.app.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@Tag(name = "Usuário Controller", description = "Operações relacionadas a usuários")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    @Operation(summary = "Lista todos os usuários")
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    @Operation(summary = "Cria um novo usuário")
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtém um usuário pelo ID")
    public ResponseEntity<Usuario> obterUsuarioPorId(@PathVariable Integer id) {
        ResponseEntity<Object> ResponseareEntity = null;
        return usuarioRepository.findById(id)
                .map(usuario -> ResponseEntity.ok().body(usuario))
                .orElse(ResponseareEntity.notFound().build());
    }
}
