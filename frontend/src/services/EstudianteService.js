import AxiosInstanceEstudiante from "../intercertor/AxiosInstanceEstudiante";
class EstudianteService {

    getEstudiantes(){
        return AxiosInstanceEstudiante.get('/all');
    }

    getEstudianteByRut(rut){
        return AxiosInstanceEstudiante.get('/'+ rut);
    }
    createEstudiante(estudiante){
        return AxiosInstanceEstudiante.post('/',estudiante);
    }
}

export default new EstudianteService()