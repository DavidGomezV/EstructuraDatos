/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1;

/**
 *
 * @author david
 */
public class RedSocial {
    private String nombre;
    private String concepto;
    private String anio;
    private String enero;
    private String febrero;
    private String marzo;
    private String abril;
    private String mayo;
    private String junio;

  

    public RedSocial() {
    }

    public RedSocial(String nombre, String concepto, String anio, String enero, String febrero, String marzo, String abril, String mayo, String junio) {
        this.nombre = nombre;
        this.concepto = concepto;
        this.anio = anio;
        this.enero = enero;
        this.febrero = febrero;
        this.marzo = marzo;
        this.abril = abril;
        this.mayo = mayo;
        this.junio = junio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getEnero() {
        return enero;
    }

    public void setEnero(String enero) {
        this.enero = enero;
    }

    public String getFebrero() {
        return febrero;
    }

    public void setFebrero(String febrero) {
        this.febrero = febrero;
    }

    public String getMarzo() {
        return marzo;
    }

    public void setMarzo(String marzo) {
        this.marzo = marzo;
    }

    public String getAbril() {
        return abril;
    }

    public void setAbril(String abril) {
        this.abril = abril;
    }

    public String getMayo() {
        return mayo;
    }

    public void setMayo(String mayo) {
        this.mayo = mayo;
    }

    public String getJunio() {
        return junio;
    }

    public void setJunio(String junio) {
        this.junio = junio;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "nombre=" + nombre + ", concepto=" + concepto + ", anio=" + anio + ", enero=" + enero + ", febrero=" + febrero + ", marzo=" + marzo + ", abril=" + abril + ", mayo=" + mayo + ", junio=" + junio + '}';
    }
    
    int eneroNum = Integer.parseInt(enero);
    int junioNUm = Integer.parseInt(junio);
    public int DiferenciaSeguidores (int eneroNum, int junioNum){
        
        int DifSeguidores =junioNum - eneroNum;
        return DifSeguidores;
    }
   
    
    
    
    
    
    
    
    
    
}
