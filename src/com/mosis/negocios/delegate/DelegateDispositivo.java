/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.delegate;

import com.mosis.entidades.Dispositivos;
import com.mosis.negocios.integracion.ServiceFacadeLocator;
import java.util.List;

/**
 *
 * @author Owner
 */
public class DelegateDispositivo {
    
    public void addDispositivos(Dispositivos d) {
        Dispositivos dispositivo = new Dispositivos();
        dispositivo.setImei(d.getImei());
        dispositivo.setMarca(d.getMarca());
        dispositivo.setModelo(d.getModelo());
        dispositivo.setStatus(d.getStatus());
        ServiceFacadeLocator.getFacadeDispositivo().addDisporitivo(dispositivo);
    }
    
//    public static void main(String[] args) {
//        DelegateDispositivo dd = new DelegateDispositivo();
//        Dispositivos dispositivo = new Dispositivos();
//        dispositivo.setImei("12345");
//        dispositivo.setMarca("marca12");
//        dispositivo.setModelo("modelo12");
//        dispositivo.setStatus("1");
//        dd.addDispositivos(dispositivo);
//    }
    
    public void updateDispositivos(Dispositivos d) {
        Dispositivos dispositivo = new Dispositivos();
        dispositivo.setIdDispositivo(d.getIdDispositivo());
        dispositivo.setImei(d.getImei());
        dispositivo.setMarca(d.getMarca());
        dispositivo.setModelo(d.getModelo());
        dispositivo.setStatus(d.getStatus());
        ServiceFacadeLocator.getFacadeDispositivo().updateDispositivos(d);
    }
    
    public List<Dispositivos> getListDispositvos() {
        return ServiceFacadeLocator.getFacadeDispositivo().getListDispositivos();
    }
    
    public void deleteDispositivo(int id) {
        Dispositivos dispositivoId = getDispositivoId(id);
        if (dispositivoId != null) {
            ServiceFacadeLocator.getFacadeDispositivo().deleteDispositivo(id);
        }
    }
    
    public Dispositivos getDispositivoId(int id) {
        return ServiceFacadeLocator.getFacadeDispositivo().getDipospositivoId(id);
    }
    
}
