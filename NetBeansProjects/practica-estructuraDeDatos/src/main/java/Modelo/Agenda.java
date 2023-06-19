/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class Agenda <T>{
    private List <Contacto> listaContactos;
    private Contacto<T> cabeza;

    public Agenda() {
        listaContactos = new LinkedList();
    }
    public void agregar(Contacto contacto) {
        listaContactos.add(contacto);
        Contacto<T> nuevo = contacto;
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Contacto<T> ultimoNodo = obtenerUltimo();
            ultimoNodo.setSiguiente(nuevo);
        }
    }

    //Obtener Ultimo
    public Contacto<T> obtenerUltimo() {
        Contacto<T> actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();

        }
        return actual;
    }

    //Obtener por nombre
    public Contacto getElementByNombre(Object nombre) {
        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equals(nombre)) {
                    return contacto;
            } else {
                System.out.println("No existe el contacto");
            }
        }
        return null;
    }
    
    
    public void eliminarContacto(Contacto contacto){
        Iterator<Contacto> it = listaContactos.iterator();
        while (it.hasNext()) {
            Contacto c = it.next();
            if (c.getNombre().equals(contacto.getNombre())){
                it.remove();
                break;
            }
        }
    }
    
       
    

    

        
    
    

    
    
    
    
}
