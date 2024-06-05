package gs._ano.app.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "nome_usuario", length = 50, nullable = false)
    private String nomeUsuario;

    @Column(name = "data_nascimento_usuario")
    private LocalDate dataNascimentoUsuario;  // Usando LocalDate

    @Column(name = "localizacao_usuario", length = 100)
    private String localizacaoUsuario;

    // Getters e Setters
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public LocalDate getDataNascimentoUsuario() {
        return dataNascimentoUsuario;
    }

    public void setDataNascimentoUsuario(LocalDate dataNascimentoUsuario) {
        this.dataNascimentoUsuario = dataNascimentoUsuario;
    }

    public String getLocalizacaoUsuario() {
        return localizacaoUsuario;
    }

    public void setLocalizacaoUsuario(String localizacaoUsuario) {
        this.localizacaoUsuario = localizacaoUsuario;
    }
}
