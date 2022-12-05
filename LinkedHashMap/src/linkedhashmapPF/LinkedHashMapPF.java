/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedhashmapPF;


import java.util.*;

/**
 *
 * @author david
 */
public class LinkedHashMapPF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedHashMap <Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(1, "Usain Bolt");
        lhm.put(12, "Tyson Gay");
        lhm.put(123, "Justin Gatlin");
        lhm.put(1234, "Asafa Powell");
        lhm.put(12345, "Yohan Blake");
        lhm.remove(123);
        System.out.println("IMprimiendo el linked hash map");
        for(Map.Entry<Integer, String> ite : lhm.entrySet()){
            System.out.println(ite.getKey()+", "+ite.getValue());
           
        }
    }
    
}
