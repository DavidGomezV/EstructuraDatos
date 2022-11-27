/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablashash;

import java.util.ArrayList;

/**
 *
 * @author david
 * @param <T>
 */
public class TablaHash<T> {
   
    public int capacidad;
    private int llave;
    public ArrayList<T> tabla = new ArrayList<>(capacidad);

    public TablaHash(int table_size) {
       capacidad = table_size;
    }
    
    public void add(int key, T value){
        
        if(checkIfOutOfBounds(key)==true){
            System.out.println("la llave se encuentra fuera del rango");
        }
        if(estaOcupado(key)==true){
            System.out.println("Ya hay un valor en la posicion "+key);
        }else if(estaOcupado(key)==false){
        tabla.add(key, value);
        }
    }
    public T valueOf(int key){
        int i = 0;
       T exception = null;
        if (checkIfOutOfBounds(key)==true){
            return exception;
        }
         if(comprobar(key)==false){
            i++;
            valueOf(key+i);
        }else if(comprobar(key)==true){
             return tabla.get(i);   
        }
        
        return valueOf(key);
    }
       
           
    private boolean comprobar(int key){
        if(llave!=key){
            return false;
        }
        if (llave== key){
            return true;
        }
        return comprobar(key);
    }
    private boolean checkIfOutOfBounds(int max){
        if (max>capacidad){
            return true;
        }else return false;
        
    }
    private boolean estaOcupado(int key){
        if(tabla.get(key)!=null){
            return true;
        }
        if (tabla.get(key)==null){
            return false;
        }
        return estaOcupado(key);
    }
    
    public void remove(int key){
      int i = 0;
      if(comprobar(key)==false){
            i++;
            remove(key+i);
        } else if(comprobar(key)==true){
          tabla.add(i, null);
      }
    }
    
    
       
        

}
