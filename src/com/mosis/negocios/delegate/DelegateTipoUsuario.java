/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.delegate;

import com.google.gson.Gson;
import com.mosis.entidades.TipoUsuario;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class DelegateTipoUsuario {

    public DelegateTipoUsuario() {
    }

    public void insertTipoUsuario(TipoUsuario tipoUsuario) {

    }

    /**
     * un usuario mediante su id
     *
     * @param id
     * @return
     */
    public TipoUsuario getTipoUsuarioId(int id) {
        TipoUsuario tipoUsuarioID = ServiceFacadeLocator.getFacadeTipoUsuario().tipoUsuarioID(id);
        return tipoUsuarioID;
    }
//        public static void main(String[] args) {
//        DelegateTipoUsuario ftu = new DelegateTipoUsuario();
//        TipoUsuario dato = ftu.getTipoUsuarioId(1);
//        Gson gson = new Gson();
//        String toJson = gson.toJson(dato);
//        System.out.println(toJson);
//
//    }
//   

    public List<TipoUsuario> getListTipoUsuario() {
        return ServiceFacadeLocator.getFacadeTipoUsuario().getListTipoUsuarios();

    }
//    public static void main(String[] args) {
//        DelegateTipoUsuario u=new DelegateTipoUsuario();
//        TipoUsuario d = u.getTipoUsuarioId(1);
//       // for (TipoUsuario d : listTipoUsuario) {
//            System.out.println(d.getTipoUsuario());
//        //}
//    }

    public List<Object[]> tipoUsuarioMuestraPorId(int valorid) {
        List<Object[]> mostrarTipoUsuarioPorId = ServiceFacadeLocator.getFacadeTipoUsuario().mostrarTipoUsuarioPorId(valorid);
        return mostrarTipoUsuarioPorId;
    }

    public List<Object[]> tipoUsuariosLista() {
        List<Object[]> mostrarTipoUsiarios = ServiceFacadeLocator.getFacadeTipoUsuario().mostrarTipoUsiarios();
        return mostrarTipoUsiarios;
    }

    public void eliminarTipoUsuario(int id) {
        TipoUsuario tu = ServiceFacadeLocator.getFacadeTipoUsuario().tipoUsuarioID(id);
        if (tu != null) {
            ServiceFacadeLocator.getFacadeTipoUsuario().elimniar(id);
            System.out.println("dato eliminado");

        } else {
            System.out.println("dato no existe");
        }
    }

//    public static void main(String[] args) {
//        DelegateTipoUsuario dtu=new DelegateTipoUsuario();
//        dtu.eliminarTipoUsuario(13);
//    }
}
