package Estudiantes.Estudiantes.Services;

import Estudiantes.Estudiantes.Models.Estudiantes;
import Estudiantes.Estudiantes.Repositories.IEstudiantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudiantesService implements IEstudiantesService<Estudiantes> {
    @Autowired
    private IEstudiantesRepository iEstudiantesRepository;
    @Override
    public List<Estudiantes> findAll() {
        return iEstudiantesRepository.findAll();
    }

    @Override
    public Estudiantes create(Estudiantes estudiante) {
        return iEstudiantesRepository.save(estudiante);
    }

    @Override
    public Estudiantes update(Estudiantes estudiante) {
        return iEstudiantesRepository.save(estudiante);
    }

    @Override
    public void delete(Integer rut) {
        iEstudiantesRepository.deleteById(rut);

    }
    public Estudiantes findRut(Integer rut) {
        return iEstudiantesRepository.findByRut(rut);
    }
}
