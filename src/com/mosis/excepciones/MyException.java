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
public class MyException extends Exception {

    public static final long serialVersionUID = 700L;

    @Override
    public String getMessage() {
        return "Error interno.";
    }

//    public String getMesage() {
//        return "";
//    }

//    public MyException(String mensaje) {
//        super(mensaje);
//    }
}
