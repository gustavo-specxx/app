package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "TB_SISTEMA_ALERTA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SistemaAlerta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_sistema;
    private Integer id_ia;
    private String tipo_alerta;
    private String descricao_alerta;
    private ZonedDateTime data_hora_alerta;
    private Integer nivel_alerta;
}
