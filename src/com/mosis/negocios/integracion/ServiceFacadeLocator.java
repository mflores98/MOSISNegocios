/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.integracion;

import com.mosis.negocios.facade.FacadeCriteria;
import com.mosis.negocios.facade.FacadeDispositivo;
import com.mosis.negocios.facade.FacadeEtiquetas;
import com.mosis.negocios.facade.FacadeGuardia;
import com.mosis.negocios.facade.FacadePreguntas;
import com.mosis.negocios.facade.FacadeTipoRespuesta;
import com.mosis.negocios.facade.FacadeTipoUsuario;
import com.mosis.negocios.facade.FacadeUsuarios;

/**
 *
 * @author xhendor
 */
public class ServiceFacadeLocator {

    private static FacadeTipoUsuario facadeTipoUsuario;
    private static FacadeUsuarios facadeUsuarios;
    private static FacadeEtiquetas facadeEtiquetas;
    private static FacadeDispositivo facadeDispositivo;
    private static FacadePreguntas facadePreguntas;
    private static FacadeTipoRespuesta facadeTipoRespuesta;
    private static FacadeGuardia facadeGuardia;

    private static FacadeCriteria facadeCriteria;

    public static FacadeTipoUsuario getFacadeTipoUsuario() {
        if (facadeTipoUsuario == null) {
            facadeTipoUsuario = new FacadeTipoUsuario();
            return facadeTipoUsuario;
        } else {
            return facadeTipoUsuario;
        }
    }

    public static FacadeUsuarios getFacadeUsuarios() {
        if (facadeUsuarios == null) {
            facadeUsuarios = new FacadeUsuarios();
            return facadeUsuarios;
        } else {
            return facadeUsuarios;
        }
    }

    public static FacadeEtiquetas getFacadeEtiquetas() {
        if (facadeEtiquetas == null) {
            facadeEtiquetas = new FacadeEtiquetas();
            return facadeEtiquetas;
        } else {
            return facadeEtiquetas;
        }
    }

    public static FacadeDispositivo getFacadeDispositivo() {
        if (facadeDispositivo == null) {
            facadeDispositivo = new FacadeDispositivo();
            return facadeDispositivo;
        } else {
            return facadeDispositivo;
        }
    }

    public static FacadePreguntas getFacadePreguntas() {
        if (facadePreguntas == null) {
            facadePreguntas = new FacadePreguntas();
            return facadePreguntas;
        } else {
            return facadePreguntas;
        }
    }

    public static FacadeTipoRespuesta getFacadeTipoRespuesta() {
        if (facadeTipoRespuesta == null) {
            facadeTipoRespuesta = new FacadeTipoRespuesta();
            return facadeTipoRespuesta;
        } else {
            return facadeTipoRespuesta;
        }
    }

    public static FacadeGuardia getFacadeGuardia() {
        if (facadeGuardia == null) {
            facadeGuardia = new FacadeGuardia();
            return facadeGuardia;
        } else {
            return facadeGuardia;
        }
    }

    public static FacadeCriteria getFacadeCriterioBusquedaInstance() {
        if (facadeCriteria == null) {
            facadeCriteria = new FacadeCriteria();
            return facadeCriteria;
        } else {
            return facadeCriteria;
        }
    }

}
