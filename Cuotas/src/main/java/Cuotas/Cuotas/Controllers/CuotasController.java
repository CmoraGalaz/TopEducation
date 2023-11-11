package Cuotas.Cuotas.Controllers;

import Cuotas.Cuotas.Models.Cuotas;
import Cuotas.Cuotas.Models.Estudiantes;
import Cuotas.Cuotas.Models.Pago;
import Cuotas.Cuotas.Models.Registros;
import Cuotas.Cuotas.Services.CuotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuotas")
public class CuotasController {

    @Autowired
    private CuotasService cuotasService;

    @GetMapping("/all")
    public ResponseEntity<List<Cuotas>> findAll() {
        List<Cuotas> cuotas = cuotasService.findAll();
        return new ResponseEntity<>(cuotas, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Cuotas> create(@RequestBody Cuotas cuotas){
        return new ResponseEntity<>(cuotasService.create(cuotas), HttpStatus.CREATED);
    }

    @PostMapping("/registro")
    public ResponseEntity<Registros> crearCuotas(@RequestBody Registros registros){
        return  new ResponseEntity<>( cuotasService.CrearCuotasRegistros(registros),HttpStatus.OK);
    }

    @PostMapping("/pagarcuota")
    public ResponseEntity<Cuotas> crearCuotas(@RequestBody Pago pago){
        Cuotas cuotaNueva = cuotasService.PagarCuota(pago);

        return  new ResponseEntity<>( cuotasService.update(cuotaNueva),HttpStatus.OK);
    }

    @GetMapping("/rut/{rut}")
    public ResponseEntity<List<Cuotas>>findByRut(@PathVariable("rut")Integer rut){
        List<Cuotas> cuotasrut = cuotasService.findAllByRut(rut);

        return new ResponseEntity<>(cuotasrut, HttpStatus.OK);

    }

    @GetMapping("/{rut}")
    public ResponseEntity<List<Cuotas>> listado(@PathVariable("rut") Integer rut){
        System.out.println("Listar");
        System.out.println("rut: "+rut+"\n");
        Estudiantes estudianteEntity = cuotasService.findByRut(rut);
        System.out.println(estudianteEntity);
        if(estudianteEntity != null){
            List<Cuotas> cuotasEntities = cuotasService.findAllByRut(estudianteEntity.getRut());
            return ResponseEntity.ok(cuotasEntities);
        }
        return ResponseEntity.ok(null);
    }


}
