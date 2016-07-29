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

    public void addTipoUsuario(TipoUsuario tipoUsuario) {
        ServiceFacadeLocator.getFacadeTipoUsuario().addTipoUsuario(new TipoUsuario(null, tipoUsuario.getTipoUsuario()));
    }

    public void updateTipoUsuario(int id, TipoUsuario tu) {
        TipoUsuario tipoUsuario = new TipoUsuario(id, tu.getTipoUsuario());
        ServiceFacadeLocator.getFacadeTipoUsuario().updateTipoUsuario(id, tipoUsuario);
    }

//    public static void main(String[] args) {
//        DelegateTipoUsuario dtu = new DelegateTipoUsuario();
////        dtu.addTipoUsuario(new TipoUsuario(null, "empleado comun"));
////        TipoUsuario tipoUsuario = new TipoUsuario();
////        tipoUsuario.setTipoUsuario("super armin mod");
////        dtu.updateTipoUsuario(6, tipoUsuario);
//
////        List<TipoUsuario> tp = dtu.getListTipoUsuario();
////        TipoUsuario tp = dtu.getTipoUsuarioId(5);
////        System.out.println(tp.getTipoUsuario());
//    
////        dtu.deleteTipoUsuario(6);
//    
//    }

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

    public List<TipoUsuario> getListTipoUsuario() {
        return ServiceFacadeLocator.getFacadeTipoUsuario().getListTipoUsuarios();

    }

    public List<Object[]> tipoUsuarioMuestraPorId(int valorid) {
        List<Object[]> mostrarTipoUsuarioPorId = ServiceFacadeLocator.getFacadeTipoUsuario().mostrarTipoUsuarioPorId(valorid);
        return mostrarTipoUsuarioPorId;
    }

    public List<Object[]> tipoUsuariosLista() {
        List<Object[]> mostrarTipoUsiarios = ServiceFacadeLocator.getFacadeTipoUsuario().mostrarTipoUsiarios();
        return mostrarTipoUsiarios;
    }

    public void deleteTipoUsuario(int id) {
        TipoUsuario tu = ServiceFacadeLocator.getFacadeTipoUsuario().tipoUsuarioID(id);
        if (tu != null) {
            ServiceFacadeLocator.getFacadeTipoUsuario().elimniarTipoUsuario(id);
            System.out.println("dato eliminado");
        } else {
            System.out.println("dato no existe");
        }
    }

}
