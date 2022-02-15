/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.navarro_sanchez_victor_prog05_tarea;
import java.util.Scanner;
/**
 *
 * @author Victor
 */
public class LanzadorTienda {
     
    public static void main (String [] args){
      Scanner sc = new Scanner(System.in);   
        
      System.out.println("****************************************************************");
      System.out.println("**********Bienvenido a la tienda de deportes: Decimas***********");
      System.out.println("****************************************************************");
      System.out.println(" ");
      
      
      //pedir codigo de articulo
      
    System.out.println("introduce la descripcion");
        String descripcion = leerTeclado();

    System.out.println("introduce el codigo de articulo: ");
        String codArticulo = leerTeclado();

        
        if (validarDescripcion(descripcion)&&validarArticulo(codArticulo)){
            System.out.println("la descripcion y el cod son correctos");
            ArticuloDeportivo objeto = new ArticuloDeportivo(descripcion, codArticulo);
            System.out.println(objeto.toString());
        }else{
            System.out.println("no se han introducido los datos correctamente");
        }
      
      
      
        mostrarMenu();
        
        
        
        
        
    } //final del main
    
    
    
    //metodos
    
    private static void mostrarMenu(){
        Scanner sc = new Scanner (System.in);
        try{
          int opcion = 0;  
          do{
              
                
                System.out.println("MENU PRINCIPAL");
                System.out.println("1. Ver el código completo del articulo");
                System.out.println("2. Ver la descripcion del articulo");
                System.out.println("3. Ver el codigo de la ciudad");
                System.out.println("4. Ver el código de la tienda");
                System.out.println("5. Ver el código del articulo");
                System.out.println("6. Ver el digito de control");
                System.out.println("7. Aumentar unidades");
                System.out.println("8. Decrementar unidades");
                System.out.println("9. Consultar unidades");
                System.out.println("10. Salir");  
                System.out.println(" ");
               
                //opcion = sc.nextInt();
                opcion = leerOpcion();
                
                switch(opcion){
                    case 1:
                        System.out.println("has escogido la opción 1");
                        
                        System.out.println("introduce el codigo de pedido: ");
                        leerTeclado();
                        
                       
                        
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                }
                
        }while(opcion != 10);  
        }catch(Exception e){
            System.out.println("ha ocurrido un error: " + e.getMessage());
        } //final del catch
    } //final del metodo mostrarMenu;
    
    //metodo para leer por teclado:
    //private static String leerTeclado(String cadena){
       //String contenido = "";
       //contenido = cadena;
      //  return contenido;
    //}
    
    private static String leerTeclado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el dato:");
        String cadena = sc.nextLine();
        System.out.println( " ");
        System.out.println( "has introducido:" + cadena);
        
        return cadena;
        
    }
    
    private static int leerOpcion(){
        Scanner sc = new Scanner (System.in);
        System.out.println("introduce la opcion:");
        int opcion = sc.nextInt();
        if(opcion >0 || 10>opcion){
            System.out.println("la opcion es correcta");
            return opcion;
        }else{
            System.out.println("no has escogido un numero correcto");
            return 0;
        }
    } //final de leerOpcion
    
    
    
    private static boolean validarDescripcion(String descripcion){
        int lonDescripcion= descripcion.length();
        if((lonDescripcion>0 && lonDescripcion<40)){
            System.out.println("la descripcion es correcta");
            return true;
        }else{
            System.out.println("la descripcion es incorrecta");
            return false;
        }//final del false
    }//final del metodo validarDescripcion

    private static boolean validarArticulo(String codArticulo){
        int lonArticulo = codArticulo.length();
        if((lonArticulo==12)&&validarNumArticulo(codArticulo)==true){
            System.out.println("se ha creado el articulo correctamente");

            return true;
        }else{
            System.out.println("algo ha salido mal");
            return false;
        }//final del else
    } //final validar articulo

    public static boolean validarNumArticulo(String codArticulo){
        try {
            Double.parseDouble(codArticulo);
            return true;
        }catch (NumberFormatException e){
            System.out.println("no es un numero: "+ e );
            return false;
        }
    }
    
   
    
    
} //final de la clase
