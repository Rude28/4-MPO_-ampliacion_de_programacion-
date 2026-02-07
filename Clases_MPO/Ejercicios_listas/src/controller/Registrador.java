package controller;

import model.Partido;

import java.util.ArrayList;

public class Registrador {
    private ArrayList <Partido> lsitaPatridos;

    public Registrador(){
        this.lsitaPatridos=new ArrayList<>();
    }
    public void mostrarPartidos(){
        for (Partido partido:lsitaPatridos) {
            partido.mostrarDatos();
        }
    }
    public void mostrarPartidos(String equipo){
        for (Partido partido: lsitaPatridos){
            if (partido.isJugado()&&partido.getNombre.equals(nombre))
        }
    }

}
