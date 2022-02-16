/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.navarro_sanchez_victor_prog05_tarea;

import jdk.jshell.spi.ExecutionControlProvider;

/**
 *
 * @author Victor
 */

//esta clase se encarga de gestionar las posibles excepciones que ocurrar en el programa, retornando los datos.
public class ExcepcionesTiendaDeportes extends Exception {
    public ExcepcionesTiendaDeportes(String message){
        super(message);
    }
    
}//final de la clase
