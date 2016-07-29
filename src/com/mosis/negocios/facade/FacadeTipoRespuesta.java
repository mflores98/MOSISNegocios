/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;

import com.mosis.entidades.TipoRespuesta;
import com.mosis.entidades.Usuarios;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class FacadeTipoRespuesta {
    
    FacadeUsuarios fu = new FacadeUsuarios();
    
    public void addTipoRespuesta(TipoRespuesta tr) {
        ServiceLocator.getInstance().setTipo(TipoRespuesta.class);
        TipoRespuesta tipoRespuesta = new TipoRespuesta();
        tipoRespuesta.setTipoRespuesta(tr.getTipoRespuesta());
        ServiceLocator.getInstance().save(tipoRespuesta);
    }
//    
//    public static void main(String[] args) {
//        //ServiceFacadeLocator.getFacadeTipoRespuesta().addTipoRespuesta(new TipoRespuesta(null, "Mi tipo"));
////        TipoRespuesta tr = new TipoRespuesta();
////        tr.setTipoRespuesta("tipo respuesta edit");
////        ServiceFacadeLocator.getFacadeTipoRespuesta().updateTipoRespuestas(1, tr);
//
////        List<TipoRespuesta> tr = ServiceFacadeLocator.getFacadeTipoRespuesta().getListTipoRespuestas();
////        for (TipoRespuesta tr1 : tr) {
////            System.out.println(tr1.getTipoRespuesta());
////        }
//        ServiceFacadeLocator.getFacadeTipoRespuesta().deleteTipoRespuesta(1);
//    }
    
    public void updateTipoRespuestas(int id, TipoRespuesta tr) {
        ServiceLocator.getInstance().setTipo(TipoRespuesta.class);
        
        TipoRespuesta tipoRespuesta = new TipoRespuesta();
        tipoRespuesta.setIdTipoRespuesta(id);
        tipoRespuesta.setTipoRespuesta(tr.getTipoRespuesta());
        
        ServiceLocator.getInstance().saveOrUpdate(tipoRespuesta);
    }
    
    public TipoRespuesta getTipoRespuestaId(int id) {
        ServiceLocator.getInstance().setTipo(TipoRespuesta.class);
        TipoRespuesta tr = (TipoRespuesta) ServiceLocator.getInstance().find(id);
        return tr;
    }
    
    public List<TipoRespuesta> getListTipoRespuestas() {
        ServiceLocator.getInstance().setTipo(TipoRespuesta.class);
        List<TipoRespuesta> datos = ServiceLocator.getInstance().findAll();
        return datos;
    }
    
    public void deleteTipoRespuesta(int id) {
        ServiceLocator.getInstance().setTipo(TipoRespuesta.class);
        TipoRespuesta tipoRespuesta = getTipoRespuestaId(id);
        ServiceLocator.getInstance().delete(tipoRespuesta);
    }
    
}
