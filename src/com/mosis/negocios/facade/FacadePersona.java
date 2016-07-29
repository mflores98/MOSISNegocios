/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;

import com.mosis.entidades.Persona;
import com.mosis.entidades.TipoEmpleado;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Owner
 */
public class FacadePersona {

    public void addPersona(Persona p) {
        ServiceLocator.getInstance().setTipo(Persona.class);
        Persona persona = new Persona(p.getIdPersona(), p.getNombre(), p.getApellidoPaterno(), p.getApellidoMaterno(), p.getFechaNacimiento());
        ServiceLocator.getInstance().save(persona);
    }

    public void updatePersona(int id, Persona p) {
        ServiceLocator.getInstance().setTipo(Persona.class);
        Persona persona = new Persona();
        persona.setIdPersona(id);
        persona.setNombre(p.getNombre());
        persona.setApellidoPaterno(p.getApellidoPaterno());
        persona.setApellidoMaterno(p.getApellidoMaterno());
        persona.setFechaNacimiento(p.getFechaNacimiento());
        ServiceLocator.getInstance().saveOrUpdate(persona);

    }

    public Persona getPersonaId(int id) {
        ServiceLocator.getInstance().setTipo(Persona.class);
        Persona persona = (Persona) ServiceLocator.getInstance().find(id);
        return persona;
    }

    public List<Persona> getListPersona() {
        ServiceLocator.getInstance().setTipo(Persona.class);
        List<Persona> list = ServiceLocator.getInstance().findAll();
        return list;
    }

    public void deletePersona(int id) {
        ServiceLocator.getInstance().setTipo(Persona.class);
        Persona p=getPersonaId(id);
        ServiceLocator.getInstance().delete(p);
    }

    public static void main(String[] args) {
//       ServiceFacadeLocator.getFacadePersona().addPersona(new Persona(0, "Alberto", "Perez", "Rodriguez", new Date().toString()));

//        Persona persona = new Persona(8, "Alberto", "Rodriguez", "Peña", new Date().toString());
//        ServiceFacadeLocator.getFacadePersona().updatePersona(8, persona);
//        Persona p=ServiceFacadeLocator.getFacadePersona().getPersonaId(8);
//        System.out.println(p.getNombre());
//       List<Persona> p= ServiceFacadeLocator.getFacadePersona().getListPersona();
//        for (Persona p1 : p) {
//            System.out.println(p1.getNombre());
//        }
//        ServiceFacadeLocator.getFacadePersona().deletePersona(10);
    }

}
