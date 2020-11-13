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
public class ALfa1 {
    public static Scanner sc = new Scanner(System.in);
    public static char letraS, aux = 0, delete;
    public static int tope = 0, TAMANO = 26, i;
    public static char pila[] = new char[TAMANO];

    public static void llenar() {
        if (TAMANO == 0) {
            for (i = 0; i < TAMANO; i++) {
                pila[i] = (char) (Math.random() * TAMANO + 'a');
                for (int j = 0; j < i; j++) {
                    if (pila[i] == pila[j]) {
                        i--;
                    }
                }
System.out.println("LA PILA SE ENCUENTRA REPLETA");
            }
        }
    }

   public static void enseñar() {
        for (i = tope - 1; i >= 0; i--) {
            System.out.print(pila[i] + " ");
        }
    }

    public static void eliminar() {
        if (tope != 0) {
            System.out.println("DATO ELIMINADO");
            tope--;
        } else {
            System.out.println("SIN ELEMENTOS A ELIMINAR");
        }
    }

    public static void agregar() {
        if (tope < TAMANO) {
            System.out.println("INGRESE LA LETRA QUE GUSTE");

            letraS = sc.next().charAt(0);
            pila[tope] = letraS;
            tope++;
            letraS++;

        } else {
        }
    }
   public static void ordenar() { 
        for (i = 0; i < TAMANO; i++) {
            for (int j = 0; j < (TAMANO - 1); j++) {
                if (pila[j] > pila[j + 1]) {
                    aux = pila[j];
                    pila[j] = pila[j + 1];
                    pila[j + 1] = aux;
                }
            }
        }
        for (i = 0; i < TAMANO; i++) {

        }

        System.out.println("EN ORDEN");
    }
   //aqui muestra si tiene algun elemento y a la vez muestra donde se selecciono
  public static void anular() {
        if (tope > 0) {
            System.out.println("DESDE DONDE GUSTAS ELIMINAR");
            delete = sc.next().charAt(0);
            for (i = 0; i < TAMANO; i++) {
                if (pila[i] == delete) {
                    tope = i;

                    System.out.println("¡Ready!");

                }
            }
        } else{
            System.out.println("ESTA VACIA ESTA PILA: ");
        }
 
    }
 
    public static void main(String[] args) {
 
        ALfa1 objeto=new ALfa1();
 
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
 
          System.out.println("Teclee la opcion"); //EL USUARIO VA A 
          seleccion=opcion.nextInt();
 
           switch(seleccion){
              case 1:
                  llenar();
                  break;
              case 2:
                  enseñar();
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
                  System.out.println("Error Opcion invalida");
          }
 
        }while(seleccion!=7);
 
    }
}

