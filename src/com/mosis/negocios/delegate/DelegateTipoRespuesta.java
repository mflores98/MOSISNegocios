/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.delegate;

import com.mosis.entidades.TipoRespuesta;
import com.mosis.entidades.Usuarios;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class DelegateTipoRespuesta {

    DelegateUsuarios du = new DelegateUsuarios();

    public void addTipoRespuesta(TipoRespuesta tr, Usuarios u) {
        Usuarios usuariosID = du.getUsuarioid(u.getIdUsuario());

        if (usuariosID != null) {
            try {
                TipoRespuesta tipoRespuesta = new TipoRespuesta();
                tipoRespuesta.setTipoRespuesta(tr.getTipoRespuesta());
                tipoRespuesta.setFkIdUsuario(usuariosID);
                ServiceFacadeLocator.getFacadeTipoRespuesta().addTipoRespuesta(tipoRespuesta, usuariosID);

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        } else {
            System.out.println("usuario no valido");
        }
    }

//    public static void main(String[] args) {
//        DelegateTipoRespuesta dtr = new DelegateTipoRespuesta();
//        TipoRespuesta tipoRespuesta = new TipoRespuesta();
//
//        Usuarios usuariosID = ServiceFacadeLocator.getFacadeUsuarios().usuariosId(17);
//
//        tipoRespuesta.setTipoRespuesta("tipo Respuesta numero 3");
//        tipoRespuesta.setFkIdUsuario(usuariosID);
//        
//        dtr.addTipoRespuesta(tipoRespuesta, usuariosID);
//    }
    public void updateTipoRespuesta(TipoRespuesta tr, Usuarios u) {
        Usuarios usuariosID = du.getUsuarioid(u.getIdUsuario());

        TipoRespuesta tipoRespuestaID = getTipoRespuestaId(tr.getIdTipoRespuesta());
        if (tipoRespuestaID != null) {
            if (usuariosID != null) {
                TipoRespuesta tipoRespuesta = new TipoRespuesta();
                tipoRespuesta.setIdTipoRespuesta(tr.getIdTipoRespuesta());
                tipoRespuesta.setTipoRespuesta(tr.getTipoRespuesta());
                tipoRespuesta.setFkIdUsuario(usuariosID);
                ServiceFacadeLocator.getFacadeTipoRespuesta().updateTipoRespuestas(tipoRespuesta, usuariosID);
            } else {
                System.out.println("usuario no valido");
            }
        } else {
            System.out.println("tipo respuesta no valida");
        }
    }

//    public static void main(String[] args) {
//        DelegateTipoRespuesta dtr = new DelegateTipoRespuesta();
//        TipoRespuesta tipoRespuesta = new TipoRespuesta();
//
//        Usuarios usuariosID = ServiceFacadeLocator.getFacadeUsuarios().usuariosId(17);
//
//        tipoRespuesta.setIdTipoRespuesta(123);
//        tipoRespuesta.setTipoRespuesta("tipo Respuesta modificado");
//        tipoRespuesta.setFkIdUsuario(usuariosID);
//        
//
//        dtr.updateTipoRespuesta(tipoRespuesta, usuariosID);
//    }
    public TipoRespuesta getTipoRespuestaId(int id) {
        return ServiceFacadeLocator.getFacadeTipoRespuesta().getTipoRespuestaId(id);
    }
//     public static void main(String[] args) {
//        DelegateTipoRespuesta dtr = new DelegateTipoRespuesta();
//        TipoRespuesta tr=dtr.getTipoRespuestaId(1);
//         System.out.println(tr.getTipoRespuesta());
//    }

    public List<TipoRespuesta> getListTipoRespuestas() {
        List<TipoRespuesta> datos = ServiceFacadeLocator.getFacadeTipoRespuesta().getListTipoRespuestas();
        return datos;
    }

//    public static void main(String[] args) {
//        DelegateTipoRespuesta dtr = new DelegateTipoRespuesta();
//        List<TipoRespuesta> tr = dtr.getListTipoRespuestas();
//        for (TipoRespuesta tr1 : tr) {
//            System.out.println(tr1.getTipoRespuesta());
//        }
//    }
    public void deleteTipoRespuesta(int id) {
        TipoRespuesta tipoRespuesta = getTipoRespuestaId(id);
        if (tipoRespuesta != null) {
            ServiceFacadeLocator.getFacadeTipoRespuesta().deleteTipoRespuesta(id);
        } else {
            System.out.println("tipo respuesta no valida");
        }
    }

}
