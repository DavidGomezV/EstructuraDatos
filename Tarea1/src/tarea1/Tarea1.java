/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
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
        List<RedSocial> redes = new ArrayList<>();
        try(Stream<String> streamFile = Files.lines(Paths.get(filePath))){
            redes = streamFile.map(linea -> linea.split(",")).map(arreglo -> {
                RedSocial reds = new RedSocial(arreglo[0], arreglo[1], arreglo[2], arreglo[3], arreglo[4], arreglo[5], arreglo[6], arreglo[7], arreglo[8]);
                return reds;
                
            }).collect(Collectors.toList());
           redes.forEach(System.out::println);
               
        } catch (Exception e) {
               System.out.println(e.getMessage());
        }
        
        
    }
    
}
