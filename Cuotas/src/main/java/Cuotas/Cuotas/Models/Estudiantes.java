package Cuotas.Cuotas.Models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class Estudiantes {

    private Integer rut;

    private String nombres;

    private String apellidos;

    private String fechaNacimiento;

    private String tipoColegio;

    private String nombreColegio;

    private Integer egreso;
}
