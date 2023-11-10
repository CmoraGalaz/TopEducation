import AxiosInstanceCoutas from "../intercertor/AxiosInstanceCuotas";
class CuotasService {

    getEstudiantes(){
        return AxiosInstanceCoutas.get('/all');
    }

    getEstudianteByRut(rut){
        return AxiosInstanceCoutas.get('/'+ rut);
    }
    createEstudiante(estudiante){
        return AxiosInstanceCoutas.post('/',estudiante);
    }
}

export default new CuotasService()