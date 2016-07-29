/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;

import com.mosis.entidades.Dispositivos;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class FacadeDispositivo {

    public void addDisporitivo(Dispositivos d) {
        ServiceLocator.getInstance().setTipo(Dispositivos.class);
        Dispositivos dispositivo = new Dispositivos();
        dispositivo.setImei(d.getImei());
        dispositivo.setMarca(d.getMarca());
        dispositivo.setModelo(d.getModelo());
        dispositivo.setStatus(d.getStatus());
        ServiceLocator.getInstance().save(dispositivo);
    }

//    public void inser(String imei, String marc, String modelo, String status) {
//        ServiceLocator.getInstance().setTipo(Dispositivos.class);
//        Dispositivos dispositivo=new Dispositivos();
//        dispositivo.setImei(imei);
//        dispositivo.setMarca(marc);
//        dispositivo.setModelo(modelo);
//        dispositivo.setStatus(status);
//        ServiceLocator.getInstance().save(dispositivo);
//    }
//    public static void main(String[] args) {
//        FacadeDispositivo fd = new FacadeDispositivo();
//        Dispositivos dispositivos = new Dispositivos();
//        dispositivos.setImei("098726543221");
//        dispositivos.setMarca("NDO");
//        dispositivos.setModelo("200");
//        dispositivos.setStatus("1");
//        fd.addDisporitivo(dispositivos);
//    }
//    //    fd.inser("iii", "mmm", "mo", "1");
////        Dispositivos dispositivo = new Dispositivos();
////        dispositivo.setIdDispositivo(3);
////        dispositivo.setImei("232sad");
////        dispositivo.setMarca("23");
////        dispositivo.setModelo("rew");
////        dispositivo.setStatus("1");
////        fd.updateDispositivos(dispositivo);
//        List<Dispositivos> d = fd.getListDispositivos();
//        for (Dispositivos d1 : d) {
//                    System.out.println(d1.getMarca());
//
//        }
//
//    }
    public Dispositivos getDipospositivoId(int id) {
        ServiceLocator.getInstance().setTipo(Dispositivos.class);
        Dispositivos find = (Dispositivos) ServiceLocator.getInstance().find(id);
        return find;
    }

//    public static void main(String[] args) {
////        ServiceFacadeLocator.getFacadeDispositivo().deleteDispositivo(8);
//        
//        Dispositivos  dispositivos=new Dispositivos(1, "12345678910","2020", "NOKIA", "1");
//        ServiceFacadeLocator.getFacadeDispositivo().updateDispositivos(dispositivos);
//    }

    public List<Dispositivos> getListDispositivos() {
        ServiceLocator.getInstance().setTipo(Dispositivos.class);
        List<Dispositivos> findAll = ServiceLocator.getInstance().findAll();
        return findAll;
    }

    /**
     * correcto
     *
     * @param id
     */
    public void deleteDispositivo(int id) {
        ServiceLocator.getInstance().setTipo(Dispositivos.class);
        Dispositivos find = getDipospositivoId(id);
        ServiceLocator.getInstance().delete(find);
    }

    public void updateDispositivos(Dispositivos d) {
        ServiceLocator.getInstance().setTipo(Dispositivos.class);
        Dispositivos dispositivo = new Dispositivos();
        dispositivo.setIdDispositivo(d.getIdDispositivo());
        dispositivo.setImei(d.getImei());
        dispositivo.setMarca(d.getMarca());
        dispositivo.setModelo(d.getModelo());
        dispositivo.setStatus(d.getStatus());
        ServiceLocator.getInstance().saveOrUpdate(dispositivo);
    }

}
