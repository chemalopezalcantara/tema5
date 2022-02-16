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
     
    public static void main (String [] args) throws ExcepcionesTiendaDeportes {
      Scanner sc = new Scanner(System.in);   
      //imprimimos un mensaje por pantalla y llamamos al metdo que se encarga de comprobar y de lazar todo si todo va bien.
      System.out.println("****************************************************************");
      System.out.println("**********Bienvenido a la tienda de deportes: Decimas***********");
      System.out.println("****************************************************************");
      System.out.println(" ");
      
      
      //pedir codigo de articulo
        obtenerDatosArticulo();

        
    } //final del main
    
    
    
    //metodos
    
    private static void mostrarMenu(ArticuloDeportivo objeto) throws ExcepcionesTiendaDeportes {
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        //se ejcutara como minimo una vez, hasta que usuario ponga 10 por teclado
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
                      System.out.println("has escodigo la opcion de mostrar articulo: ");
                      System.out.println(objeto.getCodArticulo());
                      System.out.println("");
                      break;
                  case 2:
                      System.out.println("has escodigo la opcion de mostrar la descripción del articulo");
                      System.out.println(objeto.getDescripcion());
                      System.out.println(" ");
                      break;

                  case 3:
                      System.out.println("has escogido la opcion de mostrar el codigo de ciudad, es:");
                      System.out.println(objeto.getCiudad());
                      break;
                  case 4:
                      System.out.println("has escogido la opcion de mostrar el codigo de tienda, es:");
                      System.out.println(objeto.getTienda());
                      break;
                  case 5:
                      System.out.println("has escogido la opcion de mostrar el codigo reducido (6caracteres), es:");
                      System.out.println(objeto.getCodArticuloRed());
                      break;
                  case 6:
                      System.out.println("has escogido la opcion de mostrar el digito de control, es ");
                      double doubleCiudad, doubleTienda, doubleCodArticuloRed;
                       //debemos convertir los string a double para hacer el calculo, sin errores
                      doubleCiudad =Double.parseDouble(objeto.getCiudad());
                      doubleTienda = Double.parseDouble(objeto.getTienda());
                      doubleCodArticuloRed = Double.parseDouble(objeto.getCodArticuloRed());
                      System.out.println(obtDigControl(doubleCiudad, doubleTienda, doubleCodArticuloRed));
                      break;

                  case 7:
                      System.out.println("has escogido la opción aumentar unidades, indica cuantas unidades deseas aumentar");
                      int cantidadSumar = Integer.parseInt(leerTeclado());
                      if(cantidadSumar>0){
                         objeto.setUnidades(cantidadSumar);
                         System.out.println("SE HA AUMENTADO ");
                          System.out.println(" ");
                      }else{
                          System.out.println("no puedes sumar numeros negativos");
                      }
                      break;
                  case 8:
                      System.out.println("has escogido la opción disminuir unidades");
                      if(objeto.getUnidades()==0){
                          System.out.println("NO HAY UNIDADES QUE RESTAR");
                      }else{
                          System.out.println("indica las unidades que deseas restar");
                          int cantidadRestar = Integer.parseInt(leerTeclado());
                          if(objeto.getUnidades()<cantidadRestar || cantidadRestar<0){
                              System.out.println("no se puede realizar");
                          }else{
                              objeto.setUnidades(objeto.getUnidades()-cantidadRestar);
                          }
                          System.out.println("AHORA tienes estas unidades: " +objeto.getUnidades());
                      }
                      break;
                  case 9:
                      System.out.println("has escogido la opción comprobar unidades");
                      objeto.getUnidades();
                      if(objeto.getUnidades()==0){
                          System.out.println("no hay unidades");
                      }else{
                          System.out.println("hay: " + objeto.getUnidades());
                      }

                      System.out.println(" ");
                      break;
                  case 10:
                      System.out.println("la información del articulo es: ");
                      System.out.println(objeto.toString());
                      System.out.println(" ");
                      System.out.println("************************************************************************************************************");
                      System.out.println("**************************************hasta pronto de DECIMAS***********************************************");
                      System.out.println("************************************************************************************************************");
                      break;
              }

      }while(opcion != 10);
    } //final del metodo mostrarMenu;
    
    //metodo para leer por teclado:
    //private static String leerTeclado(String cadena){
       //String contenido = "";
       //contenido = cadena;
      //  return contenido;
    //}
    
    private static String leerTeclado() throws ExcepcionesTiendaDeportes{
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("introduce el dato:");
        String cadena = sc.nextLine();
        if(cadena.isEmpty()){
            System.out.println("has introducido un valor en blanco, REPITE");
            leerTeclado();
        }else{
            System.out.println( " ");
            System.out.println( "has introducido:" + cadena);
        }
        return cadena;
        }catch(Exception e){
            return "se ha producido una excepcion al leer por teclado"+ e;
        }

    }//final de leer teclado
    
    private static int leerOpcion() throws ExcepcionesTiendaDeportes{
        try{
            Scanner sc = new Scanner (System.in);
            System.out.println("introduce la opcion:");
        int opcion = sc.nextInt();
        
        if(opcion >0 && 10>=opcion){
            System.out.println("la opcion es correcta");
            return opcion;
        }
        else{
            System.out.println("no has escogido un numero correcto, REPITE");
            
            return 0;
        }
        }catch(Exception e){
            System.out.println("ha ocurrido un error con el tipo de dato");
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

    
    private static String extraerDatosCiudad(String codArticulo){
    String returnRango = " ";
    String rango = " ";
    for(int i = 0; i<=1; i++){
        rango = String.valueOf(codArticulo.charAt(i));

        returnRango +=rango;
    }
    return returnRango;
}
    private static String extraerDatosTienda(String codArticulo){
        String returnRango = " ";
        String rango = " ";
        for(int i = 2; i<=3; i++){
            rango = String.valueOf(codArticulo.charAt(i));

            returnRango +=rango;
        }
        return returnRango;
    }
    private static String extraerDatosCodArticulo(String codArticulo){
        String returnRango = " ";
        String rango = " ";
        for(int i = 4; i<=9; i++){
            rango = String.valueOf(codArticulo.charAt(i));

            returnRango +=rango;
        }
        return returnRango;
    }
    
    private static double obtDigControl(double ciudad, double tienda, double codArticuloRed){

        double operacion = (ciudad+tienda+codArticuloRed)%99;
        return operacion;
    }
    
    private static void obtenerDatosArticulo() throws ExcepcionesTiendaDeportes {
        //pedimos los datos necesarios usando el metodo creado por nosotros:
    System.out.println("introduce la descripcion");
    String descripcion = leerTeclado();
    System.out.println("introduce el codigo de articulo: ");
    String codArticulo = leerTeclado();
    
        if(validarDescripcion(descripcion)&& codArticulo.length()==12){
            //instanciamos el objeto, si cumple la verificación.
            
            String ciudad = extraerDatosCiudad(codArticulo);
            String tienda = extraerDatosTienda(codArticulo);
            String codArticuloRed = extraerDatosCodArticulo(codArticulo);
            
            ArticuloDeportivo objeto = new ArticuloDeportivo(descripcion, codArticulo, ciudad, tienda, codArticuloRed);
            System.out.println(objeto.toString());
            //llamamos al menu y le pasamos como parametro el objeto que acabamos de crear usando el constructor.
            mostrarMenu(objeto);
            
        }else{
            //sino lo cumple mostrara esto:
            System.out.println("no se cumplen con alguno de los requisitos");
        } 
      } //final de obtenerDatosArticulo
    
    
} //final de la clase
