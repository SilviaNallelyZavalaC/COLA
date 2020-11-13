package cola;


import java.util.Scanner;



public class Pila
{
    private int tope;
    private final int max;
 private final String pila[];

 public Pila(int m)
 {
  max=m;
  pila=new String[max];
  tope=0; 
 }

 //Metodo que agrega un dato
 private void Agregar(String n)
 {
  if(tope<max)
  {
   pila[tope]=n;
   tope++;
   System.out.println("Dato agregado");
  }
  else
  {
   System.out.println("Ya no hay espacio");
  }
 }

 //Metodo que elimina un dato de la pila
 private void Eliminar()
 {
  if(tope>0)
  {
   tope--;
   System.out.println("Dato eliminado");
  }
  else
  {
   System.out.println("No hay mas datos a eliminar");
  }
 }

 //Muestra el ultimo dato al primero
 private void Mostrar()
 {
  if(!Vacia())
  {
   for(int a=(tope-1);a>=0;a--)
   {
   System.out.println(pila[a]);
   }
  }
  else System.out.println("Vacia");
 }

 //Buscar dato
 private boolean Buscar(String dato)
 {
  boolean encontrado=false;
  if(!Vacia())
  {
   for(int a=(tope-1);a>=0;a--)
   {
    if(pila[a].equals(dato)) encontrado=true;
   }
  }
  else System.out.println("No hay datos para buscar");
  return encontrado;
 }

 //revisa si esta vacia
 private boolean Vacia()
 {
        return pila==null;
 }

 public static void main(String arg[])
 {
  int t,opcion;
  String dato;
  Scanner teclado=new Scanner(System.in);
  System.out.println("---Pilas---");
  System.out.println("Numero de pila: ");
  t=teclado.nextInt();
  Pila pilita=new Pila(t);
  do
  {
   System.out.println("1. Agregar dato");
   System.out.println("2. Eliminar dato");
   System.out.println("3. Mostrar datos");
   System.out.println("4. Buscar dato");
   System.out.println("5. Salir");
   System.out.println("digite un dato del menù ");
   opcion=teclado.nextInt();
   switch(opcion)
   {
    case 1:
    System.out.println("Escriba un dato: ");
    dato=teclado.next();
    pilita.Agregar(dato);
    break;
    case 2:
    pilita.Eliminar();
    break;
    case 3:
    pilita.Mostrar();
    break;
    case 4:
    System.out.println("Dato a buscar: ");
    dato=teclado.next();
    if(pilita.Buscar(dato)) System.out.println("Dato encontrado");
    else System.out.println("Dato no encontrado");
    break;
   }
  }while(opcion!=5);
 }
}