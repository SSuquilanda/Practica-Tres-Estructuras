/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practicatresestructura.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class Signos {
    private Scanner teclado;
    private Stack<String[]>  arregloSignos;
    
    public Signos() {
        Scanner teclado = new Scanner (System.in);
        arregloSignos = new Stack<>();
    }
    public String[] ingrsesarCadena() {
        System.out.print("Ingrese una cadena sin espacios: ");
        String input = teclado.nextLine();
        
        String[] arregloSignos = input.split("");
        int[] cadena = new int[arregloSignos.length];

        for (int i = 0; i < arregloSignos.length; i++) {
            arregloSignos[i] = arregloSignos[i].trim();
        }
        
        
        return arregloSignos;
    }
    public void analizarLista (Stack<String[]>  arregloSignos){
        

}
    }


