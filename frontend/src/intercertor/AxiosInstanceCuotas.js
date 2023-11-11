import axios from 'axios';


const AxiosInstanceCoutas = axios.create({
    baseURL:"http://localhost:8083/cuotas",
});

AxiosInstanceCoutas.interceptors.request.use(
    (request) => {
    
      
      request.headers['Content-Type'] = 'application/json';
      return request;
    },
    (error) => {
        console.log(error);
        return Promise.reject(error)})
    
export default AxiosInstanceCoutas;
