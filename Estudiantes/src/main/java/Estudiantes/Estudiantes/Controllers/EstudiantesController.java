package Estudiantes.Estudiantes.Controllers;

import Estudiantes.Estudiantes.Models.Estudiantes;
import Estudiantes.Estudiantes.Services.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/estudiantes")
public class EstudiantesController {

    @Autowired
    private EstudiantesService estudiantesService;
    @GetMapping("/all")
    public ResponseEntity<List<Estudiantes>>findAll() {
        List<Estudiantes> estudiantes = estudiantesService.findAll();
        return new ResponseEntity<>(estudiantes, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Estudiantes> create(@RequestBody Estudiantes estudiantes){
        return new ResponseEntity<>(estudiantesService.create(estudiantes), HttpStatus.CREATED);
    }
    @GetMapping("/{rutestudiante}")
    public ResponseEntity<Estudiantes> findRut(@PathVariable("rutestudiante")Integer rutestudiante) {
       Estudiantes estudianteRut= estudiantesService.findRut(rutestudiante);
        return new ResponseEntity<>(estudianteRut, HttpStatus.OK);
    }
}
