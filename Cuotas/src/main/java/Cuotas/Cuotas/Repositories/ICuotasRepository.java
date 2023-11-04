package Cuotas.Cuotas.Repositories;

import Cuotas.Cuotas.Models.Cuotas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICuotasRepository extends JpaRepository<Cuotas, Integer> {
}
