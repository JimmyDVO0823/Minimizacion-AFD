/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minimizacion.Model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author PC
 */
public class AFD {
    Set<Character> alfabeto;
    ArrayList<Estado> tabla;
    Estado inicial;
    int numEstados;

    public AFD(Estado inicial) {
        numEstados = 1;
        this.inicial = inicial;
        tabla = new ArrayList<Estado>();
        
    }
    
    /**
     * Metodo para recorrer las posibles transiciones y ver los estados alcanzables
     * @return alcanzables: estados alcanzables
     * 
     */
    public Set<Estado> alcanzables(){
        Set<Estado> alcanzables = new HashSet<>();
        
        //Por si está vacío
        if (inicial == null)
            return alcanzables;
        
        //Deque porque papa Java dice que stack está obsoleta
        Deque<Estado> pila = new ArrayDeque<>();
        pila.push(inicial); //pa empezar
        
        //El recorrido per se
        while(!pila.isEmpty()){
            Estado actual = pila.pop();
            if(!alcanzables.add(actual)) continue; //Añade y salta si ya estaba. 
            //Toma cada transicion del estado. Cada siguiente estado
            for(Estado siguiente: actual.getTransiciones().values()){
                if(siguiente != null && !alcanzables.contains(siguiente))
                    pila.push(siguiente);//Apila si no lo contiene
            }
        }

        return alcanzables;
    }
    
    public void print(){
        
    }
}
