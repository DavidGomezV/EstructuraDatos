/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacolasprioridad;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class TareaColasPrioridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);

     int Tam;
     System.out.println("Cuantos Tripulantes quiere agregar?");
     Tam=sc.nextInt();
     ColasPrioritarias elementos=new ColasPrioritarias(Tam);
 
 
     
     int opcion;
     int i=0;
     do
     {
         opcion=menu();
         switch(opcion){
             case 1:    //solicitar al usuario los datos del objeto (libre) 
                     elementos.Enqueue(Priorizar(i));
                     i++;
                      break;
             case 2:  elementos.Dequeue();
                      break;
             case 3:  elementos.imprimir();
                      break;
             case 4:  System.out.println("Gracias!");
                      break;
             default:
                      break;
         }
     }while(opcion!=4);
        

    }
    public static int menu(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Insertar un elemento en la cola.");
        System.out.println("2. Eliminar un elemento en la cola.");
        System.out.println("3. Imprimir elementos de la cola.");
        System.out.println("4. Salir");
        System.out.println("Ingresa la opción:");
        int opcion=lector.nextInt();
        return opcion;
    }
    public static Tripulantes Priorizar(int i){
             Scanner lector=new Scanner(System.in);
                    Tripulantes p=new Tripulantes();
            int aux = 0;
            int auxx=0;
            System.out.println("Escribir 1 si el Tripulante número " + (i+1) + " es mujer o 2 en caso de ser hombre");
            aux = lector.nextInt();
            if (aux == 1){
                p.Sexo = "Mujer";
                System.out.println("En caso de que la tripulante esté embarazada escribir un 1, si no un 2");
                auxx = lector.nextInt();
                if (auxx == 1){
                    p.Embarazada = true;
                }
                else p.Embarazada = false;
                
            }
            else if (aux == 2){
                p.Sexo = "Hombre";
            }
            else {
                System.out.println("Valor no acpetado, favor de verificar datos");
                System.out.println("Escribir 1 si el tripulante es mujer o 2 en caso de ser hombre");
            }
            System.out.println("Tripulante número "+ (i+1) +". Nombre:");
            p.Cargo=lector.next();
            System.out.println("Tripulante número "+ (i+1) +". Edad:");
            p.Edad=lector.nextInt();
        
            if (p.Edad >= 50 && p.Embarazada == true){
                p.Prioridad = 5;
            }
            else if (p.Edad >= 50 && p.Nivel == "basico" || p.Nivel == "Basico" ){
                
                p.Prioridad= 4;
            }
            else if (p.Edad >= 50){
                
                p.Prioridad= 3;
            }
            else if (p.Embarazada == true ){
                
                p.Prioridad= 3;
            }
            else if (p.Embarazada == true && p.Nivel == "basico" || p.Nivel == "Basico"){
                
                p.Prioridad= 4;
            }
            else if (p.Nivel == "basico" || p.Nivel == "Basico"){
                
                p.Prioridad= 1;
            }
            
            return p;
             
    }
    
   
}
