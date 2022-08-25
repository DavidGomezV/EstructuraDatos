/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.arreglo;

/**
 *
 * @author david
 */
public class Arreglo {
     private int numElementos;
     private int longArreglo;
     private String elemento;
     private int indice;
     String contenido;
     

    public Arreglo() {
    }

    public Arreglo(int numElementos, int longArreglo, String elemento, int indice, String contenido) {
        this.numElementos = numElementos;
        this.longArreglo = longArreglo;
        this.elemento = elemento;
        this.indice = indice;
        this.contenido = contenido;
    }
    

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "Los datos del arreglo son: " + elemento;
    }
     
     
   
     
 
    

    
}