/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Agenda;
import Modelo.Contacto;
import Vista.VistaContacto;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class ControladorContacto {
    private VistaContacto vistaContacto;
    private Contacto contacto;
    private Agenda agenda;
    
    public ControladorContacto(VistaContacto vistaContacto, Contacto contacto, Agenda agenda) {
        this.vistaContacto = vistaContacto;
        this.contacto = contacto;
        this.agenda= agenda;
    }

    public ControladorContacto(VistaContacto vistaContacto, Agenda agenda) {
        this.vistaContacto = vistaContacto;
        this.agenda = agenda;
    }
    
    public void registrarContacto () {
        contacto = vistaContacto.ingresarContacto();
        agenda.agregar(contacto);
    }
    public void eliminarContacto() {
        String nombre = vistaContacto.buscarContactoNombre();
        contacto = agenda.getElementByNombre(nombre);
        agenda.eliminarContacto(contacto);
        System.out.println("Se elimino el contacto con exito ");
        
    }
    public void buscarContacto (){
        String nombre = vistaContacto.buscarContactoNombre();
        contacto = agenda.getElementByNombre(nombre);
        System.out.println("El contacto del nombre ingresado es: " + contacto);

        
    }
    
   
    
    
}
