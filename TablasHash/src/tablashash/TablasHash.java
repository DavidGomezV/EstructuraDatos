/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablashash;

/**
 *
 * @author david
 */
public class TablasHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TablaHash<Integer> th = new TablaHash<>(5);
        th.tabla.add(0, 1000);
        th.tabla.add(1, 2000);
        th.tabla.add(2, 3000);
        th.tabla.add(3, 4000);
        th.tabla.add(4, 5000);
        
        System.out.println(th.tabla.get(0));
        System.out.println(th.tabla.get(1));
        System.out.println(th.tabla.get(2));
        System.out.println(th.tabla.get(3));
        System.out.println(th.tabla.get(4));
        }
    }
    

