/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;

import com.mosis.entidades.Persona;
import com.mosis.entidades.TipoUsuario;
import com.mosis.entidades.Usuarios;
import com.mosis.excepciones.MyException;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class FacadeUsuarios {

    /**
     * Funciona
     *
     * @param u
     * @param idTipoUsuario
     * @param idPersona
     * @throws MyException username ya existe, idTipoUsuario o idPersona no
     * validos.
     */
    public void addUsuario(Usuarios u, int idTipoUsuario, int idPersona) throws MyException {

        TipoUsuario tipoUsuario = ServiceFacadeLocator.getFacadeTipoUsuario().tipoUsuarioID(idTipoUsuario);
        Persona persona = ServiceFacadeLocator.getFacadePersona().getPersonaId(idPersona);
        List<Object[]> dato = ServiceFacadeLocator.getFacadeUsuarios().getUsuarioPorUserName(u.getUserName());
        if (tipoUsuario != null && persona != null && dato.isEmpty()) {
            ServiceLocator.getInstance().setTipo(Usuarios.class);
            Usuarios usuarios = new Usuarios();
            usuarios.setUserName(u.getUserName());
            usuarios.setPassword(u.getPassword());
            usuarios.setFkIdTipoUsuario(tipoUsuario);
            usuarios.setFkIdPersona(persona);
            ServiceLocator.getInstance().save(usuarios);
        } else {
            throw new MyException();
        }
    }
/**
 * 
 * @param username
 * @param u
 * @param idTipoUsuario
 * @param idPersona
 * @throws MyException username, itTipoUsuario o idPersona no valido.
 */
    public void updateUsuario1(String username, Usuarios u, int idTipoUsuario, int idPersona) throws MyException {

        List<Object[]> dato = ServiceFacadeLocator.getFacadeUsuarios().getUsuarioPorUserName(username);

        if (!dato.isEmpty()) {
            TipoUsuario tipoUsuario = ServiceFacadeLocator.getFacadeTipoUsuario().tipoUsuarioID(idTipoUsuario);
            Persona persona = ServiceFacadeLocator.getFacadePersona().getPersonaId(idPersona);

            Usuarios usuarioFind = ServiceFacadeLocator.getFacadeUsuarios().usuariosId(Integer.parseInt(dato.get(0)[0].toString()));

            if (tipoUsuario != null && persona != null) {
                ServiceLocator.getInstance().setTipo(Usuarios.class);
                Usuarios usuarios = new Usuarios();

                usuarios.setIdUsuario(usuarioFind.getIdUsuario());
                usuarios.setPassword(u.getPassword());
                usuarios.setFkIdPersona(persona);
                usuarios.setFkIdTipoUsuario(tipoUsuario);
                // usuarios.setUserName(username);
                ServiceLocator.getInstance().saveOrUpdate(usuarios);
            }
        } else {
            throw new MyException();
        }

    }

    public void updateUsuario2(int id, Usuarios u, int idTipoUsuario, int idPersona) {
        

    }
    

    public List<Object[]> getUsuarioPorUserName(String username) {
        List<Object[]> dato = ServiceLocator.getInstance().executeQuery("call mosis_dos.proc_get_usuario_por_username(" + username + ")");
        return dato;
    }

    public Usuarios usuariosId(int id) {
        ServiceLocator.getInstance().setTipo(Usuarios.class);
        Usuarios find = (Usuarios) ServiceLocator.getInstance().find(id);
        return find;
    }

    public void deleteUsuario(int id) {
        ServiceLocator.getInstance().setTipo(Usuarios.class);
        Usuarios usuario = (Usuarios) ServiceLocator.getInstance().find(id);
        ServiceLocator.getInstance().delete(usuario);
    }
//
////    public static void main(String[] args) {
////        FacadeUsuarios fu = new FacadeUsuarios();
////        FacadeTipoUsuario ftu = new FacadeTipoUsuario();
////        TipoUsuario tipoUsuarioID = ftu.tipoUsuarioID(1);
////        Usuarios u = new Usuarios();
////       // u.setIdUsuario(6);
////        u.setNombre("Jose");
////        u.setAp("Ramirez");
////        u.setAm("Gonzalez");
////        u.setPassword("pjrg2973");
////        u.setUser("ujrg8$#");
////        u.setStatus("1");
////        fu.addUsuarios(u, tipoUsuarioID);
//////        BaseDAO baseDAO = new BaseDAO();
//////        baseDAO.setTipo(Usuarios.class);
//////        baseDAO.setTipo(TipoUsuario.class);
//////
//////        TipoUsuario find = (TipoUsuario) baseDAO.find(1);
//////
//////        Usuarios u = new Usuarios();
//////        u.setAm("34qadad");
//////        u.setAp("aaop");
//////        u.setNombre("nomr");
//////        u.setPassword("passs");
//////        u.setStatus("1");
//////        u.setUser("susssau");
//////        u.setFkIdTipoUsuario(find);
//////        baseDAO.save(u);
////
////    }
//    /**
//     * funciona cuando se actualice la info se requiere modificar el user
//     *
//     * @param u
//     * @param tu
//     */
//    public void updateUsuarios(Usuarios u, TipoUsuario tu) {
//        FacadeTipoUsuario ftu = new FacadeTipoUsuario();
//        try {
//            Usuarios usuariosId = usuariosId(u.getIdUsuario());
//            if (usuariosId != null) {
//                TipoUsuario tipoUsuarioID = ftu.tipoUsuarioID(tu.getIdTipoUsuario());
//                if (tipoUsuarioID != null) {
//                    ServiceLocator.getInstance().setTipo(Usuarios.class);
//                    Usuarios u1 = new Usuarios();
//                    u1.setIdUsuario(u.getIdUsuario());
//                    u1.setNombre(u.getNombre());
//                    u1.setAp(u.getAp());
//                    u1.setAm(u.getAm());
//                    u1.setPassword(u.getPassword());
//                    u1.setStatus(u.getStatus());
//                    u1.setUser(u.getUser());
//                    u1.setFkIdTipoUsuario(tipoUsuarioID);
//                    ServiceLocator.getInstance().saveOrUpdate(u1);
//                } else {
//                    System.out.println("tipo usuario no valido");
//                }
//            } else {
//                System.out.println("usuario no valido");
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//            System.out.println("Error: " + e.getMessage());
//        }
//        
//    }
//
////    public static void main(String[] args) {
////        FacadeUsuarios fu = new FacadeUsuarios();
////        FacadeTipoUsuario ftu = new FacadeTipoUsuario();
////
////        TipoUsuario tipoUsuarioID = ftu.tipoUsuarioID(4);//moficar a tipo usuario con id 4=guardia
////        Usuarios u = new Usuarios();
////        u.setIdUsuario(16);//modificar usuario 16
////        u.setNombre("Juan ");
////        u.setAp("Lopez");
////        u.setAm("C.");
////        u.setPassword("Pjlp34#23");
////        u.setUser("modificUserss");
////        u.setStatus("1");//cambiando a estatus 0
////        fu.updateUsuarios(u, tipoUsuarioID);
////    }

//
////        public static void main(String[] args) {
////        FacadeUsuarios fu = new FacadeUsuarios();
////        Usuarios d = fu.usuariosId(1);
////        try {
////            System.out.println(d.getAm());
////
////        } catch (Exception e) {
////            System.out.println("dato no exies"+e);
////        }
////    }
//    public List<Object[]> getiUsuariosProc() {
//        return ServiceLocator.getInstance().executeQuery("call mosis.proc_usuarios_inner_tipo_usuario_();");
//    }
////        public static void main(String[] args) {
////        FacadeUsuarios fe = new FacadeUsuarios();
////    
////        List<Object[]> us = fe.getiUsuarios();
////        for (Object[] dato : us) {
////            System.out.println(dato[2].toString());
////        }
////    }
//
////    public void editar(int id,String user) {
////        ServiceLocator.getInstance().setTipo(Usuarios.class);
////        Usuarios u=new Usuarios();
////        u.setIdUsuario(id);
////        u.setUser(user);
////        ServiceLocator.getInstance().saveOrUpdate(u);
////    }
////    public static void main(String[] args) {
////        FacadeUsuarios fu=new FacadeUsuarios();
////        fu.editar(1, "uuuuuu");
////    }
//    public List<Usuarios> getListUsuarios() {
//        ServiceLocator.getInstance().setTipo(Usuarios.class);
//        List<Usuarios> dato = ServiceLocator.getInstance().findAll();
//        return dato;
//    }
//
////    public static void main(String[] args) {
////        FacadeUsuarios s = new FacadeUsuarios();
////        List<Usuarios> dat = s.getListUsuarios();
////        for (Usuarios dat1 : dat) {
////            System.out.println("1.- "+dat1.getNombre());
////        }
////    }
}
