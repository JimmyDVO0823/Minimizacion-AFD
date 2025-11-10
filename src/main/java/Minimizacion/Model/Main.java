/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minimizacion.Model;

import java.util.Scanner;

/**
 *
 * @author dfranco
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AFD f= new AFD();
        f.addEstado(1, true);
        f.addEstado(1,false);
        f.addEstado(2,true);
        f.addEstado(2,true);
        f.addEstado(2,false);
        
        f.addSimbolo('1');
        f.addSimbolo('1');
        f.addSimbolo('2');
        f.addSimbolo('3');
        f.addSimbolo('2');
        f.addSimbolo('1');
        f.addTransicion(1, '1', 2);
        f.printEstados();
    }
    
}
