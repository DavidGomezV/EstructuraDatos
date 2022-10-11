/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5;

/**
 *
 * @author david
 */
public class ListaSimplementeLigada<T extends Comparable<T>>{
    private Nodo<T> head;

    public ListaSimplementeLigada() {
        head = null;
    }

    public boolean estaVacio() {
        return head == null;
    }

    public int getTamanio() {
        int size = 0;
        Nodo<T> aux = head;

        while(aux != null) {
            aux = aux.getSiguiente();
            size++;
        }
        return size;
    }

    public int buscar(T valor) {
        int indexPosition = 0;
        Nodo<T> iteratorNode = head;
        while(iteratorNode != null){
            if(valor.equals(iteratorNode.getDato())) {
                return indexPosition;
            }
            iteratorNode = iteratorNode.getSiguiente();
            indexPosition++;
        }
        return -1;
    }

    public void anhadirALFInal(T valor) {
        if(estaVacio()) {
            Nodo<T> newNode = new Nodo<>(valor);
            head = newNode;
            return;
        }

        Nodo<T> iteratorNode = head;
        while(iteratorNode.getSiguiente() != null){
            iteratorNode = iteratorNode.getSiguiente();
        }
        Nodo<T> newNode = new Nodo<>(valor);
        iteratorNode.setSiguiente(newNode);
    }

    public void addFirst(T valor) {
        Nodo<T> newNode = new Nodo<>(valor, head);
        head = newNode;
    }

    public void addAfter(T referencia, T valor) {
        if(buscar(referencia) < 0) return;

        Nodo<T> iteratorNode = head;
        while(iteratorNode.getSiguiente() != null && !referencia.equals(iteratorNode.getDato())){
            iteratorNode = iteratorNode.getSiguiente();
        }
        Nodo<T> newNode = new Nodo<>(valor, iteratorNode.getSiguiente());
        iteratorNode.setSiguiente(newNode);
    }

    public void deleteAt(int index) {
        if(this.getTamanio() <= index || estaVacio() || index < 0) return;
        if(index == 0) {
           eliminarPrimero();
            return;
        }

        int indexPosition = 0;
        Nodo<T> prevNode = null;
        Nodo<T> iteratorNode = head;

        while(iteratorNode.getSiguiente() != null && indexPosition < index){
            prevNode = iteratorNode;
            iteratorNode = iteratorNode.getSiguiente();
            indexPosition++;
        }
        prevNode.setSiguiente(iteratorNode.getSiguiente());
    }

    public void eliminarPrimero() {
        if(estaVacio()) return;
        head = head.getSiguiente();
    }

    public void deleteLast() {
        if(estaVacio()) return;
        if(getTamanio() == 1) {
            eliminarPrimero();
            return;
        }
        Nodo<T> prevNode = null;
        Nodo<T> iteratorNode = head;
        while(iteratorNode.getSiguiente() != null){
            prevNode = iteratorNode;
            iteratorNode = iteratorNode.getSiguiente();
        }
        prevNode.setSiguiente(null);
    }

    public void update(T a_buscar, T valor){
        if(buscar(a_buscar) < 0) return;

        Nodo<T> iteratorNode = head;
        while(iteratorNode != null && !a_buscar.equals(iteratorNode.getDato())){
            iteratorNode = iteratorNode.getSiguiente();
        }
        if(iteratorNode.getDato() != a_buscar) return;
        iteratorNode.setDato(valor);
    }

    @Override
    public String toString() {
        String arrrayListString = "";
        Nodo<T> iteratorNode = head;
        while(iteratorNode != null){
            arrrayListString += iteratorNode;
            iteratorNode = iteratorNode.getSiguiente();
        }
        return arrrayListString;
    }
}
