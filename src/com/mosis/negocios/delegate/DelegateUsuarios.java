/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.delegate;

import com.mosis.entidades.TipoUsuario;
import com.mosis.entidades.Usuarios;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class DelegateUsuarios {

    public Usuarios getUsuarioid(int id) {
        Usuarios usuario = ServiceFacadeLocator.getFacadeUsuarios().usuariosId(id);
        return usuario;
    }

    /**
     * validar user no se repita, funciona
     *
     * @param u
     * @param tu
     */
    public void addUsuarios(Usuarios u, TipoUsuario tu) {
        Usuarios usuario = new Usuarios();
        TipoUsuario tipoUsuarioID = ServiceFacadeLocator.getFacadeTipoUsuario().tipoUsuarioID(tu.getIdTipoUsuario());

        if (tipoUsuarioID != null) {
            usuario.setNombre(u.getNombre());
            usuario.setAp(u.getAp());
            usuario.setAm(u.getAm());
            usuario.setPassword(u.getPassword());
            usuario.setUser(u.getUser());
            usuario.setStatus(u.getStatus());
            usuario.setFkIdTipoUsuario(tipoUsuarioID);
            ServiceFacadeLocator.getFacadeUsuarios().addUsuarios(usuario, tipoUsuarioID);
        } else {
            System.out.println("tipo usuario no valido");
        }
    }

//    public static void main(String[] args) {
//        DelegateUsuarios du = new DelegateUsuarios();
//        DelegateTipoUsuario ftu = new DelegateTipoUsuario();
//
//        TipoUsuario tipoUsuarioID = ftu.getTipoUsuarioId(4);//asignarle  a tipo usuario con id 4=guardia
//        Usuarios u = new Usuarios();
//        u.setNombre("Antonio ");
//        u.setAp("Ruano");
//        u.setAm("Casarez");
//        u.setPassword("passARCAD#23P");
//        u.setUser("Usuario#$@FS");
//        u.setStatus("1");//cambiando a estatus 0
//        u.setFkIdTipoUsuario(tipoUsuarioID);
//        du.addUsuarios(u, tipoUsuarioID);
//    }
    public List<Usuarios> getListUsuarios() {
        return ServiceFacadeLocator.getFacadeUsuarios().getListUsuarios();
    }

    /**
     *
     * @param u
     * @param tu
     */
    public void update(Usuarios u, TipoUsuario tu) {
        try {
            Usuarios u1id = getUsuarioid(u.getIdUsuario());
            if (u1id != null) {
                TipoUsuario tipoUsuarioID = ServiceFacadeLocator.getFacadeTipoUsuario().tipoUsuarioID(tu.getIdTipoUsuario());
                if (tipoUsuarioID != null) {
                    Usuarios usuario = new Usuarios();
                    usuario.setIdUsuario(u.getIdUsuario());
                    usuario.setNombre(u.getNombre());
                    usuario.setAp(u.getAp());
                    usuario.setAm(u.getAm());
                    usuario.setPassword(u.getPassword());
                    usuario.setUser(u.getUser());
                    usuario.setStatus(u.getStatus());
                    usuario.setFkIdTipoUsuario(tipoUsuarioID);
                    ServiceFacadeLocator.getFacadeUsuarios().updateUsuarios(usuario, tipoUsuarioID);
                } else {
                    System.out.println("tipo usuario no valido");
                }
            } else {
                System.out.println("usuario a editar no existe");
            }

        } catch (Exception e) {
        }
    }

//    public static void main(String[] args) {
//        DelegateUsuarios du = new DelegateUsuarios();
//
//        Usuarios usuario = new Usuarios();
//        TipoUsuario tufind = ServiceFacadeLocator.getFacadeTipoUsuario().tipoUsuarioID(44);
//        usuario.setIdUsuario(14);
//        usuario.setNombre("Karina");
//        usuario.setAp("Apellido");
//        usuario.setAm("Materno");
//        usuario.setPassword("mipass123");
//        usuario.setUser("usereedita");
//        usuario.setStatus("1");
//        usuario.setFkIdTipoUsuario(tufind);
//
//        du.update(usuario,tufind);
//
//    }
    public void deleteUsuario(int id) {

        Usuarios usuario = getUsuarioid(id);
        if (usuario != null) {
            try {
                ServiceFacadeLocator.getFacadeUsuarios().deleteUsuario(id);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

        } else {
            System.out.println("usuario no valido");
        }

    }

}
