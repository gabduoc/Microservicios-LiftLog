package pawville.union.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Union_v1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private Long rutinaId;

    @Column (nullable = false)
    private Long usuarioId;

    @Column (nullable = false)
    private Long ejercicioId;

    @Column (nullable = false)
    private Integer series;

    @Column (nullable = false)
    private Integer repeticiones;

    @Column (nullable = false)
    private Double peso;

    @Column (nullable = false)
    private Integer tiempo;

}
