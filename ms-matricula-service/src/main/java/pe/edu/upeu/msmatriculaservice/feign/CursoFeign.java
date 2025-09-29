package pe.edu.upeu.msmatriculaservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.upeu.msmatriculaservice.dto.CursoDto;

@FeignClient(name = "ms-curso-service", path = "/curso")
public interface CursoFeign {
    @GetMapping("/{id}")
    public CursoDto buscarPorId(@PathVariable Integer id);
}
