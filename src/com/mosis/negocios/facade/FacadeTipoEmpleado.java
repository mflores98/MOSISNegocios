/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;

import com.mosis.entidades.TipoEmpleado;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class FacadeTipoEmpleado {
    
    public void addTipoEmpleado(TipoEmpleado te) {
        ServiceLocator.getInstance().setTipo(TipoEmpleado.class);
        TipoEmpleado tipoEmpleado = new TipoEmpleado();
        tipoEmpleado.setTipoEmpleado(te.getTipoEmpleado());
        ServiceLocator.getInstance().save(tipoEmpleado);
    }
    
    public void updateTipoEmpleado(int id, TipoEmpleado te) {
        ServiceLocator.getInstance().setTipo(TipoEmpleado.class);
        TipoEmpleado tipoEmpleado = new TipoEmpleado();
        tipoEmpleado.setIdTipoEmpleado(id);
        tipoEmpleado.setTipoEmpleado(te.getTipoEmpleado());
        ServiceLocator.getInstance().saveOrUpdate(tipoEmpleado);
    }
    
    public TipoEmpleado getTipoEmpleadoId(int id) {
        ServiceLocator.getInstance().setTipo(TipoEmpleado.class);
        TipoEmpleado te = (TipoEmpleado) ServiceLocator.getInstance().find(id);
        return te;
    }
    
    public List<TipoEmpleado> getListTipoEmpleado() {
        ServiceLocator.getInstance().setTipo(TipoEmpleado.class);
        List<TipoEmpleado> te = ServiceLocator.getInstance().findAll();
        return te;
    }
    
    public void deleteTipoEmpleado(int id) {
        ServiceLocator.getInstance().setTipo(TipoEmpleado.class);
        TipoEmpleado te = (TipoEmpleado) ServiceFacadeLocator.getFacadeTipoEmpleado().getTipoEmpleadoId(id);
        ServiceLocator.getInstance().delete(te);
        
    }
    
    public static void main(String[] args) {
//        ServiceFacadeLocator.getFacadeTipoEmpleado().addTipoEmpleado(new TipoEmpleado(0, "Supor Empleado"));
        TipoEmpleado te = new TipoEmpleado();
//        te.setTipoEmpleado("Admin");
//        ServiceFacadeLocator.getFacadeTipoEmpleado().updateTipoEmpleado(2, te);

//      TipoEmpleado te1=  ServiceFacadeLocator.getFacadeTipoEmpleado().getTipoEmpleadoId(2);
//        System.out.println(te1.getTipoEmpleado());
//        List<TipoEmpleado> li=ServiceFacadeLocator.getFacadeTipoEmpleado().getListTipoEmpleado();
//        for (TipoEmpleado li1 : li) {
//            System.out.println(li1.getTipoEmpleado());
//        }
//                ServiceFacadeLocator.getFacadeTipoEmpleado().deleteTipoEmpleado(3);
    }
    
}
