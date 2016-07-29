/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.delegate;

import com.mosis.entidades.TipoRespuesta;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class DelegateTipoRespuesta {

    public void addTipoRespuesta(TipoRespuesta tr) {

        try {
            TipoRespuesta tipoRespuesta = new TipoRespuesta();
            tipoRespuesta.setTipoRespuesta(tr.getTipoRespuesta());
            ServiceFacadeLocator.getFacadeTipoRespuesta().addTipoRespuesta(tipoRespuesta);
        } catch (Exception e) {
            System.out.println("Error: " + e);
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
    public void updateTipoRespuesta(int id, TipoRespuesta tr) {
        TipoRespuesta tipoRespuestaID = ServiceFacadeLocator.getFacadeTipoRespuesta().getTipoRespuestaId(id);
        if (tipoRespuestaID != null) {
            TipoRespuesta tipoRespuesta = new TipoRespuesta();
            tipoRespuesta.setIdTipoRespuesta(id);
            tipoRespuesta.setTipoRespuesta(tr.getTipoRespuesta());
            ServiceFacadeLocator.getFacadeTipoRespuesta().updateTipoRespuestas(id, tipoRespuesta);
        } else {
            System.out.println("tipo respuesta no valido");
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
