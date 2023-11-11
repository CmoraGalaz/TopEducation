import React, { useState, useEffect } from "react";
import CuotasService from "../services/CuotasService";
import HeaderComponent from './Headers/HeaderComponent';

function ListadoCuotasComponent() {
    const [cuotasEntity, setCuotasEntity] = useState([]);

    useEffect(() => {
        // Invoca la función getCuotas() con paréntesis
        CuotasService.getCuotas().then((res) => {
            console.log("Response data Cuotas:", res.data);
            setCuotasEntity(res.data);
        }).catch((error) => {
            console.error("Error fetching Cuotas:", error);
        });
    }, []);

    return (
        <div className="general">
            <HeaderComponent />
            <div align="center" className="container-2">
                <h1><b> Cuotas Datos</b></h1>
                <table border="1" className="content-table">
                    <thead>
                        <tr>
                            <th>ID Cuota</th>
                            <th>RUT</th>
                            <th>Numero Cuota</th>
                            <th>Descripcion</th>
                            <th>Fecha Pago</th>
                            <th>Fecha Vencimiento</th>
                            <th>Estado</th>
                            <th>Monto</th>
                            <th>Interers</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            cuotasEntity.map((cuota) => (
                                <tr key={cuota.idCuota}>
                                    <td>{cuota.idCuota}</td>
                                    <td>{cuota.rut}</td>
                                    <td>{cuota.numeroCuota}</td>
                                    <td>{cuota.descripcion}</td>
                                    <td>{cuota.fechaPago}</td>
                                    <td>{cuota.fechaVencimiento}</td>
                                    <td>{cuota.estado}</td>
                                    <td>{cuota.monto}</td>
                                    <td>{cuota.interes}</td>
                                </tr>
                            ))
                        }
                    </tbody>
                </table>
            </div>
        </div>
    );
}

export default ListadoCuotasComponent;
