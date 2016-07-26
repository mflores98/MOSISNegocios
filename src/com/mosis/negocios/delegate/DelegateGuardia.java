/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.delegate;

import com.mosis.entidades.Guardias;
import com.mosis.excepciones.DataNotFoundException;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class DelegateGuardia {

    public void addGuardia(Guardias g) {

        List<Object[]> dato = ServiceFacadeLocator.getFacadeGuardia().getGuardiaNumEmp(g.getNumeroEmpleado());
        if (dato.isEmpty()) {
            Guardias guardia = new Guardias();
            guardia.setNombre(g.getNombre());
            guardia.setAp(g.getAp());
            guardia.setAm(g.getAm());
            guardia.setFechaNacimiento(g.getFechaNacimiento());
            guardia.setNumeroEmpleado(g.getNumeroEmpleado());
            ServiceFacadeLocator.getFacadeGuardia().addGuardia(guardia);
        } else {
            throw new DataNotFoundException("Numero de guardia ya existe");
        }
    }

//    public static void main(String[] args) {
//        FacadeGuardia fg = new FacadeGuardia();
//        fg.addGuardia(new Guardias(null, "Alicia", "Rodriguez", "Perez", "9/2/1955", "1234567890"));
//    }
    /**
     * modificando junto con numero de empleado
     *
     * @param id
     * @param g
     */
    public void updateDataGuardia(int id, Guardias g) {
        Guardias guardia = ServiceFacadeLocator.getFacadeGuardia().getGuardiaId(id);
        if (guardia != null) {
            Guardias guardiau = new Guardias(id, g.getNombre(), g.getAp(), g.getAm(), g.getFechaNacimiento(), g.getNumeroEmpleado());
            ServiceFacadeLocator.getFacadeGuardia().updateDatNumEmpGuardia(id, guardiau);
        } else {
            System.out.println("guardia no valido");
        }
    }

    /**
     *
     * @param id
     */
    public void deleteGuardia(int id) {
        ServiceFacadeLocator.getFacadeGuardia().deleteGuardia(id);
    }

    public List<Object[]> getGuardiaNumEmp(String numEmp) {
        return ServiceFacadeLocator.getFacadeGuardia().getGuardiaNumEmp(numEmp);
    }

    public List<Guardias> getListGuardias() {
        return ServiceFacadeLocator.getFacadeGuardia().getListGuardias();
    }

    public Guardias getGuardia(int id) {
        return ServiceFacadeLocator.getFacadeGuardia().getGuardiaId(id);
    }

}
