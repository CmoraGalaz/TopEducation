package Estudiantes.Estudiantes.Services;

import Estudiantes.Estudiantes.Models.Estudiantes;

import java.util.List;

public interface IEstudiantesService<T> {
    List<Estudiantes> findAll();

    Estudiantes create(Estudiantes estudiante);

    Estudiantes update(Estudiantes estudiante);

    void delete(Integer rut);
}
