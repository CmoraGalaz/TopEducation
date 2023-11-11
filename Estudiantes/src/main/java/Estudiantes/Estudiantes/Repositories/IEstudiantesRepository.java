package Estudiantes.Estudiantes.Repositories;

import Estudiantes.Estudiantes.Models.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IEstudiantesRepository extends JpaRepository<Estudiantes, Integer> {

    Estudiantes findByRut(Integer rut);
}
