/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Nomina n = new Nomina( "/home/david/Downloads/junio.dat");
            System.out.println("Sueldo de trabajadores: "+"\n");
            n.calularSueldo();
            System.out.println("Tiempo de antiguedad de los trabajadores: "+"\n");
            n.calcularMasAntiguo();
            n.calcularMasReciente();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    } 
}
