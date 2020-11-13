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
public class pila1 {
    
 //Aqui creamos las variables que nos ayudaran a crear las pilas
    public int cima=0;
    public int tamano=10;
    public int vectorpila[]=new int [tamano];
    public int vectorpila2[]=new int [tamano];
    public  int vectorpila3 [] = new  int [tamano];
    //Este metodo sirve para generar los numeros aleatorios
    public void insertar(){
        /*este for lo que hace es que se va a repetir
        dependiendo el tamaño de la variable "tamano"
        */
        for (int i = 0; i < tamano; i++) {
            //Este metodo lo que hace es generar numeros aleatorios del 1 al 100
            vectorpila[i]=(int) (Math.random() *100+1);
            //Aqui aumenta el valor de cima
            cima++;
        }
        System.out.println("Pila llena");
    }
    //Aqui creamos la pila 2 con las mismas propiedades del 1
    public void insertar2(){
        for (int i = 0; i < tamano; i++) {
            vectorpila2[i]=(int) (Math.random() *100+1);
            
            cima++;
        }
    }
    
    public void mostrar(){
        System.out.println("Esta es la pila:");
        for (int i = 0; i < tamano; i++) {
            //Este for lo que hace es imprimir los valores del metodo insertar
            System.out.print(vectorpila[i]+" ");
        }
        System.out.println("Esta es la pila 2:");
        //Este for lo que hace es imprimir los valores del metodo insertar 
        for (int i = 0; i < 10; i++) {
            System.out.print(vectorpila2[i]+" ");
        }
    }
    
   public void vaciar(){

for ( int i=0; i< tamano; i++)
{
cima--;
}
} 
   public void unir (){
       for (int i=0; i< tamano;i++){
           vectorpila3[i]=vectorpila[i]+vectorpila2[i];
       }
   }
   
 public void vectorpila3(){
     System.out.println("pila3:");
     for (int i = 0; i < tamano; i++){
     System.out.println(vectorpila3[i]+" ");
     
 }
 }
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Aqui creamo un objeto para poder llamar los metodos que creamos
        pila1 c= new pila1();
        //Esta variable sirve para escoger que "case" hacer
        int opc;
        do {            
            
            System.out.println("\n1. Llenar pila"
                    + "\n2. Mostrar pila"
                    + "\n3 Vaciar pila"
                    + "\n4. Unir pilas"
                    + "\n5.Ver pila3");
            
            switch(opc=sc.nextInt()){
                case 1:
                    c.insertar();c.insertar2();
                break;   
                case 2:
                    c.mostrar();
                break;
                case 3:
                    c.vaciar();
                    break;
                case 4:
                c.unir();
                break;
                case 5:
                c.vectorpila3();
                 break;
            }
            
        } while (opc!=6);
        
    }
    
}

