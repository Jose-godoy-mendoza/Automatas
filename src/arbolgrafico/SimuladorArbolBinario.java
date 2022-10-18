/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolgrafico;


import java.util.ArrayList;
import javax.swing.JPanel;
/**
 *
 * @author joseg
 */
public class SimuladorArbolBinario {
    
    Arbol miArbol = new Arbol();
    
    public SimuladorArbolBinario(){
        
    }
    public boolean insertar(Integer dato){
        return (this.miArbol.agregar(dato));
        
    }
    
    public String reclzq(){
        ArrayList it = this.miArbol.recIzq();
        return (recorrido(it, "Recorrido Izquierda"));
        
    }
      public String recDerecha(){
        ArrayList it = this.miArbol.recDerecha();
        return (recorrido(it, "Recorrido Derecha"));
        
    }
     public String darHojas(){
         ArrayList it = this.miArbol.getHojas();
         return (recorrido(it,"Hojas del Arbol"));
     }
     
     public String darPadre(Integer hijo) {
         if (this.miArbol.getRaiz().getDato() == (hijo)){
         return ("la raiz no tiene padre");
         
     }
         Integer padre = this.miArbol.padre(hijo);
         if(padre == null){
             return("No existe el dato: "+ hijo.toString());
         }
         return ("El padre de: "+hijo + "\n es: " + padre.toString());
     }
    
     
     private String recorrido(ArrayList it, String msg) {
         int i = 0;
         String r = msg + "\n";
         while (i < it.size()) {
             r+= "\t" +it.get(i).toString() + "\n";
             i++;
         }
         return (r);
     }
     public String CantidadNodos(){
         return this.miArbol.cantidadNodos();
     }
     public String CantidadHojas(){
         return this.miArbol.cantidadNodosHoja();
     }
     public String alturaArbol(){
         return this.miArbol.retornarAltura();
     }
     public JPanel getDibujo(){
         return this.miArbol.getdibujo();
     }
    
}