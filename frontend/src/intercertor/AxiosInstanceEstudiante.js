import axios from 'axios';


const AxiosInstanceEstudiante = axios.create({
    baseURL:"http://localhost:8082/estudiantes",
});

AxiosInstanceEstudiante.interceptors.request.use(
    (request) => {
    
      
      request.headers['Content-Type'] = 'application/json';
      return request;
    },
    (error) => {
        console.log(error);
        return Promise.reject(error)})
    
export default AxiosInstanceEstudiante;
