package pe.edu.upeu.msmatriculaservice.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.msmatriculaservice.Entity.Matricula;
import pe.edu.upeu.msmatriculaservice.Entity.MatriculaDetalle;
import pe.edu.upeu.msmatriculaservice.Respository.MatriculaRepository;
import pe.edu.upeu.msmatriculaservice.Service.MatriculaService;
import pe.edu.upeu.msmatriculaservice.feign.CursoFeign;

import java.util.List;

@Service
public class MatriculaServiceImpl implements MatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;
    @Autowired
    private CursoFeign cursoFeign;

    @Override
    public List<Matricula> listar() {
        return matriculaRepository.findAll();
    }

    @Override
    public Matricula buscarPorId(Integer id) {

        Matricula matricula = matriculaRepository.findById(id).get();
        for (MatriculaDetalle matriculaDetalle : matricula.getMatriculaDetalles()) {
            matriculaDetalle.setCursoDto(cursoFeign.buscarPorId(matriculaDetalle.getCursoId()));
        }


        return matricula;
    }

    @Override
    public Matricula guardar(Matricula categoria) {
        return matriculaRepository.save(categoria);
    }

    @Override
    public Matricula actualizar(Matricula categoria) {
        return matriculaRepository.save(categoria);
    }

    @Override
    public void borrarPorId(Integer id) {
        matriculaRepository.deleteById(id);
    }
}
