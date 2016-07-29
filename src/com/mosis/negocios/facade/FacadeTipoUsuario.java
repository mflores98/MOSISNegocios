/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;

import com.google.gson.Gson;
import com.mosis.entidades.TipoUsuario;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class FacadeTipoUsuario {

    public void addTipoUsuario(TipoUsuario tu) {
        ServiceLocator.getInstance().setTipo(TipoUsuario.class);
        TipoUsuario tipoUsuario2 = new TipoUsuario();
        tipoUsuario2.setTipoUsuario(tu.getTipoUsuario());
        ServiceLocator.getInstance().save(tipoUsuario2);
    }

    public void updateTipoUsuario(int id, TipoUsuario tu) {
        TipoUsuario ti = ServiceFacadeLocator.getFacadeTipoUsuario().tipoUsuarioID(id);
        if (ti != null) {
            ServiceLocator.getInstance().setTipo(TipoUsuario.class);
            TipoUsuario tipoUsuario = new TipoUsuario(id, tu.getTipoUsuario());
            ServiceLocator.getInstance().saveOrUpdate(tipoUsuario);
        } else {
            System.out.println("tipo usuario no valido");
        }
    }

//    public static void main(String[] args) {
//
////        ServiceFacadeLocator.getFacadeTipoUsuario().addTipoUsuario(new TipoUsuario(null, "Super Admin "));
////        TipoUsuario tu=new TipoUsuario();
////        tu.setTipoUsuario("super adim mod");
////        ServiceFacadeLocator.getFacadeTipoUsuario().updateTipoUsuario(6, tu);
////        List<TipoUsuario> tu = ServiceFacadeLocator.getFacadeTipoUsuario().getListTipoUsuarios();
////        for (TipoUsuario tu1 : tu) {
////            System.out.println(tu1.getTipoUsuario());
////        }
////                TipoUsuario tu = ServiceFacadeLocator.getFacadeTipoUsuario().tipoUsuarioID(4);
////                System.out.println(tu.getTipoUsuario());
//
//    }

    public List<TipoUsuario> getListTipoUsuarios() {
        ServiceLocator.getInstance().setTipo(TipoUsuario.class);
        List<TipoUsuario> findAll = ServiceLocator.getInstance().findAll();
        return findAll;
    }

//    public static void main(String[] args) {
//        FacadeTipoUsuario ftu=new FacadeTipoUsuario();
//        List<TipoUsuario> listTipoUsuarios = ftu.getListTipoUsuarios();
//        for (TipoUsuario dd : listTipoUsuarios) {
//            System.out.println(dd.getTipoUsuario());
//        }
//    }
    public TipoUsuario tipoUsuarioID(int id) {
        ServiceLocator.getInstance().setTipo(TipoUsuario.class);
        TipoUsuario find = (TipoUsuario) ServiceLocator.getInstance().find(id);
        return find;
    }

//    public static void main(String[] args) {
//        FacadeTipoUsuario ftu = new FacadeTipoUsuario();
//        TipoUsuario dato = ftu.tipoUsuarioID(4);
//        Gson gson = new Gson();
//        String toJson = gson.toJson(dato);
//        System.out.println(toJson);
//
//    }
    /**
     * proc aun no creado
     * @param valorid
     * @return 
     */
    public List<Object[]> mostrarTipoUsuarioPorId(int valorid) {
        return ServiceLocator.getInstance().executeQuery("call mosis.proc_tipousuario_id(" + valorid + ");");
    }
//    public static void main(String[] args) {
//        FacadeTipoUsuario d=new FacadeTipoUsuario();
//        List<Object[]> mostrarTipoUsiarios = d.mostrarTipoUsiarios();
//        for (Object[] mostrarTipoUsiario : mostrarTipoUsiarios) {
//            System.out.println(mostrarTipoUsiario[1].toString());
//        }
//    }
/**
 *   * proc aun no creado
 * @return 
 */
    public List<Object[]> mostrarTipoUsiarios() {
        return ServiceLocator.getInstance().executeQuery("call mosis.proc_tiposusuario();");
    }

//    public static void main(String[] args) {
//        FacadeTipoUsuario d = new FacadeTipoUsuario();
//        List<Object[]> mostrarTipoUsuarioPorId = d.mostrarTipoUsuarioPorId(1);
//        for (Object[] mostrarTipoUsuarioPorId1 : mostrarTipoUsuarioPorId) {
//            System.out.println(mostrarTipoUsuarioPorId1[1].toString());
//        }
//    }
    /**
     * crear proc para validar
     *
     * @param id
     */
    public void elimniarTipoUsuario(int id) {
        try {
            ServiceLocator.getInstance().setTipo(TipoUsuario.class);
            TipoUsuario find = (TipoUsuario) ServiceLocator.getInstance().find(id);
            ServiceLocator.getInstance().delete(find);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
//    public static void main(String[] args) {
//            FacadeTipoUsuario ftu=new FacadeTipoUsuario();
//            ftu.elimniarTipoUsuario(4);
//    }

}
