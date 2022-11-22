/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacolas;



/**
 *
 * @author david
 * @param <T>
 */
public class Colas<T> {

    private class Node<T> {

        public T valor;
        public Node<T> siguiente;
    }

    private Node<T> head, cola;
    

    public boolean is_empty(){
        if(head==null){
            return true;
        }else return false;
    }
    
    public int lenght(){
       int contador=0;
       Node<T> aux=head;
       while(aux!=null){
           aux=aux.siguiente;
           contador++;
       }
       return contador+1;
    }

    public void enqueue(T valorAFormar) {
        Node<T> nuevoNodo = new Node<>();
        nuevoNodo.valor = valorAFormar;
        if (is_empty()) {
            head = cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
        }
    }

    public T dequeue() {
        if (!is_empty()) {
            T aux = head.valor;
            head = head.siguiente;
            if (head == null) {
                cola = null;
            }
            return aux;
        }
        return null;
    }

    public void to_String() {
       
        int contador=0;
       Node<T> aux = head;
        while(contador<=lenght()-1){
            if(aux==null){
                System.out.println("no hay valores en la cola");
                break;
            }else{
            System.out.println(aux.valor);
            aux=aux.siguiente;
            contador++;
            }
        }
   }
}
