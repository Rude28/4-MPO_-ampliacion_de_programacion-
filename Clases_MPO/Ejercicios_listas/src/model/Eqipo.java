package model;

public class Eqipo {
    private String nombre;
    private int gFavor;
    private int gContra;
    public Eqipo(){

    }

    public Eqipo(String nombre, int gFavor, int gContra) {
        this.nombre=nombre;
        this.gFavor = gFavor;
        this.gContra = gContra;
    }
    public void mostrarEstadisticas(){
        System.out.println("nombre" +nombre);
        System.out.println("Los goles a favor son"+gFavor);
        System.out.println("Los goles en contra son"+gContra);
    }
    public int getgFavor() {
        return gFavor;
    }

    public void setgFavor(int gFavor) {
        this.gFavor = gFavor;
    }

    public int getgContra() {
        return gContra;
    }

    public void setgContra(int gContra) {
        this.gContra = gContra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
