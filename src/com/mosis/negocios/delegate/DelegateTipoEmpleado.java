/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.delegate;

import com.mosis.entidades.TipoEmpleado;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class DelegateTipoEmpleado {

    public void addTipoEmpleado(TipoEmpleado te) {
        ServiceFacadeLocator.getFacadeTipoEmpleado().addTipoEmpleado(new TipoEmpleado(te.getIdTipoEmpleado(), te.getTipoEmpleado()));
    }

    public void updateTipoEmpleado(int id, TipoEmpleado te) {
        TipoEmpleado empleado = new TipoEmpleado();
        TipoEmpleado te1 = ServiceFacadeLocator.getFacadeTipoEmpleado().getTipoEmpleadoId(id);
        if (te1 != null) {
            empleado.setIdTipoEmpleado(id);
            empleado.setTipoEmpleado(te.getTipoEmpleado());
            ServiceFacadeLocator.getFacadeTipoEmpleado().updateTipoEmpleado(id, empleado);
        } else {
            System.out.println("tipo de empleado no valido");
        }
    }

    public TipoEmpleado getTipoEmpleadoId(int id) {
        return ServiceFacadeLocator.getFacadeTipoEmpleado().getTipoEmpleadoId(id);
    }

    public void deleteTipoEmpleado(int id) {
        TipoEmpleado te = ServiceFacadeLocator.getFacadeTipoEmpleado().getTipoEmpleadoId(id);
        if (te != null) {
            ServiceFacadeLocator.getFacadeTipoEmpleado().deleteTipoEmpleado(id);
        } else {
            System.out.println("tipo de empleado no valido");
        }
    }
    public List<TipoEmpleado> getListTipoEmpleado(){
        return ServiceFacadeLocator.getFacadeTipoEmpleado().getListTipoEmpleado();
    }
 
    public static void main(String[] args) {
        DelegateTipoEmpleado dte = new DelegateTipoEmpleado();
        TipoEmpleado te = new TipoEmpleado();
//        te.setTipoEmpleado("SUPER ADMIN");
//        dte.updateTipoEmpleado(4, te);
//        List<TipoEmpleado> d=dte.getListTipoEmpleado();
//        for (TipoEmpleado d1 : d) {
//            System.out.println(d1.getTipoEmpleado());
//        }
    }
}
