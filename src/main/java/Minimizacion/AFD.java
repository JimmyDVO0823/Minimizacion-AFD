/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minimizacion;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author PC
 */
public class AFD {
    Set<Character> alfabeto;
    HashMap<String, Estado> tabla;
    Estado inicial;
    int numEstados;

    public AFD(Estado inicial) {
        numEstados = 1;
        this.inicial = inicial;
        tabla = new HashMap<>();
        tabla.put("q1", inicial);
    }
    
    public void print(){
        
    }
}
