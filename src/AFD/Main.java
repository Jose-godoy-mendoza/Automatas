/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AFD;

import java.util.Scanner;

/**
 *
 * @author joseg
 */
public class Main {
    public static void main(String []args)
    {
        Scanner s;
        s = new Scanner(System.in);
        int estados=0, transiciones=0;
        
        
        System.out.println("Ingresa el numero de estados: ");
        estados = s.nextInt();
        System.out.println("ingresa el numero de transiciones de estados: ");
        transiciones = s.nextInt();
        System.out.println("ingresa la tabla de transiciones ");
        int q[][] = new int[estados][transiciones];
        for(int i=0;i<estados;i++)
        {
            System.out.println("Estado: "+(i));
            for(int j=0;j<transiciones;j++)
            {
                q[i][j]=s.nextInt();
            }
        }
        
        System.out.println("Ingresa la cadena de entrada: ");
        String Cadena;
        Cadena = s.next();
        String in[] = Cadena.split("");
        System.out.println("Tabla de transiciones: ");
        System.out.println("        0     1");
        for(int i=0; i<estados;i++)
        {
            System.out.print("Estado: "+(i)+" ");
            for(int j=0; j<transiciones;j++)
            {
                System.out.print("q"+q[i][j]+" ");
            }
            System.out.println("");
        }
        
        int entrada[] = new int[in.length];
        
        for (int i=0;i<in.length;i++)
        {
            if(in[i].equals("a"))
            {
                entrada[i]=0;
            }
            if(in[i].equals("b"))
            {
                entrada[i]=1;
            }
        }
        System.out.println("___________________________________");
        int inicio=0;
        int fin = (estados-1);
        int actual = inicio;
        int ip, siguiente;
        for(int i=0; i<in.length;i++)
        {
            System.out.print("q" + actual + "--" + entrada[i] + "-->");
            ip = entrada[i];
            siguiente = q[actual][ip];
            actual = siguiente;
            if(i==(in.length-1))
            {
                System.out.println("q"+actual);
            }
        }
        if(actual==fin)
        {
            System.out.println("Cadena Valida");
        } 
        else
        {
            System.out.println("La cadena NO ES VALIDA");
        }
    }
}
