
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 * @param <T>
 */
public class ConjuntoADT <T> implements Iterator<T>{
    ArrayList<T> conjunto= new ArrayList<>();
    
    public int longitud(){
        return conjunto.size();
    }
    public boolean contiene(T elemento){
        if(conjunto.contains(elemento)){
            JOptionPane.showMessageDialog(null, "Si contiene el elemento");
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "No contiene el elemento");
            return false;
        }
    }
    public void agregar(T elemento){
        if(contiene(elemento)){
            return;
        }else{
            conjunto.add(elemento);       
    }
    }
    public void eliminar(T elemento){
        if(contiene(elemento)){
           conjunto.remove(elemento);
        }else{
            JOptionPane.showMessageDialog(null, "no existe este elemento en el conjunto");
        }
    }
    public boolean equals(ConjuntoADT<T> otroConjunto){
        if(longitud()!=otroConjunto.longitud()){
            return false;
        }
            for (int i = 0; i < conjunto.size(); i++) {
                if(!otroConjunto.contiene(conjunto.get(i))){
                    return false;
                }
        }
            return true;
    }
    public boolean esSubConjuntoDe(ConjuntoADT<T> otroConjunto){
       if(longitud()>otroConjunto.longitud()){
           return false;
       }
        for (int i = 0; i < longitud(); i++) {
            if(!otroConjunto.contiene(conjunto.get(i))){
                return false;
            }
        }
        return true;
    }
    public void union(ConjuntoADT<T> otroConjunto){
       for (int i = 0; i < otroConjunto.longitud(); i++) {
            agregar(otroConjunto.conjunto.get(i));
        }
    }
    public ConjuntoADT<T> interseccion(ConjuntoADT otroConjunto){
        ConjuntoADT<T> conjuntoInterseccionado= new ConjuntoADT();
        for (int i = 0; i < longitud(); i++) {
            if(otroConjunto.contiene(conjunto.get(i))){
                conjuntoInterseccionado.agregar(conjunto.get(i));
            }
        }
        return conjuntoInterseccionado;
    }
    public ConjuntoADT<T> diferencia(ConjuntoADT<T> otroConjunto){
        ConjuntoADT<T> conjuntoInterseccionado= new ConjuntoADT();
        for (int i = 0; i < longitud(); i++) {
            if(!otroConjunto.contiene(conjunto.get(i))){
                conjuntoInterseccionado.agregar(conjunto.get(i));
            }
        }
         for (int i = 0; i < otroConjunto.longitud(); i++) {
            if(!contiene(otroConjunto.conjunto.get(i))){
                conjuntoInterseccionado.agregar(otroConjunto.conjunto.get(i));
        }  
    }
         return conjuntoInterseccionado;
           }

    
    public java.util.Iterator<T> iterator(){
        return new java.util.Iterator<T>(){
    int indice = 0;
    @Override
    public boolean hasNext() {
        return indice<conjunto.size();
    }

    @Override
    public T next() {
        return conjunto.get(indice++);
    }

    @Override
    public void remove() {
       throw new UnsupportedOperationException();
    }
    };
    }
    }    
    
