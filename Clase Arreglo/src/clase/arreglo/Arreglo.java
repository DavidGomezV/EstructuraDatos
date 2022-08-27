/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.arreglo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Arreglo {
    private String[] arreglo = new String[]{};
    private String elemento;

    public Arreglo() {
    }

    public Arreglo(String elemento) {
        this.elemento = elemento;
    }
   

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(String[] arreglo) {
        this.arreglo = arreglo;
    }

    @Override
    public String toString() {
        return "Arreglo{" + "arreglo=" + arreglo + ", elemento=" + elemento + '}';
    }
    
    public int getLongitud(){
        int longi = arreglo.length;
        return longi;
    }

    public void limpiar(String arreglo[]){
        String newElemento = "";
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i].replaceAll(arreglo[i], newElemento);
        }
    }
    public void agregarElemento(){
        String index= JOptionPane.showInputDialog("en que posicion del indice desea insertar");
        int indice = Integer.parseInt(index);
        String elementoAg = JOptionPane.showInputDialog("agregue el elemento");
        
        
            arreglo[indice] =  elementoAg;
        
    }
    
    public void darElemento(){
        String elemDado=JOptionPane.showInputDialog("que elemento desea ver");
        int indiceElem = Integer.parseInt(elemDado);
        System.out.println(arreglo[indiceElem]);
    }
    
}