package gs._ano.app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_AUTENTICA") // Confirme se o nome da tabela está correto
public class Autentica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email") // Verifique se o nome da coluna está correto
    private String email;

    @Column(name = "senha_usuario") // Verifique se o nome da coluna está correto
    private String senhaUsuario;

    // Getters
    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
}
