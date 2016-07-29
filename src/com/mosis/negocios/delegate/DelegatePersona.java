/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.delegate;

import com.mosis.entidades.Persona;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Owner
 */
public class DelegatePersona {

    public void addPersona(Persona p) {
        ServiceFacadeLocator.getFacadePersona().addPersona(new Persona(p.getIdPersona(), p.getNombre(), p.getApellidoPaterno(), p.getApellidoMaterno(), p.getFechaNacimiento()));
    }

    public void updatePersona(int id, Persona p) {
        Persona persona = new Persona();
        persona.setIdPersona(id);
        persona.setNombre(p.getNombre());
        persona.setApellidoPaterno(p.getApellidoPaterno());
        persona.setApellidoMaterno(p.getApellidoMaterno());
        persona.setFechaNacimiento(p.getFechaNacimiento());
        ServiceFacadeLocator.getFacadePersona().updatePersona(id, persona);
    }

    public Persona getPersonaId(int id) {
        Persona persona = ServiceFacadeLocator.getFacadePersona().getPersonaId(id);
        return persona;
    }

    public List<Persona> getListPersona() {
        return ServiceFacadeLocator.getFacadePersona().getListPersona();
    }

    public void deletePersona(int id) {
        Persona persona = ServiceFacadeLocator.getFacadePersona().getPersonaId(id);
        if (persona != null) {
            ServiceFacadeLocator.getFacadePersona().deletePersona(id);
        } else {
            System.out.println("persona no valida");
        }
    }

    public static void main(String[] args) {
        DelegatePersona dp = new DelegatePersona();
//        dp.addPersona(new Persona(0, "Andres", "Peña", "Gonzalez", new Date().toString()));
//        Persona  p=new Persona();
//        p.setNombre("Carlos");
//        p.setApellidoPaterno("Pena");
//        p.setApellidoMaterno("Perez");
//        p.setFechaNacimiento(new Date().toString());
//        dp.updatePersona(11, p);
//        dp.deletePersona(11);
    }
}
