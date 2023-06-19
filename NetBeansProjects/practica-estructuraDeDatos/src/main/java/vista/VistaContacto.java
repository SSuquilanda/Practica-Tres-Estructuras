/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Contacto;
import java.util.Scanner;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class VistaContacto {
    private Scanner teclado;
    
    public Contacto ingresarContacto() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del contacto: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el telefono del contacto: ");
        int telefono = teclado.nextInt();
        return new Contacto (nombre, telefono);

        
    }
    public String buscarContactoNombre(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el nombre del contacto a buscar: ");
        String nombre = teclado.nextLine();
        return nombre;
    }
    
    
}
