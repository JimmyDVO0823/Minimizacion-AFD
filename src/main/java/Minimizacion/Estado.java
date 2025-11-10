/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minimizacion;

import java.util.HashMap;


/**
 *
 * @author PC
 */
public class Estado {
    private boolean terminal;
    private HashMap <String,Estado> transiciones;

    public Estado (boolean terminal){
        this.terminal=terminal;
        this.transiciones=new HashMap<>();
    }
    void agregarTransicion(String simbolo, Estado destino){
        transiciones.put(simbolo,destino);
    }
    

    /**
     * @return the terminal
     */
    public boolean isTerminal() {
        return terminal;
    }

    /**
     * @param terminal the terminal to set
     */
    public void setTerminal(boolean terminal) {
        this.terminal = terminal;
    }

    /**
     * @return the transiciones
     */
    public HashMap <String,Estado> getTransiciones() {
        return transiciones;
    }

    /**
     * @param transiciones the transiciones to set
     */
    
    
}
