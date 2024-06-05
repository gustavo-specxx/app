package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_IA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PredicaoIA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ia;
    private String dados;
    private String variaveis;
    private Integer predicoes;
}
