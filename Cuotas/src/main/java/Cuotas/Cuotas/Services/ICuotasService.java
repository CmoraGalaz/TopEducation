package Cuotas.Cuotas.Services;

import Cuotas.Cuotas.Models.Cuotas;

import java.util.List;

public interface ICuotasService<T> {
    List<Cuotas> findAll();

    Cuotas create(Cuotas cuotas);
    Cuotas update(Cuotas cuotas);





}
