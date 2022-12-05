/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treemap;

/**
 *
 * @author david
 */
public class TreeMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.TreeMap <Integer, String> tm = new java.util.TreeMap<>();
        tm.put(1, "Neymar JR");
        tm.put(2, "Cristiano ROnaldo");
        tm.put(3, "Lionel Messi");
        tm.put(4, "David Villa");
        tm.put(5, "Wayne Rooney");
        tm.headMap(3);
        System.out.println("*******imprimiendo el tree map********");
        tm.values().forEach(System.out::println);
    }
    
}
