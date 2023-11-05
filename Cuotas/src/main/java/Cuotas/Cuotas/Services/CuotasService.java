package Cuotas.Cuotas.Services;

import Cuotas.Cuotas.Models.Cuotas;
import Cuotas.Cuotas.Models.Pago;
import Cuotas.Cuotas.Models.Registros;
import Cuotas.Cuotas.Repositories.ICuotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public  Registros CrearCuotasRegistros(Registros registros){
        double arancel = 1500000;
        int w = 1;
        if(registros.rut()>0){
            if((registros.TipoColegio().equals("Municipal")) && (registros.numCuotas()<= 10)){
                arancel = arancel - (arancel*0.20);
                if((registros.anhoEgreso()-2023)<=1){
                    arancel = arancel - (arancel*0.15);
                    for(int z = 0; z< registros.numCuotas();z++){
                        String fechaPago = "01/" + "0" + w + "/2024";
                        String fechaVencimiento = "06/" + "0" + w + "/2024";
                        Cuotas cuotas = new Cuotas();

                        cuotas.setNumeroCuota(w);
                        cuotas.setEstado("Pendiente");
                        cuotas.setDescripcion("Documentacion Arancel Estudiante");
                        cuotas.setFechaVencimiento(fechaVencimiento);
                        cuotas.setFechaPago(fechaPago);
                        cuotas.setRut(registros.rut());
                        cuotas.setMonto((int) (arancel/ registros.numCuotas()));
                        cuotas.setInteres(0);
                        iCuotasRepository.save(cuotas);
                        w++;

                    }

                }
                if(((registros.anhoEgreso()-2023)>=1)&&((registros.anhoEgreso()-2023)<=2)){
                    arancel = arancel - (arancel*0.08);
                    for(int z = 0; z< registros.numCuotas();z++){
                        String fechaPago = "01/" + "0" + w + "/2024";
                        String fechaVencimiento = "06/" + "0" + w + "/2024";
                        Cuotas cuotas = new Cuotas();

                        cuotas.setNumeroCuota(w);
                        cuotas.setEstado("Pendiente");
                        cuotas.setDescripcion("Documentacion Arancel Estudiante");
                        cuotas.setFechaVencimiento(fechaVencimiento);
                        cuotas.setFechaPago(fechaPago);
                        cuotas.setRut(registros.rut());
                        cuotas.setMonto((int) (arancel/ registros.numCuotas()));
                        cuotas.setInteres(0);
                        iCuotasRepository.save(cuotas);
                        w++;

                    }
                }
                if(((registros.anhoEgreso()-2023)>=3)&&((registros.anhoEgreso()-2023)<=4)){
                    arancel = arancel - (arancel*0.04);
                    for(int z = 0; z< registros.numCuotas();z++){
                        String fechaPago = "01/" + "0" + w + "/2024";
                        String fechaVencimiento = "06/" + "0" + w + "/2024";
                        Cuotas cuotas = new Cuotas();

                        cuotas.setNumeroCuota(w);
                        cuotas.setEstado("Pendiente");
                        cuotas.setDescripcion("Documentacion Arancel Estudiante");
                        cuotas.setFechaVencimiento(fechaVencimiento);
                        cuotas.setFechaPago(fechaPago);
                        cuotas.setRut(registros.rut());
                        cuotas.setMonto((int) (arancel/ registros.numCuotas()));
                        cuotas.setInteres(0);
                        iCuotasRepository.save(cuotas);
                        w++;

                    }

                }
                if(((registros.anhoEgreso()-2023)>=5)){
                    for(int z = 0; z< registros.numCuotas();z++){
                        String fechaPago = "01/" + "0" + w + "/2024";
                        String fechaVencimiento = "06/" + "0" + w + "/2024";
                        Cuotas cuotas = new Cuotas();

                        cuotas.setNumeroCuota(w);
                        cuotas.setEstado("Pendiente");
                        cuotas.setDescripcion("Documentacion Arancel Estudiante");
                        cuotas.setFechaVencimiento(fechaVencimiento);
                        cuotas.setFechaPago(fechaPago);
                        cuotas.setRut(registros.rut());
                        cuotas.setMonto((int) (arancel/ registros.numCuotas()));
                        cuotas.setInteres(0);
                        iCuotasRepository.save(cuotas);
                        w++;

                    }

                }


            }
            if((registros.TipoColegio().equals("Subvencionado")) && (registros.numCuotas()<= 7)){
                arancel = arancel - (arancel*0.10);

                if((registros.anhoEgreso()-2023)<=1){
                    arancel = arancel - (arancel*0.15);
                    for(int z = 0; z< registros.numCuotas();z++){
                        String fechaPago = "01/" + "0" + w + "/2024";
                        String fechaVencimiento = "06/" + "0" + w + "/2024";
                        Cuotas cuotas = new Cuotas();

                        cuotas.setNumeroCuota(w);
                        cuotas.setEstado("Pendiente");
                        cuotas.setDescripcion("Documentacion Arancel Estudiante");
                        cuotas.setFechaVencimiento(fechaVencimiento);
                        cuotas.setFechaPago(fechaPago);
                        cuotas.setRut(registros.rut());
                        cuotas.setMonto((int) (arancel/ registros.numCuotas()));
                        cuotas.setInteres(0);
                        iCuotasRepository.save(cuotas);
                        w++;

                    }
                }
                if(((registros.anhoEgreso()-2023)>=1)&&((registros.anhoEgreso()-2023)<=2)){
                    arancel = arancel - (arancel*0.08);
                    for(int z = 0; z< registros.numCuotas();z++){
                        String fechaPago = "01/" + "0" + w + "/2024";
                        String fechaVencimiento = "06/" + "0" + w + "/2024";
                        Cuotas cuotas = new Cuotas();

                        cuotas.setNumeroCuota(w);
                        cuotas.setEstado("Pendiente");
                        cuotas.setDescripcion("Documentacion Arancel Estudiante");
                        cuotas.setFechaVencimiento(fechaVencimiento);
                        cuotas.setFechaPago(fechaPago);
                        cuotas.setRut(registros.rut());
                        cuotas.setMonto((int) (arancel/ registros.numCuotas()));
                        cuotas.setInteres(0);
                        iCuotasRepository.save(cuotas);
                        w++;

                    }
                }
                if(((registros.anhoEgreso()-2023)>=3)&&((registros.anhoEgreso()-2023)<=4)){
                    arancel = arancel - (arancel*0.04);
                    for(int z = 0; z< registros.numCuotas();z++){
                        String fechaPago = "01/" + "0" + w + "/2024";
                        String fechaVencimiento = "06/" + "0" + w + "/2024";
                        Cuotas cuotas = new Cuotas();

                        cuotas.setNumeroCuota(w);
                        cuotas.setEstado("Pendiente");
                        cuotas.setDescripcion("Documentacion Arancel Estudiante");
                        cuotas.setFechaVencimiento(fechaVencimiento);
                        cuotas.setFechaPago(fechaPago);
                        cuotas.setRut(registros.rut());
                        cuotas.setMonto((int) (arancel/ registros.numCuotas()));
                        cuotas.setInteres(0);
                        iCuotasRepository.save(cuotas);
                        w++;

                    }

                }
                if(((registros.anhoEgreso()-2023)>=5)){
                    for(int z = 0; z< registros.numCuotas();z++){
                        String fechaPago = "01/" + "0" + w + "/2024";
                        String fechaVencimiento = "06/" + "0" + w + "/2024";
                        Cuotas cuotas = new Cuotas();

                        cuotas.setNumeroCuota(w);
                        cuotas.setEstado("Pendiente");
                        cuotas.setDescripcion("Documentacion Arancel Estudiante");
                        cuotas.setFechaVencimiento(fechaVencimiento);
                        cuotas.setFechaPago(fechaPago);
                        cuotas.setRut(registros.rut());
                        cuotas.setMonto((int) (arancel/ registros.numCuotas()));
                        cuotas.setInteres(0);
                        iCuotasRepository.save(cuotas);
                        w++;

                    }

                }


            }
            if((registros.TipoColegio().equals("Privado")) && (registros.numCuotas()<= 4)){

                if((registros.anhoEgreso()-2023)<=1){
                    arancel = arancel - (arancel*0.15);
                    for(int z = 0; z< registros.numCuotas();z++){
                        String fechaPago = "01/" + "0" + w + "/2024";
                        String fechaVencimiento = "06/" + "0" + w + "/2024";
                        Cuotas cuotas = new Cuotas();

                        cuotas.setNumeroCuota(w);
                        cuotas.setEstado("Pendiente");
                        cuotas.setDescripcion("Documentacion Arancel Estudiante");
                        cuotas.setFechaVencimiento(fechaVencimiento);
                        cuotas.setFechaPago(fechaPago);
                        cuotas.setRut(registros.rut());
                        cuotas.setMonto((int) (arancel/ registros.numCuotas()));
                        cuotas.setInteres(0);
                        iCuotasRepository.save(cuotas);
                        w++;

                    }
                }
                if(((registros.anhoEgreso()-2023)>=1)&&((registros.anhoEgreso()-2023)<=2)){
                    arancel = arancel - (arancel*0.08);
                    for(int z = 0; z< registros.numCuotas();z++){
                        String fechaPago = "01/" + "0" + w + "/2024";
                        String fechaVencimiento = "06/" + "0" + w + "/2024";
                        Cuotas cuotas = new Cuotas();

                        cuotas.setNumeroCuota(w);
                        cuotas.setEstado("Pendiente");
                        cuotas.setDescripcion("Documentacion Arancel Estudiante");
                        cuotas.setFechaVencimiento(fechaVencimiento);
                        cuotas.setFechaPago(fechaPago);
                        cuotas.setRut(registros.rut());
                        cuotas.setMonto((int) (arancel/ registros.numCuotas()));
                        cuotas.setInteres(0);
                        iCuotasRepository.save(cuotas);
                        w++;

                    }
                }
                if(((registros.anhoEgreso()-2023)>=3)&&((registros.anhoEgreso()-2023)<=4)){
                    arancel = arancel - (arancel*0.04);
                    for(int z = 0; z< registros.numCuotas();z++){
                        String fechaPago = "01/" + "0" + w + "/2024";
                        String fechaVencimiento = "06/" + "0" + w + "/2024";
                        Cuotas cuotas = new Cuotas();

                        cuotas.setNumeroCuota(w);
                        cuotas.setEstado("Pendiente");
                        cuotas.setDescripcion("Documentacion Arancel Estudiante");
                        cuotas.setFechaVencimiento(fechaVencimiento);
                        cuotas.setFechaPago(fechaPago);
                        cuotas.setRut(registros.rut());
                        cuotas.setMonto((int) (arancel/ registros.numCuotas()));
                        cuotas.setInteres(0);
                        iCuotasRepository.save(cuotas);
                        w++;

                    }

                }
                if(((registros.anhoEgreso()-2023)>=5)){
                    for(int z = 0; z< registros.numCuotas();z++){
                        String fechaPago = "01/" + "0" + w + "/2024";
                        String fechaVencimiento = "06/" + "0" + w + "/2024";
                        Cuotas cuotas = new Cuotas();

                        cuotas.setNumeroCuota(w);
                        cuotas.setEstado("Pendiente");
                        cuotas.setDescripcion("Documentacion Arancel Estudiante");
                        cuotas.setFechaVencimiento(fechaVencimiento);
                        cuotas.setFechaPago(fechaPago);
                        cuotas.setRut(registros.rut());
                        cuotas.setMonto((int) (arancel/ registros.numCuotas()));
                        cuotas.setInteres(0);
                        iCuotasRepository.save(cuotas);
                        w++;

                    }

                }
            }



        }


        return registros;
    }

    public Cuotas PagarCuota(Pago pago){
        Cuotas cuotaPagada = new Cuotas();
        Date fechaPago = new Date();

        List<Cuotas> cuotas = iCuotasRepository.findAll();
        for (int i =0 ; i < cuotas.size(); i++){
            if((cuotas.get(i).getRut().equals(pago.rut()))&&cuotas.get(i).getNumeroCuota().equals(pago.numCuota())){
                int montoRemanante = cuotas.get(i).getMonto()-pago.montoPago();
                cuotaPagada.setIdCuota(cuotas.get(i).getIdCuota());
                cuotaPagada.setRut(pago.rut());

                cuotaPagada.setNumeroCuota(pago.numCuota());
                cuotaPagada.setInteres(0);
                if(montoRemanante==0){
                    cuotaPagada.setMonto(0);
                    cuotaPagada.setEstado("Pagado");
                }else{
                    cuotaPagada.setMonto(montoRemanante);
                    cuotaPagada.setEstado("Abonado");
                }
                cuotaPagada.setDescripcion(cuotas.get(i).getDescripcion());
                cuotaPagada.setFechaVencimiento(cuotas.get(i).getFechaVencimiento());
                cuotaPagada.setFechaPago(fechaPago.toString());






            }

        }



        return cuotaPagada;
    }


}
