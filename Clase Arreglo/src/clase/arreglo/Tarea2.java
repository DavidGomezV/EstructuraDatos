/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.arreglo;


import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           String numeroDatos= JOptionPane.showInputDialog("CUANTOS ELEMENTOS REGISTRARAS?");
           int numDatos = Integer.parseInt(numeroDatos);
           Arreglo [] array = new Arreglo[numDatos];
           
         for (int i = 0; i < numDatos; i++) {
            array[i].setIndice(i);
        }
           String dato = JOptionPane.showInputDialog("introduce la información: ");
           for (int i = 0; i < numDatos; i++) {
            array[i].setElemento(dato);
            
               System.out.println("numero de elementos: "+array.length);
        }
          
          int sino = JOptionPane.showConfirmDialog(null, "selecciona", "desea cambiar todos los datos?", JOptionPane.YES_NO_OPTION);
          if (sino == 0){
              
                 String newdato = JOptionPane.showInputDialog("introduce el dato a poner: ");
              
              
              for (int i = 0; i < numDatos; i++) {
                  array[i].setElemento(newdato);
              }
          }
    }
    
}
