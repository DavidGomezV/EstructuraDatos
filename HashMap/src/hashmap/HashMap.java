/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;

/**
 *
 * @author david
 */
public class HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.HashMap <Integer, String> HM = new java.util.HashMap<>();
        HM.put(10, "David Gomez");
        HM.put(100, "Kobe Bryant");
        HM.put(1000, "LeBron James");
        HM.put(10000, "Stephen Curry");
        HM.put(100000, "Ja Morant");  
        HM.isEmpty();
        HM.replace(10, "Kyrie Irving");
        HM.containsValue("LeBron James");
        System.out.println("******imprimiendo el hash map*******");
        System.out.println(HM.values());
        System.out.println(HM.keySet());
    }
    
}
