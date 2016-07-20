/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;

import com.google.gson.Gson;
import com.mosis.entidades.TipoUsuario;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class FacadeTipoUsuario {

    public void insertTipoUsuario(String tipoUsuario, String parent) {

//        try {
        ServiceLocator.getInstance().setTipo(TipoUsuario.class);

        TipoUsuario tipoUsuario1 = new TipoUsuario();
        tipoUsuario1.setTipoUsuario(tipoUsuario);
        tipoUsuario1.setParent(parent);
        ServiceLocator.getInstance().save(tipoUsuario1);
//        } catch (Exception e) {
//            throw e;
//        }
    }

//    public static void main(String[] args) {
//        FacadeTipoUsuario ftu = new FacadeTipoUsuario();
//        ftu.insertTipoUsuario("nuevo usuario", "2");
//        ServiceLocator.getInstance().setTipo(TipoUsuario.class);
//        TipoUsuario tipoUsuario = new TipoUsuario(null, "tipoaddd", "2");
//        ServiceLocator.getInstance().save(tipoUsuario);
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
    public void elimniar(int id) {
        try {
            ServiceLocator.getInstance().setTipo(TipoUsuario.class);
            TipoUsuario find = (TipoUsuario) ServiceLocator.getInstance().find(id);
            ServiceLocator.getInstance().delete(find);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

//    public static void main(String[] args) {
//        FacadeTipoUsuario ftu = new FacadeTipoUsuario();
//        ftu.elimniar(1);
//    }
    public void editarTipoU(int id, String tipo, String parent) {
        try {
            ServiceLocator.getInstance().setTipo(TipoUsuario.class);
            TipoUsuario tipoUsuario = new TipoUsuario();
            tipoUsuario.setIdTipoUsuario(id);
            tipoUsuario.setTipoUsuario(tipo);
            tipoUsuario.setParent(parent);
            ServiceLocator.getInstance().saveOrUpdate(tipoUsuario);
            System.out.println("editados");
        } catch (Exception e) {
            System.out.println("error: " + e);
        }
    }

//    public static void main(String[] args) {
//        FacadeTipoUsuario ftu = new FacadeTipoUsuario();
//        
//        ftu.editarTipoU(1, "ds USUARIO", "1");
//        
//    }
//    public static void main(String[] args) {
//            FacadeTipoUsuario ftu=new FacadeTipoUsuario();
//            ftu.elimniar(4);
//    }
//    public static void main(String[] args) {
//        FacadeTipoUsuario ftu = new FacadeTipoUsuario();
//       // List<Object[]> dato = ftu.mostrarTipoUsuarioPorId(1);
//         List<Object[]> dato = ftu.mostrarTipoUsiarios();
//        
//        Gson gson = new Gson();
//
//        String json = gson.toJson(dato);
//        System.out.println(json);
//
//        //  for (Object[] dato1 : dato) {
//        //  System.out.println(dato1[0].toString() + " " + dato1[1].toString());
//        //  }
//        // ftu.insertTipoUsuario("SuperUsuario", null);
}
