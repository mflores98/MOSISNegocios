/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.delegate;

import com.mosis.entidades.Etiquetas;
import com.mosis.entidades.Usuarios;
import com.mosis.excepciones.MyException;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Owner
 */
public class DelegateEtiquetas {

//    DelegateUsuarios usuarios = new DelegateUsuarios();
//
////    public void insertEtiquetas(String valor, String nombre, String lat, String lan, int usuario) throws Exception {
////        ServiceFacadeLocator.getFacadeEtiquetas().insertarEtiquetas(valor, nombre, lat, lan, usuario);
////    }
//
//    /**
//     *
//     * @param etiquetas
//     * @param usuario
//     * @throws MyException Usuario no existe
//     */
//    public void addEtiqueta(Etiquetas etiquetas, Usuarios usuario) {
//        Etiquetas e = new Etiquetas();
//        Usuarios usuarioid = usuarios.getUsuarioid(usuario.getIdUsuario());
//
//        if (usuarioid != null) {
//            e.setValorTag(etiquetas.getValorTag());
//            e.setNombre(etiquetas.getNombre());
//            e.setLatitud(etiquetas.getLatitud());
//            e.setLongitud(etiquetas.getLongitud());
//            e.setFechaCreacion(new Date());
//            e.setFechaModificacion(new Date());
//            /////////Usuarios usuarioid = usuarios.getUsuarioid(usuario.getIdUsuario());
//            e.setFkIdUsuarioCreo(usuarioid);
//            e.setFkIdUsuarioModifico(usuarioid);
//            ServiceFacadeLocator.getFacadeEtiquetas().addEtiqueta(e, usuarioid);
//        } else {
//            System.out.println("usario no valido");
//        }
//    }
//
//    public static void main(String[] args) throws MyException {
//        DelegateEtiquetas eti = new DelegateEtiquetas();
//
////        Etiquetas e = new Etiquetas();
////        e.setValorTag("2valorEtiquetaTest");
////        e.setNombre("2NombreEtiquetaTest");
////        e.setLatitud("2LatEtiquetaTest");
////        e.setLongitud("2lanEtiquetaTest");
////        e.setFechaCreacion(new Date());
////        e.setFechaModificacion(new Date());
////        DelegateUsuarios du = new DelegateUsuarios();
////        Usuarios usuarioid = du.getUsuarioid(2);
////        e.setUsuariosByFkIdUsuarioCreo(usuarioid);
////        e.setUsuariosByFkIdUsuarioModifico(usuarioid);
////        eti.addEtiqueta(e, usuarioid);
//    }
//    public List<Object[]> obtenerEtiquetasAllProcInner() {
//        List<Object[]> etiquetas = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetasProcInner();
//        return etiquetas;
//    }
//
//    public List<Object[]> obtenerEtiquetaIdProc(int id) {
//        List<Object[]> etiquetaIdProc = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaIdProc(id);
//        return etiquetaIdProc;
//    }
//
////    public static void main(String[] args) {
////        DelegateEtiquetas de = new DelegateEtiquetas();
////        List<Object[]> d = de.obtenerEtiquetaIdProc(1);
////        for (Object[] d1 : d) {
////            System.out.println(d1[1].toString());
////        }
////    }
//
//    /**
//     * sin funcionar
//     *
//     * @param id
//     * @return
//     * @throws MyException
//     */
//    public Etiquetas getEtiquetaId(int id) throws MyException {
////        Etiquetas etiquetaToReturn = null;
//        Etiquetas dato = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(id);
//        if (dato != null) {
////            etiquetaToReturn = new Etiquetas(
////                    dato.getIdEtiqueta(),
////                    dato.getValorTag(),
////                    dato.getNombre(),
////                    dato.getLatitud(),
////                    dato.getLongitud(),
////                    dato.getFechaCreacion(),
////                    dato.getFechaModificacion(),
////                    dato.getFkIdUsuarioCreo(),
////                    dato.getFkIdUsuarioModifico()
////                    );
////            return etiquetaToReturn;
//            return dato;
//        } else {
//            System.out.println("dato no existe");
//            throw new MyException();
//        }
//
//    }
////
////    public static void main(String[] args) throws MyException {
////
//////            DelegateEtiquetas de = new DelegateEtiquetas();
//////            Etiquetas etiquetaId = de.getEtiquetaId(1);
//////            System.out.println(etiquetaId.getNombre());
////    }
//
////    public static void main(String[] args) {
////        try {
////            DelegateEtiquetas de = new DelegateEtiquetas();
////            Etiquetas e = de.getEtiquetaId(1);
////            System.out.println(
////                    e.getIdEtiqueta() + "- "
////                    + e.getValorTag() + "- "
////                    + e.getNombre() + "- "
////                    + e.getLat() + "- "
////                    + e.getLan() + "- "
////                    + e.getFechaCreacion() + "- "
////                    + e.getFechaModificacion());
////        } catch (MyException ex) {
////            System.out.println("Dato no existe");
////            //Logger.getLogger(DelegateEtiquetas.class.getName()).log(Level.SEVERE, null, ex);
////        }
////    }
//    public void dellEtiqueta(int id) throws MyException {
//        ServiceFacadeLocator.getFacadeEtiquetas().dellEtiqueta(id);
//    }

}
