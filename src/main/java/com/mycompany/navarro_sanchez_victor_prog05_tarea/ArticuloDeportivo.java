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
    private String descripcion;
    private String codArticulo;
    private String ciudad;
    private String tienda;
    private String codArticuloRed;
    private String digitoControl;
    private static int unidades;
     
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public String getCodArticuloRed() {
        return codArticuloRed;
    }

    public void setCodArticuloRed(String codArticuloRed) {
        this.codArticuloRed = codArticuloRed;
    }

    public String getDigitoControl() {
        return digitoControl;
    }

    public void setDigitoControl(String digitoControl) {
        this.digitoControl = digitoControl;
    }

    public static int getUnidades() {
        return unidades;
    }

    public static void setUnidades(int unidades) {
        ArticuloDeportivo.unidades = unidades;
    }

    //3 contructores
        //Uno	con	valores	por	defecto.
        //Otro	recibiendo	todo	lo	necesario	para	dar	identidad	al	artículo.
        //Constructor	copia	a	partir	de	otro	objeto	artículo.	(como	se	ve	en	los	apuntes)
    public ArticuloDeportivo(){
        this.descripcion = "esta es la descripcion del articulo";
        this.codArticulo = "130100009914";
        this.ciudad = "13";
        this.tienda = "01";
        this.codArticuloRed = "000099";
        this.digitoControl = "14";
    }

    public ArticuloDeportivo(String descripcion, String codArticulo, String ciudad, String tienda, String codArticuloRed) {
        this.descripcion = descripcion;
        this.codArticulo = codArticulo;
        this.ciudad = ciudad;
        this.tienda = tienda;
        this.codArticuloRed = codArticuloRed;
        
    }
    
    //constructor copia
    public ArticuloDeportivo(ArticuloDeportivo objeto){
        this.descripcion = objeto.getDescripcion();
        this.codArticulo = objeto.getCodArticulo();
        this.ciudad = objeto.getCiudad();
        this.tienda = objeto.getTienda();
        this.codArticuloRed = objeto.getCodArticuloRed();
        this.digitoControl = objeto.getDigitoControl();
    }

    
    //toString

    @Override
    public String toString() {
        return "ArticuloDeportivo{" + "descripcion=" + descripcion + ", codArticulo=" + codArticulo + ", ciudad=" + ciudad + ", tienda=" + tienda + ", codArticuloRed=" + codArticuloRed + '}';
    }

   
    
    



    

    



}//final de la clase
