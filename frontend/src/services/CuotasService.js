import AxiosInstanceCoutas from "../intercertor/AxiosInstanceCuotas";
class CuotasService {

    getCuotas(){
        return AxiosInstanceCoutas.get('/all');
    }

    getCuotasByRut(rut){
        return AxiosInstanceCoutas.get('/'+ rut);
    }
    createCuotas(cuotas){
        return AxiosInstanceCoutas.post('/registro',cuotas);
    }
}

export default new CuotasService()