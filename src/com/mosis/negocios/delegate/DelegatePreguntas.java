/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.delegate;

import com.mosis.entidades.Preguntas;
import com.mosis.entidades.Usuarios;
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
    public void addPreguntas(Preguntas p, Usuarios u) {
        Preguntas pregunta = new Preguntas();
        Usuarios usuariosID = ServiceFacadeLocator.getFacadeUsuarios().usuariosId(u.getIdUsuario());
        if (usuariosID != null) {
            pregunta.setPregunta(p.getPregunta());
            pregunta.setFkIdUsuario(usuariosID);
            ServiceFacadeLocator.getFacadePreguntas().addPregunta(pregunta, usuariosID);
        } else {
            System.out.println("usuario no valido");
        }
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
    public void updatePreguntas(Preguntas p, Usuarios u) {
        Preguntas pregunta = new Preguntas();

        Preguntas preguntaID = ServiceFacadeLocator.getFacadePreguntas().getPreguntaId(p.getIdPregunta());
        Usuarios usuariosID = ServiceFacadeLocator.getFacadeUsuarios().usuariosId(u.getIdUsuario());
        if (preguntaID != null) {
            if (usuariosID != null) {
                pregunta.setIdPregunta(p.getIdPregunta());
                pregunta.setPregunta(p.getPregunta());
                pregunta.setFkIdUsuario(usuariosID);
                ServiceFacadeLocator.getFacadePreguntas().updatePregunta(pregunta, usuariosID);
            } else {
                System.out.println("usuario no valido");
            }
        } else {
            System.out.println("pregunta no valida");
        }
    }
//    public static void main(String[] args) {
//        DelegatePreguntas dp = new DelegatePreguntas();
//        DelegateUsuarios du = new DelegateUsuarios();
//        Preguntas preguntas = new Preguntas();
//        Usuarios usuariosid = du.getUsuarioid(11);
//        if (usuariosid!=null) {
//            preguntas.setIdPregunta(1);
//            preguntas.setPregunta("Pregunta mofic?");
//            preguntas.setFkIdUsuario(usuariosid);
//            dp.updatePreguntas(preguntas, usuariosid);
//        }else System.out.println("usuario no valido");
//    }

    public void deletePreguntas(int id) {
        Preguntas preguntasID = ServiceFacadeLocator.getFacadePreguntas().getPreguntaId(id);
        if (preguntasID != null) {
            ServiceFacadeLocator.getFacadePreguntas().deletePregunta(id);
        } else {
            System.out.println("pregunta no valida");
        }
    }
//    public static void main(String[] args) {
//        DelegatePreguntas dp = new DelegatePreguntas();
//        dp.deletePreguntas(894);
//    }

    public Preguntas getPreguntaId(int id) {
        return ServiceFacadeLocator.getFacadePreguntas().getPreguntaId(id);
    }

    public List<Preguntas> getListPreguntas() {
        return ServiceFacadeLocator.getFacadePreguntas().getListPreguntas();
    }

}
