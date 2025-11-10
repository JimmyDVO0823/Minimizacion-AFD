/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minimizacion.Model;

import java.util.ArrayList;
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

    public AFD() {
        tabla = new ArrayList<>();
        alfabeto = new HashSet<>();
    }

    public AFD(Estado inicial) {
        numEstados = 1;
        this.inicial = inicial;
        tabla = new ArrayList<>();
        alfabeto = new HashSet<>();
    }

    public boolean addEstado(int id, boolean terminal) {
        Estado nuevo = new Estado(id, terminal);
        if (tabla.contains(nuevo)) {
            System.out.println("El estado " + id + " ya existe");
            return false;
        }
        if(inicial==null){
            inicial=nuevo;
        }
        tabla.add(nuevo);
        numEstados++;
        return true;
    }

    public boolean addSimbolo(Character s) {
        if (alfabeto.contains(s)) {
            System.out.println("El simbolo " + s + " ya esta en el alfabeto");
            return false;
        }
        alfabeto.add(s);
        return true;
    }

    public boolean addTransicion(int origen, Character simbolo, int destino) {
        Estado eOrigen = getEstado(origen);
        Estado eDestino = getEstado(destino);
        if (eOrigen == null) {
            System.out.println("origen no existe");
            return false;
        }
        if (eDestino == null) {
            System.out.println("destino no existe");
            return false;
        }
        if (!alfabeto.contains(simbolo)) {
            System.out.println("símbolo inválido");
            return false;
        }
        eOrigen.agregarTransicion(simbolo, eDestino);
        return true;
    }

    public Estado getEstado(int id) {
        for (Estado e : tabla) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public void printEstados() {
        for (int i = 0; i < tabla.size(); i++) {
            System.out.println(tabla.get(i).getId());
            tabla.get(i).printTransiciones();
        }
    }
}
