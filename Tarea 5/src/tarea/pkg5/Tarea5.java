/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg5;

/**
 *
 * @author david
 */
public class Tarea5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaSimplementeLigada<Integer> listaPrueba = new ListaSimplementeLigada<>();
        System.out.println("Metodo estaVacio\n");
        System.out.println(listaPrueba.estaVacio());
        System.out.println("Tamaño\n");
        System.out.println(listaPrueba.getTamanio());
        System.out.println("Agrega al inicio");
        listaPrueba.addFirst(2);
        System.out.println(listaPrueba);
        System.out.println("Agrega al inicio");
        listaPrueba.addFirst(1);
        System.out.println(listaPrueba);
        System.out.println("\nAgregar 4 al final");
        listaPrueba.anhadirALFInal(4);
        System.out.println(listaPrueba);
        System.out.println("\nAgregar 3 despues de 2");
        listaPrueba.addAfter(2, 3);
        System.out.println(listaPrueba);
        System.out.println("\nEliminar en la posicion 2");
        listaPrueba.deleteAt(2);
        System.out.println(listaPrueba);
        System.out.println("\nEliminar al inicio");
        listaPrueba.eliminarPrimero();
        System.out.println(listaPrueba);
        System.out.println("\nEliminar al final");
        listaPrueba.deleteLast();
        System.out.println(listaPrueba);
        System.out.println("\nBuscar el 3");
        System.out.println(listaPrueba.buscar(55));
        System.out.println("\nActualiza el 2 a 10");
        listaPrueba.update(2, 10);
        System.out.println(listaPrueba);
    }
    }
    

