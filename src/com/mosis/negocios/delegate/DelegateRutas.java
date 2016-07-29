/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.delegate;

import com.mosis.entidades.Etiquetas;
import com.mosis.entidades.Rutas;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class DelegateRutas {

//    public void addRutas(Rutas r, Etiquetas a, Etiquetas b) {
//        Etiquetas etiA = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(a.getIdEtiqueta());
//        Etiquetas etiB = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(b.getIdEtiqueta());
//        if (etiA != null && etiB != null) {
//            Rutas rutas = new Rutas();
//            rutas.setNombreRuta(r.getNombreRuta());
//            rutas.setFkIdEtiquetaA(etiA);
//            rutas.setFkIdEtiquetaB(etiB);
//            rutas.setFinaliza(r.getFinaliza());
//            ServiceFacadeLocator.getFacadeRutas().addRutas(rutas, etiA, etiB);
//        } else {
//            System.out.println("dato no valido");
//        }
//    }
////    public static void main(String[] args) {
////        Etiquetas etiA = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(2);
////        Etiquetas etiB = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(3);
////        Rutas ruta = new Rutas(null, "ruta 5", etiA, etiB, "1");
////        ServiceFacadeLocator.getFacadeRutas().addRutas(ruta, etiA, etiB);
////    }
//
//    public void updateRutas(int id, Rutas r, Etiquetas a, Etiquetas b) {
//        Rutas rutaid = ServiceFacadeLocator.getFacadeRutas().getRutaId(id);
//        Etiquetas etiA = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(a.getIdEtiqueta());
//        Etiquetas etiB = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(b.getIdEtiqueta());
//
//        if (rutaid != null && etiA != null && etiB != null) {
//            Rutas rutas = new Rutas(id, r.getNombreRuta(), etiA, etiB, r.getFinaliza());
//            ServiceFacadeLocator.getFacadeRutas().updateRutas(id, rutas, etiA, etiB);
//        } else {
//            System.out.println("datos no validos");
//        }
//    }
//
////    public static void main(String[] args) {
////        Etiquetas eta = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(2);
////        Etiquetas etb = ServiceFacadeLocator.getFacadeEtiquetas().getEtiquetaId(3);
////
////        Rutas rutas = new Rutas();
////        rutas.setNombreRuta("ruta editada");
////        rutas.setFkIdEtiquetaA(eta);
////        rutas.setFkIdEtiquetaB(etb);
////        rutas.setFinaliza("1");
////        ServiceFacadeLocator.getFacadeRutas().updateRutas(3, rutas, eta, etb);
////    }
//    public void deleteRuta(int id) {
//        Rutas r = ServiceFacadeLocator.getFacadeRutas().getRutaId(id);
//        if (r != null) {
//            ServiceFacadeLocator.getFacadeRutas().deleteRuta(id);
//        } else {
//            System.out.println("ruta no valida");
//        }
//    }
//
//    public Rutas getRutaId(int id) {
//        return ServiceFacadeLocator.getFacadeRutas().getRutaId(id);
//    }
//
//    public List<Rutas> getListRutas() {
//        return ServiceFacadeLocator.getFacadeRutas().getListRutas();
//    }
}
