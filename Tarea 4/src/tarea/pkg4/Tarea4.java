/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 * 
 */
public class Tarea4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConjuntoADT<Integer> conjunto= new ConjuntoADT();
        ConjuntoADT<Integer> otroConjunto = new ConjuntoADT();
        
       conjunto.agregar(1);
       conjunto.agregar(2);
       conjunto.agregar(3);
       conjunto.agregar(4);
       
       otroConjunto.agregar(4);
       otroConjunto.agregar(5);
       otroConjunto.agregar(6);
       otroConjunto.agregar(10);
       
        JOptionPane.showMessageDialog(null, "el conjunto 1 tiene: "+conjunto.longitud());
        JOptionPane.showMessageDialog(null, "el conjunto 2 tiene: "+otroConjunto.longitud());
        
        conjunto.contiene(0);
        otroConjunto.contiene(4);
        
        otroConjunto.eliminar(10);
        
        JOptionPane.showMessageDialog(null, "los conjuntos son iguales? "+conjunto.equals(otroConjunto));
        
        JOptionPane.showMessageDialog(null, "el conjunto es subconjunto del otro conjunto? "+conjunto.esSubConjuntoDe(otroConjunto));
        
        ConjuntoADT<Integer> conjuntoInterseccionado= conjunto.interseccion(otroConjunto);
        System.out.println(conjuntoInterseccionado);
        
        System.out.println("--------------------------------");
        
        ConjuntoADT<Integer> conjuntoDiferenciado= conjunto.diferencia(otroConjunto);
        System.out.println(conjuntoDiferenciado);
        
        conjunto.union(otroConjunto);
        System.out.println(conjunto);
    }
        
    }
    
