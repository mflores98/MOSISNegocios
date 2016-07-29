/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;

import com.mosis.entidades.Etiquetas;
import com.mosis.entidades.Usuarios;
import com.mosis.excepciones.MyException;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Owner
 */
public class FacadeEtiquetas {

//    public void insertarEtiquetas(String valor, String nombre, String lat, String lan, int fk_usuarioCreo) throws Exception {
//        ServiceLocator.getInstance().setTipo(Etiquetas.class);
//        try {
//            Etiquetas e = new Etiquetas();
//            FacadeUsuarios fu = new FacadeUsuarios();
//            Usuarios us = fu.usuariosId(fk_usuarioCreo);
//            if (us != null) {
//                e.setValorTag(valor);
//                e.setNombre(nombre);
//                e.setLatitud(lat);
//                e.setLongitud(lan);
//                e.setFechaCreacion(new Date());
//                e.setFechaModificacion(new Date());
//                e.setFkIdUsuarioCreo(us);
//                e.setFkIdUsuarioModifico(us);
//                ServiceLocator.getInstance().save(e);
//            } else {
//                throw new Exception();
//            }
//        } catch (MyException e) {
//            e.getMessage();
//        }
//    }
    /**
     * @param etiqueta
     * @param usuario
     */
    public void addEtiqueta(Etiquetas etiqueta, Usuarios uC) {
//
////        FacadeUsuarios fu = new FacadeUsuarios();
////        Usuarios us = fu.usuariosId(uC.getIdUsuario());
//
//        try {
//            if (us != null) {
//                ServiceLocator.getInstance().setTipo(Etiquetas.class);
//                Etiquetas etiquetas1 = new Etiquetas();
//
//                etiquetas1.setValorTag(etiqueta.getValorTag());
//                etiquetas1.setNombre(etiqueta.getNombre());
//                etiquetas1.setLatitud(etiqueta.getLatitud());
//                etiquetas1.setLongitud(etiqueta.getLongitud());
//                etiquetas1.setFechaCreacion(etiqueta.getFechaCreacion());
//                etiquetas1.setFechaModificacion(etiqueta.getFechaModificacion());
//
//                etiquetas1.setFkIdUsuarioCreo(us);
//                etiquetas1.setFkIdUsuarioModifico(us);
//                ServiceLocator.getInstance().save(etiquetas1);
//            } else {
//                throw new MyException();
//            }
//        } catch (Exception e) {
//            System.out.println("Error" + e);
//        }
    }
//
////    public static void main(String[] args) {
////        FacadeEtiquetas eti = new FacadeEtiquetas();
////        Etiquetas e = new Etiquetas();
////        e.setValorTag("TAG_S_Puerta");
////        e.setNombre("Puerta");
////        e.setLatitud("32.62453889999999");
////        e.setLongitud("-115.45226230000003");
////        e.setFechaCreacion(new Date());
////        e.setFechaModificacion(new Date());
////        FacadeUsuarios fu = new FacadeUsuarios();
////        Usuarios us = fu.usuariosId(2);
////        e.setFkIdUsuarioCreo(us);
////        e.setFkIdUsuarioModifico(us);
////        eti.addEtiqueta(e, us);
////    }
//    public void updateEtiqueta(Etiquetas etiqueta, Usuarios usuario) {
//
//        FacadeUsuarios fu = new FacadeUsuarios();
//        Usuarios us = fu.usuariosId(usuario.getIdUsuario());
//        if (us != null) {
//            ServiceLocator.getInstance().setTipo(Etiquetas.class);
//            Etiquetas e = new Etiquetas();
//            e.setIdEtiqueta(e.getIdEtiqueta());
//            e.setValorTag(etiqueta.getValorTag());
//            e.setNombre(etiqueta.getNombre());
//            e.setLatitud(etiqueta.getLatitud());
//            e.setLongitud(etiqueta.getLongitud());
//            //e.setFechaCreacion(etiqueta.getFechaCreacion());
//            e.setFechaModificacion(etiqueta.getFechaModificacion());
//            e.setFkIdUsuarioCreo(us);
//            e.setFkIdUsuarioModifico(us);
//            ServiceLocator.getInstance().saveOrUpdate(etiqueta);
//
//        } else {
//            System.out.println("usuario no existe");
//        }
//    }
//
////    public static void main(String[] args) {
////        FacadeEtiquetas eti = new FacadeEtiquetas();
////        Etiquetas e = new Etiquetas();
////        e.setIdEtiqueta(5);///editar etiqueta con id 7
////        e.setValorTag("TAG_S_Puerta");
////        e.setNombre("Puerta modificar");
////        e.setLatitud("32.6245388999999");
////        e.setLongitud("32.62453889999999");
////        e.setFechaCreacion(new Date());
////        e.setFechaModificacion(new Date());
////        FacadeUsuarios fu = new FacadeUsuarios();
////        Usuarios us = fu.usuariosId(1);//////////////////////////////usuario 1
////        e.setFkIdUsuarioCreo(us);
////        e.setFkIdUsuarioModifico(us);
////        eti.updateEtiqueta(e, us);
////    }
////    public void editarE(int idEti, String valorTag, String nombre, String latitud, String longitud, int idUsuarioModif) {
////
//////////        //FacadeEtiquetas fa = new FacadeEtiquetas();
//////////       // Etiquetas etiquetaId = fa.getEtiquetaId(idEti);
////        
////        Etiquetas etiquetaId = getEtiquetaId(idEti);
////        FacadeUsuarios fu = new FacadeUsuarios();
////        Usuarios usuariosId = fu.usuariosId(idUsuarioModif);
////
////        if (etiquetaId != null) {
////            if (usuariosId != null) {
////                ServiceLocator.getInstance().setTipo(Etiquetas.class);
////                Etiquetas e = new Etiquetas();
////                e.setIdEtiqueta(idEti);
////                e.setValorTag(valorTag);
////                e.setNombre(nombre);
////                e.setLatitud(latitud);
////                e.setLongitud(longitud);
////                e.setFechaModificacion(new Date());
////                e.setFkIdUsuarioModifico(usuariosId);
////                ServiceLocator.getInstance().saveOrUpdate(e);
////            } else {
////                System.out.println("Usuario no valido");
////            }
////        } else {
////            System.out.println("etiqueta no valida");
////        }
////    }
//
////    public static void main(String[] args) {
////        FacadeEtiquetas fe = new FacadeEtiquetas();
////        fe.editarE(1, "valorTagMod", "nombreMOd", "latitudMod", "longitudMod", 2);
////    }
//    public List<Object[]> getEtiquetasProcInner() {
//        ServiceLocator.getInstance().setTipo(Etiquetas.class);
//        return ServiceLocator.getInstance().executeQuery("call mosis.proc_etiquetas_all();");
//    }
//
////    public static void main(String[] args) {
////        FacadeEtiquetas fe=new FacadeEtiquetas();
////        List<Object[]> etiquetaIdProc = fe.getEtiquetaIdProc(1);
////        for (Object[] dato : etiquetaIdProc) {
////            System.out.println(dato[2].toString());
////        }
////        
////    }
////    public static void main(String[] args) {
////        FacadeEtiquetas fe = new FacadeEtiquetas();
////        List<Object[]> etiquetasProcInner = fe.getEtiquetasProcInner();
////        for (Object[] etiquetasProcInner1 : etiquetasProcInner) {
////            System.out.println(etiquetasProcInner1[2].toString());
////        }
////    }
////    public static void main(String[] args) {
////        FacadeEtiquetas etiquetas = new FacadeEtiquetas();
////        List<Object[]> da = etiquetas.getEtiquetaIdProc(1);
////        for (Object[] s : da) {
////            System.out.println(s[3].toString());
////        }
////    }
//    public List<Object[]> getEtiquetaIdProc(int valorid) {
////        ServiceLocator.getInstance().setTipo(Etiquetas.class);
////        ServiceLocator.getInstance().setTipo(Usuarios.class);
////        ServiceLocator.getInstance().setTipo(TipoUsuario.class);
////        
//        return ServiceLocator.getInstance().executeQuery("call mosis.proc_etiqueta_id(" + valorid + ");");
//    }
//
//    public List<Object[]> getEtique() {
//        return ServiceLocator.getInstance().executeQuery("call mosis.proc_etiquetas();");
//    }
////    public List<Object[]> getList(){
////        return ServiceLocator.getInstance().executeQuery("call proc_etiquetaprueba");
////    }
////    public static void main(String[] args) {
////        FacadeEtiquetas fe=new FacadeEtiquetas();
//////        List<Object[]> etiquetasProcInner = fe.getEtiquetasProcInner();
//////        for (Object[] etiquetasProcInner1 : etiquetasProcInner) {
//////            System.out.println(etiquetasProcInner1[1].toString());
//////        }
////        List<Object[]> list = fe.getEtiquetaIdProc(1);
////        for (Object[] list1 : list) {
////            System.out.println(list1[1].toString());
////        }
////        
////    }
//    public Etiquetas getEtiquetaId(int id) {
//        ServiceLocator.getInstance().setTipo(Etiquetas.class);
//        Etiquetas find = (Etiquetas) ServiceLocator.getInstance().find(id);
//        return find;
//    }
//
//    public void dellEtiqueta(int id) throws MyException {
//        ServiceLocator.getInstance().setTipo(Etiquetas.class);
//        Etiquetas find = (Etiquetas) ServiceLocator.getInstance().find(id);
//        if (find != null) {
//            ServiceLocator.getInstance().delete(find);
//        } else {
//            throw new MyException();
//        }
//    }
//
////    public Usuarios usuariosId(int id) {
////        ServiceLocator.getInstance().setTipo(Usuarios.class);
////        Usuarios find = (Usuarios) ServiceLocator.getInstance().find(id);
////        return find;
////    }
////    public static void main(String[] args) {
////        FacadeEtiquetas fe = new FacadeEtiquetas();
////        Usuarios usuariosId = fe.usuariosId(19);
////        if (usuariosId != null) {
////            System.out.println(usuariosId.getAm());
////
////        } else {
////            System.out.println("no existe");
////        }
////
////    }
//   
//    
//    

}
