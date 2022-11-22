/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareacolasprioridad;

/**
 *
 * @author david
 */
public class ColasPrioritarias {
    Tripulantes cola[];
    int frente;
    int fin;
    public ColasPrioritarias(int Tam){
        cola=new Tripulantes[Tam];
        frente=-1;
        fin=-1;
    }

    public ColasPrioritarias() {
    }
    
    public void ordenarPrioridad(){
        for(int i=0;i<fin;i++){
            int pos_menor=i;

            for(int j=i;j<=fin;j++){
                if(cola[j]==null){
                    cola[j]=cola[j+1];
                    cola[j+1]=null;
                    if(j+1==fin){
                    fin--;
                    }
                    
                }
                if(cola[pos_menor].Prioridad<cola[j].Prioridad){
                    pos_menor=j;
                }
            }
            //inttercambio

            Tripulantes aux2=cola[i];
            cola[i]=cola[pos_menor];
            cola[pos_menor]=aux2;
        }
    }
    public void insertar(Tripulantes v){
        if(((fin==cola.length-1)&&(frente==0)||(fin+1)==frente))
            System.out.println("\nDesbordamiento, la cola esta llena. ");
        else{
            if(fin==cola.length-1)
                fin=0;
            else
                fin=fin+1;
            cola[fin]=v;
            if(fin==0&&frente==-1)
                frente =0;
                       
        }
        ordenarPrioridad();
    }
    public void eliminar(){
        Tripulantes v;
        
        if(frente==-1){
            System.out.println("\nSubdesbordamiento");
            v=null;
        }
        else{
            v=cola[frente];            
            cola[frente]=null;
            if(frente==fin){
                frente=-1;
                fin=-1;
            }else{
            ordenarPrioridad();
            }
            System.out.println("El elemento Eliminado es: "+ v.Cargo+" con prioridad "+v.Prioridad);

        }

    }
    public void imprimir(){
        System.out.println("\nElementos en la cola");
        for(int i=0;i<=fin;i++){
            System.out.println(cola[i].Cargo+", ");
        }
    }
}
