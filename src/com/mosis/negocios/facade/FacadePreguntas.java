/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;

import com.mosis.entidades.Preguntas;
import com.mosis.entidades.Usuarios;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class FacadePreguntas {

    FacadeUsuarios fu = new FacadeUsuarios();

    public void addPregunta(Preguntas p, Usuarios u) {
        ServiceLocator.getInstance().setTipo(Preguntas.class);
        Preguntas preguntas = new Preguntas();
        Usuarios usuarioID = fu.usuariosId(u.getIdUsuario());
        preguntas.setPregunta(p.getPregunta());
        preguntas.setFkIdUsuario(usuarioID);
        ServiceLocator.getInstance().save(preguntas);

    }

    public void updatePregunta(Preguntas p, Usuarios u) {
        ServiceLocator.getInstance().setTipo(Preguntas.class);
        Preguntas preguntas = new Preguntas();
        Usuarios usuarioID = fu.usuariosId(u.getIdUsuario());

        preguntas.setIdPregunta(p.getIdPregunta());
        preguntas.setPregunta(p.getPregunta());
        preguntas.setFkIdUsuario(usuarioID);

        ServiceLocator.getInstance().saveOrUpdate(preguntas);

    }

    public void deletePregunta(int id) {
        ServiceLocator.getInstance().setTipo(Preguntas.class);
        Preguntas pregunta = (Preguntas) ServiceLocator.getInstance().find(id);

        ServiceLocator.getInstance().delete(pregunta);
    }

    public Preguntas getPreguntaId(int id) {
        ServiceLocator.getInstance().setTipo(Preguntas.class);
        Preguntas p = (Preguntas) ServiceLocator.getInstance().find(id);
        return p;
    }

    public List<Preguntas> getListPreguntas() {
        ServiceLocator.getInstance().setTipo(Preguntas.class);
        List<Preguntas> preg = ServiceLocator.getInstance().findAll();
        return preg;
    }

}
