/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinalcollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author david
 */
public class ProyectoFinalCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("trabajo final de david gomez vazquez");
                
        System.out.println("----------------EJEMPLO HashMap-----------------");
        HashMap <Integer, String> HM = new HashMap<>();
        HM.put(10, "David Gomez");
        HM.put(100, "Kobe Bryant");
        HM.put(1000, "LeBron James");
        HM.put(10000, "Stephen Curry");
        HM.put(100000, "Ja Morant");  
        HM.isEmpty();
        HM.replace(10, "Kyrie Irving");
        HM.containsValue("LeBron James");
        System.out.println("imprimiendo el hash map");
        System.out.println(HM.values());
        System.out.println(HM.keySet());
          
        System.out.println("-------------- EJEMPLO TreeMap------------------");
        TreeMap <Integer, String> tm = new TreeMap<>();
        tm.put(1, "Neymar JR");
        tm.put(2, "Cristiano ROnaldo");
        tm.put(3, "Lionel Messi");
        tm.put(4, "David Villa");
        tm.put(5, "Wayne Rooney");
        tm.headMap(3);
        System.out.println("imprimiendo el tree map");
        tm.values().forEach(System.out::println);
        
        System.out.println("--------------EJEMPLO LinkedHashMap");
        LinkedHashMap <Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(1, "Usain Bolt");
        lhm.put(12, "Tyson Gay");
        lhm.put(123, "Justin Gatlin");
        lhm.put(1234, "Asafa Powell");
        lhm.put(12345, "Yohan Blake");
        lhm.remove(123);
        System.out.println("IMprimiendo el linked hash map");
        for(Map.Entry<Integer, String> ite : lhm.entrySet()){
            System.out.println(ite.getKey()+", ");
        }
    }
    
}
