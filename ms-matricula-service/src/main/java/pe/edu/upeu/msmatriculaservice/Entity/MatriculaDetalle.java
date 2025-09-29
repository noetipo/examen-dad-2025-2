package pe.edu.upeu.msmatriculaservice.Entity;

import jakarta.persistence.*;
import lombok.Data;
import pe.edu.upeu.msmatriculaservice.dto.CursoDto;

@Entity
@Data
public class MatriculaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer cursoId;
    @Transient
    private CursoDto cursoDto;

}