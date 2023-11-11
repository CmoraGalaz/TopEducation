package Cuotas.Cuotas.Repositories;

import Cuotas.Cuotas.Models.Cuotas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICuotasRepository extends JpaRepository<Cuotas, Integer> {

    List<Cuotas> findByRut(Integer rut);
}
