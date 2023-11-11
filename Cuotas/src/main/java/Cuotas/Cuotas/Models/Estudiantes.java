package Cuotas.Cuotas.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Estudiantes {

    private Integer rut;

    private String nombres;

    private String apellidos;

    private String fechaNacimiento;

    private String tipoColegio;

    private String nombreColegio;

    private Integer egreso;
}
