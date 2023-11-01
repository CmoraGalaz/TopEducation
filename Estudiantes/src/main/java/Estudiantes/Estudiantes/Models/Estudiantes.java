package Estudiantes.Estudiantes.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "estudiantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Estudiantes {
    @Id

    @Column(name = "rut")
    private Integer rut;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "fechanacimiento")
    private String fechaNacimiento;

    @Column(name = "nombrecolegio")
    private String tipoColegio;

    @Column(name = "tipocolegio")
    private String nombreColegio;

    @Column(name = "anhoegreso")
    private Integer egreso;
}
