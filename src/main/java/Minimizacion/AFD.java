/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minimizacion;

import java.util.ArrayList;
import java.util.HashMap;
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
    
    public void print(){
        
    }
}
