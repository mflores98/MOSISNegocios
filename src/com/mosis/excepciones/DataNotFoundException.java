/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mosis.excepciones;

/**
 *
 * @author Owner
 */
public class DataNotFoundException extends RuntimeException {

        private static final long serialVersionUID = 700L;


    public DataNotFoundException(String message) {
        super(message);
    }

}
