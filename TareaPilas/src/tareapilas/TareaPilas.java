/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareapilas;

/**
 *
 * @author david
 */
public class TareaPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ADTPila<Integer> p = new ADTPila<>(6);
        System.out.println("isEmpty(): " + p.isEmpty());

        p.push(7);
        p.push(1);
        p.push(5);
        p.push(9);
        p.push(51);
        p.push(99);
        System.out.println("isFull(): " + p.isFull());
        System.out.println(p);
        System.out.println("peek(): " + p.peek());
        p.pop();
        System.out.println(p);

    }

}
