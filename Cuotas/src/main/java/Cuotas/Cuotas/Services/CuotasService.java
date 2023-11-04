package Cuotas.Cuotas.Services;

import Cuotas.Cuotas.Models.Cuotas;
import Cuotas.Cuotas.Repositories.ICuotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CuotasService implements ICuotasService<Cuotas>{
    @Autowired
    private ICuotasRepository iCuotasRepository;

    @Override
    public List<Cuotas> findAll() {
        return iCuotasRepository.findAll();
    }

    @Override
    public Cuotas create(Cuotas cuotas) {
        return iCuotasRepository.save(cuotas);
    }

    @Override
    public Cuotas update(Cuotas cuotas) {
        return iCuotasRepository.save(cuotas);
    }
}
