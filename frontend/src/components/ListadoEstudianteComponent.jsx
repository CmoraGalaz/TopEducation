import React, { useState, useEffect } from "react";
import EstudianteService from '../services/EstudianteService'
import HeaderComponent from './Headers/HeaderComponent'

function ListadoEstudianteComponent() {

    const [estudianteEntity, setEstudianteEntity] = useState([]);
    //const [input, setInput] = useState(initialState);

    useEffect(() => {
        EstudianteService.getEstudiantes().then((res) => {
            console.log("Response data Estudiante:", res.data);
            setEstudianteEntity(res.data);
            //setInput({ ...input, estudianteEntity: res.data });
        });
    }, []);

    return(
        <div className="general">
            <HeaderComponent/>
            <div align="center" className="container-2">
                <h1><b> Estudiantes Datos</b></h1>
                <table border="1" className="content-table">
                    <thead>
                        <tr>
                            <th>RUT</th>
                            <th>Nombres</th>
                            <th>Apellidos</th>
                            <th>Fecha de Nacimiento</th>
                            <th>Tipo de Colegio</th>
                            <th>Nombre de Colegio</th>
                            <th>Año de egreso</th>
                        
                        </tr>
                    </thead>
                    <tbody>
                        {
                            estudianteEntity.map((estudiante) => (
                                <tr key= {estudiante.rut}>
                                    <td> {estudiante.rut} </td>
                                    <td> {estudiante.nombres} </td>
                                    <td> {estudiante.apellidos} </td>
                                    <td> {estudiante.fechaNacimiento} </td>
                                    <td> {estudiante.tipoColegio} </td>
                                    <td> {estudiante.nombreColegio} </td>
                                    <td> {estudiante.egreso} </td>
                                   
                                </tr>
                            ))
                        }
                    </tbody>
                </table>
            </div>
        </div>
    )
}

export default ListadoEstudianteComponent