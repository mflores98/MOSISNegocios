/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;

import com.mosis.entidades.Empleado;
import com.mosis.entidades.Persona;
import com.mosis.entidades.TipoEmpleado;
import com.mosis.excepciones.MyException;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
public class FacadeEmpleado {

    /**
     *
     * @param e
     * @param idPersona
     * @param idTipoEmpleado
     * @throws MyException numero de empleado duplicado, idpersona o
     * idTipoEmpleado no valido.
     */
    public void addEmpleado(Empleado e, int idPersona, int idTipoEmpleado) throws MyException {

        Persona persona = ServiceFacadeLocator.getFacadePersona().getPersonaId(idPersona);
        TipoEmpleado tipoEmpleado = ServiceFacadeLocator.getFacadeTipoEmpleado().getTipoEmpleadoId(idTipoEmpleado);
        List<Object[]> empNum = ServiceFacadeLocator.getFacadeEmpleado().getEmpleadoPorNumero(e.getNumeroEmpleado());
        if (empNum.isEmpty() && persona != null && tipoEmpleado != null) {
            ServiceLocator.getInstance().setTipo(Empleado.class);
            Empleado empleado = new Empleado();
            empleado.setNumeroEmpleado(e.getNumeroEmpleado());
            empleado.setFkIdPersona(persona);
            empleado.setFkIdTipoEmpleado(tipoEmpleado);
            ServiceLocator.getInstance().save(empleado);
        } else {
            System.out.println("numero ya existe");
            throw new MyException();

        }
    }

    public Persona getPersonaEmpleadoPorNumEmpleado(String numero) throws MyException {
        List<Object[]> dato = ServiceFacadeLocator.getFacadeEmpleado().getEmpleadoPorNumero(numero);

        if (!dato.isEmpty()) {

            Persona persona = ServiceFacadeLocator.getFacadePersona().getPersonaId(Integer.parseInt(dato.get(0)[2].toString()));
            return persona;
        } else {
            throw new MyException();
        }

    }

    /**
     *
     * @param numero
     * @return
     */
    public List<Object[]> getEmpleadoPorNumero(String numero) {
        List<Object[]> dato = ServiceLocator.getInstance().executeQuery("call mosis_dos.proc_get_empleado_por_numero(" + numero + ")");
        return dato;

    }

//    public static void main(String[] args) {
//        try {
//            List<Object[]> dato = ServiceFacadeLocator.getFacadeEmpleado().getEmpleadoPorNumero("008472");
//            for (Object[] dato1 : dato) {
//                System.out.println(dato1[2].toString());
//            }
//        } catch (MyException ex) {
//            Logger.getLogger(FacadeEmpleado.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    /**
     * metodo solo para pruebas de actualizacion por medio de id
     *
     * @param idEmp
     * @param e
     * @param idPersona
     * @param idTipoEmpleado
     * @throws MyException idEmp, idPersona o idTipoEmpleado no valido
     */
    public void updateEmpleado(int idEmp, Empleado e, int idPersona, int idTipoEmpleado) throws MyException {

        Empleado emp = ServiceFacadeLocator.getFacadeEmpleado().getEmpleadoId(idEmp);
        Persona persona = ServiceFacadeLocator.getFacadePersona().getPersonaId(idPersona);
        TipoEmpleado tipoEmpleado = ServiceFacadeLocator.getFacadeTipoEmpleado().getTipoEmpleadoId(idTipoEmpleado);
        if (emp != null && persona != null && tipoEmpleado != null) {
            ServiceLocator.getInstance().setTipo(Empleado.class);
            Empleado empleado = new Empleado();
            empleado.setIdEmpleado(idEmp);
            empleado.setNumeroEmpleado(e.getNumeroEmpleado());
            empleado.setFkIdPersona(persona);
            empleado.setFkIdTipoEmpleado(tipoEmpleado);
            ServiceLocator.getInstance().saveOrUpdate(empleado);
        } else {
            throw new MyException();
        }
    }

    /**
     *
     * @param numero
     * @param idPersona
     * @param idTipoEmpleado
     * @throws MyException numero no existe
     */
    public void updateEmpleadoPorNumero(String numero, int idPersona, int idTipoEmpleado) throws MyException, Exception {
        List<Object[]> dato = ServiceFacadeLocator.getFacadeEmpleado().getEmpleadoPorNumero(numero);
        Persona persona = ServiceFacadeLocator.getFacadePersona().getPersonaId(idPersona);
        TipoEmpleado tipoEmpleado = ServiceFacadeLocator.getFacadeTipoEmpleado().getTipoEmpleadoId(idTipoEmpleado);
        if (!dato.isEmpty()) {
            if (persona != null && tipoEmpleado != null) {
                Empleado idEmpleado = ServiceFacadeLocator.getFacadeEmpleado().getEmpleadoId(Integer.parseInt(dato.get(0)[0].toString()));
                ServiceLocator.getInstance().setTipo(Empleado.class);
                Empleado empleado = new Empleado();
                empleado.setIdEmpleado(idEmpleado.getIdEmpleado());
                empleado.setFkIdPersona(persona);
                empleado.setFkIdTipoEmpleado(tipoEmpleado);
                ServiceLocator.getInstance().saveOrUpdate(empleado);
            } else {
                System.out.println("persona o tipoEmpleado no valido");
                throw new Exception();
            }
        } else {
            System.out.println("numero de empleado no valido");
            throw new MyException();
        }

    }

    public Empleado getEmpleadoId(int id) {
        ServiceLocator.getInstance().setTipo(Empleado.class);
        Empleado e = (Empleado) ServiceLocator.getInstance().find(id);
        return e;
    }

}
