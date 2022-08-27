/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 *
 * @author david
 */
public class Tarea1 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String filePath= "/home/david/Downloads/presenciaredes.csv";
        String linea= "";
        
        try {
            BufferedReader br =  new BufferedReader(new FileReader(filePath));
            
            while((linea = br.readLine())!= null){
                String[] elementos = linea.split(",");    
                System.out.println(("red social: "+elementos[0]+" "+"COmparacion de diferencia de seguidores de enero a junio es de: "+"ENERO: "+elementos[3]+" "+" JUNIO: "+elementos[8]));
                
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
    }
    
}
