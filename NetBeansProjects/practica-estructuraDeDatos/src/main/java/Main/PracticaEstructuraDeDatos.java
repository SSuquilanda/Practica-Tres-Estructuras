/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Controlador.ControladorContacto;
import Modelo.Agenda;
import java.util.Scanner;
import Vista.VistaContacto;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class PracticaEstructuraDeDatos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
    int opcion = 0;
    VistaContacto vistaContacto = new VistaContacto ();
    Agenda agenda = new Agenda();
    ControladorContacto controladorContacto = new ControladorContacto(vistaContacto, agenda);
    
    do {
            System.out.println("""                              
                                Menu de Opciones 
                               1. Ingreso del Contacto
                               2. Buscar contacto
                               3. Eliminar Contacto 
                               4. Salir""");
            opcion = teclado.nextInt();
            //Vista//

            switch (opcion) {
                case 1:
                    controladorContacto.registrarContacto();
                    break;

                case 2:
                    controladorContacto.buscarContacto();
                    break;

                case 3:
                    controladorContacto.eliminarContacto();
                    break;
                case 4:
                    System.out.println("Gracias:)");
                    break;
}
}while (opcion!=4);
    }
}
