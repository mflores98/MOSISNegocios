/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.delegate;

import com.mosis.entidades.Preguntas;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class DelegatePreguntas {

    /**
     *
     * @param p
     * @param u
     */
    public void addPreguntas(Preguntas p) {
        Preguntas pregunta = new Preguntas();
        pregunta.setPregunta(p.getPregunta());
        ServiceFacadeLocator.getFacadePreguntas().addPregunta(pregunta);
    }

//    public static void main(String[] args) {
//        DelegatePreguntas dp = new DelegatePreguntas();
//        Preguntas preguntas = new Preguntas();
//
//        Usuarios usuariosID = ServiceFacadeLocator.getFacadeUsuarios().usuariosId(14);
//
//        preguntas.setPregunta("Pregunta 4 ?");
//        dp.addPreguntas(preguntas, usuariosID);
//    }
    public void updatePreguntas(int id, Preguntas p) {
        Preguntas pregunta = new Preguntas();

        Preguntas preguntaID = ServiceFacadeLocator.getFacadePreguntas().getPreguntaId(id);
        if (preguntaID != null) {
            pregunta.setIdPregunta(id);
            pregunta.setPregunta(p.getPregunta());
            ServiceFacadeLocator.getFacadePreguntas().updatePregunta(id, pregunta);
        } else {
            System.out.println("pregunta no valido");
        }
    }

    public void deletePreguntas(int id) {
        Preguntas preguntasID = ServiceFacadeLocator.getFacadePreguntas().getPreguntaId(id);
        if (preguntasID != null) {
            ServiceFacadeLocator.getFacadePreguntas().deletePregunta(id);
        } else {
            System.out.println("pregunta no valida");
        }
    }

    public Preguntas getPreguntaId(int id) {
        return ServiceFacadeLocator.getFacadePreguntas().getPreguntaId(id);
    }

    public List<Preguntas> getListPreguntas() {
        return ServiceFacadeLocator.getFacadePreguntas().getListPreguntas();
    }

}
