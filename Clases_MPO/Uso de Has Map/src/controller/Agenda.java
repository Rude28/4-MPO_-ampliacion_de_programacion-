package controller;

import model.Persona;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Agenda {
    private HashMap <String, Persona>listaContactos;
    public Agenda(){
        listaContactos=new HashMap<>();
    }
    public void agregarPersona(Persona persona){
        if (listaContactos.containsKey(persona.getDni())){
            System.out.println("No se puede agregar el dni duplicado");
        }else {
            listaContactos.put(persona.getDni(), persona);
        }
    }
    public void borrarPersona(String dni){
        if (listaContactos.remove(dni)!=null) {
            System.out.println("Persona borrada correctamente");
        }else {
            System.out.println("No se encuentra el dni");
        }
    }
    public Persona obtenerPersona(String dni){

        return listaContactos.get(dni);
    }
    public void obtenerPersonas(){
        //Para sacar todos los elementos debemos sacarlo x keys o por values
        //keys
        Set<String> keys=listaContactos.keySet();
        for (String item:keys){
            listaContactos.get(item).getApellido();
        }
        Collection<Persona> values=listaContactos.values();
        for (Persona item:values){
            item.mostrarDatos();
        }
        //values
    }
}
