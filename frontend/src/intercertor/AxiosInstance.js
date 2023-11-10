import axios from 'axios';

const ESTUDIANTE_API_URL = "http://localhost:8080";
const AxiosInstance = axios.create({
    baseURL:"http://localhost:8080",
});

AxiosInstance.interceptors.request.use(
    (request) => {
    
      
      request.headers['Content-Type'] = 'application/json';
      return request;
    },
    (error) => {
        console.log(error);
        return Promise.reject(error)})
    
export default AxiosInstance;
