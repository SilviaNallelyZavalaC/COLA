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
public class alfabeto {
    
public static void main(String[] args) {
        // TODO code application logic here
        
        
        
Scanner sc= new Scanner(System.in);
       
       int tope=0,opt,var=0;
       char alf[]=new char[26];
       do{System.out.println
        ("\n1- Llenar\n"
            + "2- Mostrar datos\n"
            + "3- Eliminar dato \n"
            + "4- Agregar dato\n"
            + "5- Salir\n");
       switch(opt=sc.nextInt()){
           
           case 1:
               //Se llenan los espacios 
               if(tope<=26){
               System.out.println("Imposible se ha llenado");
               for (int i = 0; tope < 26 ; i++) {
               alf[tope]=(char)('a'+i);
               tope++;
               }
               }
               break;
           case 2:
               //Muestra los elementos 
               System.out.println("Son los siguientes elementos");
               for (int i = tope-1 ; i >= 0; i--) {
                   System.out.print("  "+alf[i]);
               }
               break;
           case 3:
               //Esto hace que se elimine el ultimo dato
               if(tope>0)
               {
               System.out.println("Ultimo dato eliminado");
               tope--;
               }else{
                   System.out.println("Vacia");
               }
                  
               break;
           case 4:
               
               //no permite que se llene 
               if(tope<26)
               {
                   
               System.out.println("Agrega dato");
               alf[tope]=sc.next().charAt(0);
               tope++;
               }else{
                   System.out.println("Imposible se ha llenado");
               }
               break;
          
       }
           //Sale de bucle 
       }while(opt !=5);
    }
    
}

