/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.navarro_sanchez_victor_prog05_tarea;

/**
 *
 * @author Victor
 */
public class ArticuloDeportivo {
    
    //atributos
    String descripcion;
    String codArticulo;
    
    //metodos para validad descripcion y codArticulo
    
    
    
    //unidades, atributo contador
    
    //metodos getters y setters

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(String codArticulo) {
        this.codArticulo = codArticulo;
    }
    
    
    
    
    
    
    
    //3 contructores
        //Uno	con	valores	por	defecto.
        //Otro	recibiendo	todo	lo	necesario	para	dar	identidad	al	artículo.
        //Constructor	copia	a	partir	de	otro	objeto	artículo.	(como	se	ve	en	los	apuntes)

    public ArticuloDeportivo(String descripcion, String codArticulo) {
        this.descripcion = descripcion;
        this.codArticulo = codArticulo;
    }

    //toString
    @Override
    public String toString() {
        return "ArticuloDeportivo{" + "descripcion=" + descripcion + ", codArticulo=" + codArticulo + '}';
    }



    

    



}//final de la clase
