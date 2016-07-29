/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;

import com.mosis.entidades.Etiquetas;
import com.mosis.entidades.Rutas;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class FacadeRutas {
//
//    public Rutas getRutaId(int id) {
//        ServiceLocator.getInstance().setTipo(Rutas.class);
//        Rutas rutas = (Rutas) ServiceLocator.getInstance().find(id);
//        return rutas;
//    }
//
//    public void addRutas(Rutas r, Etiquetas a, Etiquetas b) {
//        Etiquetas etiquetaA = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(a.getIdEtiqueta());
//        Etiquetas etiquetaB = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(b.getIdEtiqueta());
//        ServiceLocator.getInstance().setTipo(Rutas.class);
//        Rutas rutas = new Rutas();
//        rutas.setNombreRuta(r.getNombreRuta());
//        rutas.setFkIdEtiquetaA(etiquetaA);
//        rutas.setFkIdEtiquetaB(etiquetaB);
//        rutas.setFinaliza(r.getFinaliza());
//        ServiceLocator.getInstance().save(rutas);
//
//    }
//
////    public static void main(String[] args) {
////        FacadeRutas fr = new FacadeRutas();
////        Etiquetas a = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(5);
////        Etiquetas b = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(6);
////        if (a != null && b != null) {
////            Rutas rutas = new Rutas();
////            rutas.setNombreRuta("3era ruta");
////            rutas.setFkIdEtiquetaA(a);
////            rutas.setFkIdEtiquetaB(b);
////            rutas.setFinaliza("1");
////            fr.addRutas(rutas, a, b);
////        } else {
////            System.out.println("etiqueta no valida");
////        }
////
////    }
//    public void updateRutas(int id, Rutas r, Etiquetas a, Etiquetas b) {
//        Rutas rutaFind = getRutaId(id);
//        Etiquetas etiquetaA = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(a.getIdEtiqueta());
//        Etiquetas etiquetaB = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(b.getIdEtiqueta());
//
//        if (rutaFind != null && etiquetaA != null && etiquetaB != null) {
//            try {
//                ServiceLocator.getInstance().setTipo(Rutas.class);
//                Rutas rutas = new Rutas();
//                rutas.setNombreRuta(r.getNombreRuta());
//                rutas.setFkIdEtiquetaA(a);
//                rutas.setFkIdEtiquetaA(b);
//                rutas.setFinaliza(r.getFinaliza());
//                ServiceLocator.getInstance().saveOrUpdate(rutas);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        } else {
//            System.out.println("dato no valido");
//        }
//    }
////    public static void main(String[] args) {
////        FacadeRutas fr = new FacadeRutas();
////        Etiquetas a = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(6);
////        Etiquetas b = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(8);
////        Rutas rutas = new Rutas();
////        rutas.setNombreRuta("mi ruta editada");
////        rutas.setFkIdEtiquetaA(a);
////        rutas.setFkIdEtiquetaB(b);
////        rutas.setFinaliza("1");
////        fr.updateRutas(1, rutas, a, b);
////    }
//
//    public List<Rutas> getListRutas() {
//        ServiceLocator.getInstance().setTipo(Rutas.class);
//        List<Rutas> lista = ServiceLocator.getInstance().findAll();
//        return lista;
//    }
//
////    public static void main(String[] args) {
//////        List<Rutas> d = ServiceFacadeLocator.getFacadeRutas().getListRutas();
//////        for (Rutas d1 : d) {
//////            System.out.println(d1.getNombreRuta());
//////        }
////        
////        ServiceFacadeLocator.getFacadeRutas().deleteRuta(4);
////    }
//
//    public void deleteRuta(int id) {
//        ServiceLocator.getInstance().setTipo(Rutas.class);
//        Rutas r = ServiceFacadeLocator.getFacadeRutas().getRutaId(id);
//        ServiceLocator.getInstance().delete(r);
//    }
//
}
