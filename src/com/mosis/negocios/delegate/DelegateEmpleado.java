/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.delegate;

import com.mosis.entidades.Empleado;
import com.mosis.entidades.Persona;
import com.mosis.excepciones.MyException;
import com.mosis.negocios.integracion.ServiceFacadeLocator;

/**
 *
 * @author Owner
 */
public class DelegateEmpleado {

    /**
     *
     * @param e
     * @param idPersona
     * @param idTipoEmpleado
     * @throws MyException numero de empleado duplicado, idpersona o
     * idTipoEmpleado no valido.
     */
    public void addEmpleado(Empleado e, int idPersona, int idTipoEmpleado) throws MyException {
        Empleado empleado = new Empleado();
        empleado.setNumeroEmpleado(e.getNumeroEmpleado());
        ServiceFacadeLocator.getFacadeEmpleado().addEmpleado(empleado, idPersona, idTipoEmpleado);
    }

    /**
     * *
     *
     * @param numero
     * @param idPersona
     * @param idTipoEmpleado
     * @throws MyException numero empleado no valido
     * @throws Exception persona o tipo empleado no valido
     */
    public void updateEmpleado(String numero, int idPersona, int idTipoEmpleado) throws MyException, Exception {
        ServiceFacadeLocator.getFacadeEmpleado().updateEmpleadoPorNumero(numero, idPersona, idTipoEmpleado);
    }

    /**
     *
     * @param numero
     * @return
     * @throws MyException numero no valido
     */
    public Persona getPersonaEmpPorNumero(String numero) throws MyException {
        return ServiceFacadeLocator.getFacadeEmpleado().getPersonaEmpleadoPorNumEmpleado(numero);
    }

}
