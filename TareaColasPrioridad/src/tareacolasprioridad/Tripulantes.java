/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacolasprioridad;

/**
 *
 * @author david
 */
public class Tripulantes {  
    
    String Cargo;
    int Edad;
    String Nivel;
    int Prioridad;
    public String Sexo;
    public boolean Embarazada;
    public Tripulantes(String Cargo, int Edad, String Nivel,int p) {
       
        this.Cargo = Cargo;
        this.Edad = Edad;
        this.Nivel = Nivel;
        this.Prioridad=p;
    }
        public Tripulantes(){
            
        }
}
