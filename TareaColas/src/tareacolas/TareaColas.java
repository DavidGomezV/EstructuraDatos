/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacolas;

/**
 *
 * @author david
 */
public class TareaColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Colas<String> c = new Colas<>();
        c.enqueue("HOla");
        c.enqueue("soy");
        c.enqueue("david");
        c.enqueue("estudio");
        c.enqueue("y");
        c.enqueue("me");
        c.enqueue("gusta");
        c.enqueue("el");
        c.enqueue("deporte");
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.dequeue();
        c.to_String();
       
    }
    
}
