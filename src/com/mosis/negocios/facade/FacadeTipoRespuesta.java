/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;

import com.mosis.entidades.TipoRespuesta;
import com.mosis.entidades.Usuarios;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class FacadeTipoRespuesta {
    
    FacadeUsuarios fu = new FacadeUsuarios();
    
    public void addTipoRespuesta(TipoRespuesta tr, Usuarios u) {
        ServiceLocator.getInstance().setTipo(TipoRespuesta.class);
        
        TipoRespuesta tipoRespuesta = new TipoRespuesta();
        
        Usuarios usuariosID = fu.usuariosId(u.getIdUsuario());
        
        tipoRespuesta.setTipoRespuesta(tr.getTipoRespuesta());
        tipoRespuesta.setFkIdUsuario(usuariosID);
        
        ServiceLocator.getInstance().save(tipoRespuesta);
        
    }
    
    public void updateTipoRespuestas(TipoRespuesta tr, Usuarios u) {
        ServiceLocator.getInstance().setTipo(TipoRespuesta.class);
        
        TipoRespuesta tipoRespuesta = new TipoRespuesta();
        
        Usuarios usuariosID = fu.usuariosId(u.getIdUsuario());
        
        tipoRespuesta.setIdTipoRespuesta(tr.getIdTipoRespuesta());
        tipoRespuesta.setTipoRespuesta(tr.getTipoRespuesta());
        tipoRespuesta.setFkIdUsuario(usuariosID);
        
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
