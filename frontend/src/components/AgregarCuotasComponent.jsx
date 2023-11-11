import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import HeaderComponent from "./Headers/HeaderComponent";
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/Button';
import Swal from 'sweetalert2';
import CuotasService from "../services/CuotasService";

function AgregarCuotasComponent(props){

    const initialState = {
        rut: "",
        TipoColegio: "",
        anhoEgreso: "",
        numCuotas: "",
    };

    const [input, setInput] = useState(initialState);
    const navigate = useNavigate();
    const navigateHome = () => {
        navigate("/");
    };
    
    const changeRutHandler = event => {
        setInput({ ...input, rut: event.target.value });
    };
    const changeTipoColegioHandler = event => {
        setInput({ ...input, TipoColegio: event.target.value });
    };
    const changeanhoEgresoHandler = event => {
        setInput({ ...input, anhoEgreso: event.target.value });
    };
    const changenumCuotasHandler = event => {
        setInput({ ...input, numCuotas: event.target.value });
    };
  

    
    const ingresarCuotas = (event) => {
        Swal.fire({
            title: "¿Desea registrar el Pago?",
            text: "No podra cambiarse en caso de equivocación",
            icon: "question",
            showDenyButton: true,
            confirmButtonText: "Confirmar",
            confirmButtonColor: "rgb(68, 194, 68)",
            denyButtonText: "Cancelar",
            denyButtonColor: "rgb(190, 54, 54)",
        }).then((result) => {
            if (result.isConfirmed) {
                console.log(input.title);
                let newCuota = {
                    rut: input.rut,
                    TipoColegio: input.TipoColegio,
                    anhoEgreso: input.anhoEgreso,
                    numCuotas: input.numCuotas,                    
                };
                console.log(newCuota);
                CuotasService.createCuotas(newCuota);
                Swal.fire({
                    title: "Enviado",
                    timer: 2000,
                    icon: "success",
                    timerProgressBar: true,
                    didOpen: () => {
                        Swal.showLoading()
                      },
                    })
                navigateHome();
            }
        });
    };

    return(
        <div className="general">
            <HeaderComponent />
            <div className="container-create">
                <Form>
                    <Form.Group className="mb-3" controlId="rut" value = {input.rut} onChange={changeRutHandler}>
                        <Form.Label className="agregar">Rut:</Form.Label>
                        <Form.Control className="agregar" type="number" name="rut"/>
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="numCuotas" value = {input.numCuotas} onChange={changenumCuotasHandler}>
                        <Form.Label className="agregar">Numero Cuotas:</Form.Label>
                        <Form.Control className="agregar" type="number" name="numCuotas"/>
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="TipoColegio">
                        <Form.Label className="agregar"> Tipo: </Form.Label>
                        <select className="agregar" name="TipoColegio" required value = {input.TipoColegio} onChange={changeTipoColegioHandler}>
                            <option value="0" disabled>Tipo De Colegio</option>
                            <option value="0">Seleccione</option>
                            <option value="Municipal">Municipal</option>
                            <option value="Subvencionado">Subvencionado</option>
                            <option value="Privado">Privado</option>
                        </select>
                    </Form.Group>

                    <Form.Group className="mb-3" controlId="anhoEgreso" value = {input.anhoEgreso} onChange={changeanhoEgresoHandler}>
                        <Form.Label className="agregar">Egreso Colegio:</Form.Label>
                        <Form.Control className="agregar" type="number" name="anhoEgreso"/>
                    </Form.Group>
                    <Button className="boton" onClick={ingresarCuotas}>Registrar Cuotas De Pago</Button>
                </Form>
            </div>
        </div>
    )
}
    export default AgregarCuotasComponent;