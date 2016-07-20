/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.negocios.facade;
//
//import com.mosis.persistencia.CriterioBusqueda;
//import com.mosis.persistencia.integracion.ServiceLocator;
import com.mosis.persistencia.CriterioBusqueda;
import com.mosis.persistencia.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author xhendor
 */
public class FacadeCriteria {
      public List getByCriteria(Class clase, List <CriterioBusqueda> criterioBusqueda){
        return ServiceLocator.getInstanceCriteria(clase).getByCriteria(criterioBusqueda);
    
}
}
