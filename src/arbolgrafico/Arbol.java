/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolgrafico;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class Arbol {

    private Nodo raiz;
    int cant;
    int altura;

    public Nodo getRaiz()
    {
        return this.raiz;

    }

    public void setRaiz (Nodo r)
    {
        this.raiz = r;
    }

    public Arbol() {
        this.raiz = null;
    }

    public boolean agregar(int dato)
    {

        Nodo nuevo = new Nodo(dato,null,null);
        insertar(nuevo, raiz);
        return true;
    }

    public void insertar(Nodo nuevo, Nodo pivote)
    {
        if (this.raiz == null){
            raiz = nuevo;
        }else{
            if (nuevo.getDato() <= pivote.getDato()){ ///sepa ptas
            if (pivote.getIzq() == null){
                pivote.setIzq(nuevo);      
            }else{
                insertar(nuevo,pivote.getIzq());
            }
        } else {
                if(pivote.getDer() == null){
                    pivote.setDer(nuevo);
                } else{
                  insertar(nuevo, pivote.getDer());  
                } 

            }
        }

    }

    //Cantidad de nodos del arbol
    public String cantidadNodos()
    {
        cant = 0;
        cantidadNodos(raiz);
        return ""+cant;
    }

    private void cantidadNodos (Nodo reco)
    {
        if (reco != null){
            cant ++;
            cantidadNodos (reco.getIzq());
            cantidadNodos (reco.getDer());
        }
    }

    //cantidad nodos hoja

    public String cantidadNodosHoja(){
        cant = 0;
        cantidadNodosHoja(raiz);
        return ""+cant;

    }
    private void cantidadNodosHoja(Nodo reco){
        if (reco != null){
            if (reco.getIzq() == null && reco.getDer() == null) {
                cant++;

            }
            cantidadNodosHoja(reco.getIzq());
            cantidadNodosHoja(reco.getDer());
        }
    }

    //altura del arbol
    public String retornarAltura(){  //8:22
        altura = 0;
        retornarAltura(raiz, 1);
        return "" +altura;

    }

    private void retornarAltura(Nodo reco, int nivel){
        if(reco != null){
            retornarAltura(reco.getIzq(),nivel +1);
            if (nivel>altura){
                altura = nivel;
            }
            retornarAltura(reco.getDer(), nivel + 1);

        }
    }

    public int alturaArbol(){
        altura = 0;
        alturaArbol(raiz, 0);
        return altura;
    }

    private void alturaArbol (Nodo pivote, int nivel){
        if (pivote != null){
            alturaArbol(pivote.getIzq(), nivel +1);
            if (nivel > altura){
                altura = nivel;
            }
            alturaArbol(pivote.getDer(), nivel + 1);
        }

    }

    //cambiar datos 
    public boolean cambiar(){
        cambiar(raiz, 1);
        return true;
    }
    private void cambiar(Nodo reco, int nivel){
        if (reco != null) {
            reco.setDato(reco.getDato() * 3);
            cambiar(reco.getIzq(), nivel +1);
            cambiar(reco.getDer(),nivel + 1);
        }
    }

    //imprimir recorrido Izquierda
       public ArrayList recIzq(){
        ArrayList l=new ArrayList();
        recIzq(raiz,l);
        return l;

    }
    private void recIzq(Nodo reco, ArrayList l){
        if (reco !=null){
            l.add(reco.getDato() + " ");
            recIzq(reco.getIzq(),l);
            recIzq(reco.getDer(),l);
        }
    }
    //imprimir recorrido por la derecha
    public ArrayList recDerecha(){
        ArrayList l=new ArrayList();
        recDerecha(raiz,l);
        return l;
    }
    
    private void recDerecha(Nodo reco, ArrayList l){
        if(reco !=null){
            l.add(reco.getDato() + " ");
            recIzq(reco.getDer(),l);
            recIzq(reco.getIzq(),l);
        }
    }

    //Hojas
    public ArrayList getHojas(){
        ArrayList l=new ArrayList();
        getHojas(this.raiz,l);
        return (l);

    }
    
    private void getHojas (Nodo r, ArrayList l) {
        if (r !=null){
            if (this.esHoja(r)){
                l.add(r.getIzq());
            }
            getHojas(r.getIzq(), l);
            getHojas(r.getDer(), l);

        }
    }
    
        protected boolean esHoja(Nodo x){//8:49
            return (x !=null && x.getIzq() == null && x.getDer() == null);        
        }

        public int padre(int info){
            if (info == 0 || this.raiz == null){
                return 0;
            }
            Nodo x = padre (this.raiz, info);
            if (x == null){
                return 0;
            }
            return (x.getDato());
        }
        
        private Nodo padre(Nodo x, int info){
            if (x == null){
                return null;
            }
            if ((x.getIzq() != null && x.getIzq().getDato()==(info) || (x.getDer() !=null && x.getDer().getDato()==(info)))){
                return (x);   //me sobro un parentecis arriba 9:47
            }
            Nodo y = padre(x.getIzq(), info);
            if (y == null){
                return (padre(x.getDer(), info));            
            }else{
                return (y);
            }

        }

        //dibujar arbol
        public JPanel getdibujo(){
            return new ArbolExpresionGrafico(this);//no se porque da error 10:09
        }

}

