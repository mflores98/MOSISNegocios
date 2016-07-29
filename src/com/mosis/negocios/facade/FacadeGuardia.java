/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;

import com.google.gson.Gson;
//import com.mosis.entidades.Guardias;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Owner
 */
public class FacadeGuardia {

//    public void addGuardia(Guardias g) {
//
//        List<Object[]> dato = ServiceFacadeLocator.getFacadeGuardia().getGuardiaNumEmp(g.getNumeroEmpleado());
//        if (dato.isEmpty()) {
//            ServiceLocator.getInstance().setTipo(Guardias.class);
//            Guardias guardia = new Guardias();
//            guardia.setNombre(g.getNombre());
//            guardia.setAp(g.getAp());
//            guardia.setAm(g.getAm());
//            guardia.setFechaNacimiento(g.getFechaNacimiento());
//            guardia.setNumeroEmpleado(g.getNumeroEmpleado());
//            ServiceLocator.getInstance().save(guardia);
//        } else {
//            System.out.println("num de empleado ya existe");
//        }
//    }
//
////    public static void main(String[] args) {
////        FacadeGuardia facadeGuardia = new FacadeGuardia();
////        Guardias guardias = new Guardias();
////        guardias.setNombre("Jorjge");
////        guardias.setAp("Sanckhez");
////        guardias.setAm("To0m");
////        guardias.setFechaNacimiento("1j5/5/1943");
////        guardias.setNumeroEmpleado("13");
////        facadeGuardia.addGuardia(guardias);
////    }
//    /**
//     *
//     * @param id
//     * @param g modificando junto con numero de empleado
//     */
//    public void updateDatNumEmpGuardia(int id, Guardias g) {
//        ServiceLocator.getInstance().setTipo(Guardias.class);
//        Guardias g1 = ServiceFacadeLocator.getFacadeGuardia().getGuardiaId(id);
//        if (g1 != null) {
//            Guardias guardias = new Guardias(id, g.getNombre(), g.getAp(), g.getAm(), g.getFechaNacimiento(), g.getNumeroEmpleado());
//            ServiceLocator.getInstance().saveOrUpdate(guardias);
//        } else {
//            System.out.println("guardia no valido");
//        }
//    }
//
//    public void deleteGuardia(int id) {
//        Guardias guardias = getGuardiaId(id);
//
//        if (guardias != null) {
//            ServiceLocator.getInstance().setTipo(Guardias.class);
//            ServiceLocator.getInstance().delete(guardias);
//        } else {
//            System.out.println("guardia no valido");
//        }
//
//    }
//
////    public static void main(String[] args) {
////        FacadeGuardia fg = new FacadeGuardia();
////        fg.deleteGuardia(6);
////    }
//    public List<Object[]> getGuardiaNumEmp(String numEmp) {
//        return ServiceLocator.getInstance().executeQuery("call mosis.proc_get_por_numero_empleado('" + numEmp + "');");
//    }
////
////    public static void main(String[] args) {
////        List<Object[]> dato = ServiceFacadeLocator.getFacadeGuardia().getGuardiaNumEmp("NUM34123");
////
////        if (dato.isEmpty()) {
////            System.out.println("datos en null");
////        } else {
////        }
////        for (Object[] dato1 : dato) {
////            System.out.println(dato1[2].toString());
////
////        }
////    }
//
//    public List<Guardias> getListGuardias() {
//        ServiceLocator.getInstance().setTipo(Guardias.class);
//        List<Guardias> find = ServiceLocator.getInstance().findAll();
//        return find;
//
//    }
//
//    public Guardias getGuardiaId(int id) {
//        ServiceLocator.getInstance().setTipo(Guardias.class);
//        Guardias find = (Guardias) ServiceLocator.getInstance().find(id);
//        return find;
//    }
//
////    public static void main(String[] args) {
////        FacadeGuardia fg = new FacadeGuardia();
////        Guardias dato = fg.getGuardiaId(2);
//////        Gson gson = new Gson();
//////        String toJson = gson.toJson(dato);
////        System.out.println(dato.getFechaNacimiento());
//////
////    }
}
