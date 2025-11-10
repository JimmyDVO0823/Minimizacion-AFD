/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minimizacion.Model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PC
 */
public class Estado {
    
    private int id;
    private boolean terminal;
    private HashMap<Character, Estado> transiciones;

    public Estado(int id, boolean terminal) {
        this.id = id;
        this.terminal = terminal;
        this.transiciones = new HashMap<>();
    }

    void agregarTransicion(Character simbolo, Estado destino) {
        transiciones.put(simbolo, destino);
    }

    public void printTransiciones() {
        System.out.println("Transiciones del estado " + id + ":");

        if (transiciones.isEmpty()) {
            System.out.println("  (sin transiciones)");
            return;
        }

        for (Map.Entry<Character, Estado> entry : transiciones.entrySet()) {
            char simbolo = entry.getKey();
            Estado destino = entry.getValue();
            System.out.println("  con simbolo " + simbolo + " va a el estado " + destino.getId());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Estado e = (Estado) obj;
        return this.id == e.id;
    }

    public int hashCode() {
        return Integer.hashCode(id);
    }

    public int getId() {
        return id;
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
    public HashMap<Character, Estado> getTransiciones() {
        return transiciones;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    

}
