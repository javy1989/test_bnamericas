/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.rest.exception;

/**
 *
 * @author ricardo.bravo
 */
public class SaveException extends Exception {

    public SaveException(String message) {
        super("Error al ingresar el registro:  \n" + message);
    }

    public SaveException(String message, Throwable cause) {
        super("Error al ingresar el registro: \n" + message, cause);
    }

}
