/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.suquilandapracticados.main;

import ec.edu.ups.suquilandapracticados.controlador.ControladorProducto;
import ec.edu.ups.suquilandapracticados.modelo.Inventario;
import ec.edu.ups.suquilandapracticados.vista.VistaProducto;
import java.util.Scanner;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class SuquilandaPracticaDos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opcion = 0;
        VistaProducto vistaProducto = new VistaProducto ();
        Inventario inventario = new Inventario();
        ControladorProducto controladorProducto = new ControladorProducto(vistaProducto, inventario);
    
        do {
            System.out.println("""                              
                                Menu de Opciones 
                               1. Ingresar Producto
                               2. Vender Producto
                               3. Ver el inventario disponible
                               4. Ver el historial de transacciones de venta
                               5. Salir""");
            opcion = teclado.nextInt();
            //Vista//

            switch (opcion) {
                case 1:
                    controladorProducto.registrarProducto();
                    break;

                case 2:
                    controladorProducto.venderProducto();
                    break;

                case 3:
                    controladorProducto.verInventario();
                    break;
                case 4:
                    controladorProducto.verHistorialTransacciones();
                    break;
                case 5:
                    System.out.println("Gracias:)");
                    break;

}
}while (opcion!=5);
    }
    }

