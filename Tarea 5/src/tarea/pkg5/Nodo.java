/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5;

/**
 *@param <T>
 * @author david
 */
public class Nodo <T>{
    
    private T datos;
    private Nodo<T> sig;

    public Nodo() {
    }

    public Nodo(T valor) {
        this.datos = valor;
    }

    public Nodo(T data, Nodo<T> sig) {
        this.datos = datos;
        this.sig = sig;
    }

    public T getDato() {
        return datos;
    }

    public void setDato(T data) {
        this.datos = data;
    }

    public Nodo<T> getSiguiente() {
        return sig;
    }

    public void setSiguiente(Nodo<T> sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "Nodo{" + "data=" + datos + ", next=" + sig + '}';
    }

    
}

