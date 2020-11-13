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
public class colas {
    public static void main (String[ ]  args){
        
         int prueba[]=new int[4];
    prueba[0]=1;
    prueba[1]=2;
    prueba[2]=3;
    prueba[3]=4;
    //La PILA:
    // El ultimo que entra es el primero en salir 
   System.out.println("Inicio");
    for(int i=prueba.length-1; i>=0;i--){    
   System.out.println(""+prueba[i]);   
   }    
   System.out.println("Final");
   //La COLA:
   // El primero que entra es el primero en salir
      System.out.println("Inicio Cola");   
   for(int j=0; j<prueba.length; j++ ){ 
   System.out.println(""+prueba[j]);
   }
   System.out.println("Final Cola");
        
    
        Scanner lector =new Scanner (System.in);
        int opc;
        System.out.println(""
                + "1.Pila ejercicio 1. 1 "+ // Realice el menu
                "2.Pila ejercicio 1.1 "+
                "3.Pila ejercicio 1.2"+
                "4.Pila ejercicio 1.3"+
                "5.Pila ejercicio 1.4"+
                "6.Exit");
        opc = lector.nextInt();
        switch(opc){
            case 1:
                Pila.main(args); //mando llamar
                break;
            case 2:
                alfabeto.main(args);
                break;
            case 3:
                ALfa1.main(args);
                break;
            case 4:
               pila1 .main(args);
                break;
            case 5:
                alfa.main(args);
                break;
                
                
        }
    }
            
}




