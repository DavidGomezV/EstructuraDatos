/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author david
 */
public class Nomina  {
    String filePath ="";
        Arreglo<Trabajadores>nomina ;
        String contenido="";
        String lineas="";
        int numeroEmpleados= 0;
        
        public Nomina(String filePath)throws IOException{
try {
            
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            br.readLine();
            while((lineas = br.readLine())!= null){
              contenido += lineas + "\n";  
              numeroEmpleados++;
            }
            br.close();
            
        } catch (FileNotFoundException ex) {
        ex.printStackTrace();
        } catch (IOException i){
            i.printStackTrace();
        }
        String[] contenidoEnLineas = contenido.split("\n");
        
        nomina=new Arreglo<>(numeroEmpleados);
        
        for (int i = 0; i < contenidoEnLineas.length; i++) {
          String[] contenidoSPC = contenidoEnLineas[i].split(",");
            Trabajadores t1= new Trabajadores();
            t1.setId(parseInt(contenidoSPC[0]));
            t1.setNombre(contenidoSPC[1]);
            t1.setPaterno(contenidoSPC[2]);
            t1.setMaterno(contenidoSPC[3]);
            t1.setHorasExtra(parseInt(contenidoSPC[4]));
            t1.setSueldoBase(parseDouble(contenidoSPC[5]));
            t1.setAnioIngreso(parseInt(contenidoSPC[6]));
            nomina.setElemento(i, t1);
        }
        
}
        public void calularSueldo(){
            for (int i = 0; i < nomina.getTamanio(); i++) {
                System.out.println("\n"+nomina.getElemento(i).getNombre()+" "+nomina.getElemento(i).getPaterno()+" "+nomina.getElemento(i).calcularSueldo());
            }
        }
       
        public void calcularMasReciente(){
            for (int i = 0; i < nomina.getTamanio(); i++) {
               if (nomina.getElemento(i).getAnioIngreso()>2019){
                Trabajadores masReciente = nomina.getElemento(i);
                 System.out.println("empleado(s) mas antiguo: "+ masReciente.getNombre()+" "+masReciente.getPaterno()+" desde "+masReciente.getAnioIngreso());
               }
            }
            
     
        }
        
        public void calcularMasAntiguo(){
            for (int i = 0; i < nomina.getTamanio(); i++) {
               if (nomina.getElemento(i).getAnioIngreso()<= 2016){
                Trabajadores masAntiguo = nomina.getElemento(i);
                 System.out.println("empleado(s) mas antiguo: "+ masAntiguo.getNombre()+" "+masAntiguo.getPaterno()+" desde "+masAntiguo.getAnioIngreso());
               }
            }
        }

    

   

    

    

    
}
