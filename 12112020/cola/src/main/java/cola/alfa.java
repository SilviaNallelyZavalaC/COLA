/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class alfa {
    
public static Scanner sc = new Scanner(System.in);
    public static char letraS, a = 0, d;
    public static int cima = 0, TAMANO = 26, i;
    public static char pila[] = new char[TAMANO];

    public static void llenar() {
        if (cima < 26) {
            for (cima= 0; cima< TAMANO; cima++) {
                pila[cima] = (char) (Math.random() * TAMANO + 'a');
                for (int j = 0; j < cima; j++) {
                    if (pila[cima] == pila[j]) {
                        cima--;
                    }
                }
            }
        }else{
            System.out.println("la pila esta repleta");
        }
    }

   public static void mostrar() {
        for (i = cima - 1; i >= 0; i--) {
            System.out.print(pila[i] + " ");
        }
    }

    public static void eliminar() {
        if (cima != 0) {
            System.out.println("DATO ELIMINADO");
            cima--;
        } else {
            System.out.println("SIN ELEMENTOS A ELIMINAR");
        }
    }

    public static void agregar() {
        if (cima < TAMANO) {
            System.out.println("INGRESE LA LETRA QUE GUSTE");

            letraS = sc.next().charAt(0);
            pila[cima] = letraS;
            cima++;
            letraS++;

        } else {
        }
    }
   public static void ordenar() { 
        for (i = 0; i < TAMANO; i++) {
            for (int j = 0; j < (TAMANO - 1); j++) {
                if (pila[j] > pila[j + 1]) {
                    a = pila[j];
                    pila[j] = pila[j + 1];
                    pila[j + 1] = a;
                }
            }
        }
        for (i = 0; i < TAMANO; i++) {

        }

        System.out.println("EN ORDEN");
    }
   //aqui muestra si tiene algun elemento y a la vez muestra donde se selecciono
  public static void anular() {
        if (cima> 0) {
            System.out.println("DESDE DONDE GUSTAS ELIMINAR");
            d = sc.next().charAt(0);
            for (i = 0; i < TAMANO; i++) {
                if (pila[i] == d) {
                    cima = i;

                    System.out.println("¡Ready!");

                }
            }
        } else{
            System.out.println("ESTA VACIA ESTA PILA: ");
        }
 
    }
 
    public static void main(String[] args) {
 
        alfa objeto=new alfa();
 
        Scanner opcion = new Scanner(System.in);
        int seleccion;
 
        do
        {
 
          System.out.println("Menu de pila");//Creamos un menú sencillo para la pila
          System.out.println("1. Llenar");
          System.out.println("2. Mostrar");
          System.out.println("3. Eliminar");
          System.out.println("4. Agregar");
          System.out.println("5. Ordenar");
          System.out.println("6. borrar a partir de una numero");
          System.out.println("7. Salir");//Salir de nuestro pequeño menú principal
 
          System.out.println("Teclee la opcion"); //EL USUARIO VA A DIGITAR EL NUMERO QUE SE LE BRINDA EN EL MENU
          seleccion=opcion.nextInt();
 
           switch(seleccion){
              case 1:
                  llenar();
                  break;
              case 2:
                  mostrar();
                  break;
              case 3:
                  eliminar();
                  break;
                  
              case 4:
                  agregar();
                  break;
              case 5:
                  ordenar();
                  break;
              case 6:
                  eliminar();
                  break; 
              case 7:
                  
                  break;
              
              default:
                  System.out.println("Error\nOpcion invalida");
          }
 
        }while(seleccion!=7);
 
    }
}
