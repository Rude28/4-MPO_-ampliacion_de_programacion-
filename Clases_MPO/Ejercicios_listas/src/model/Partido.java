package model;

public class Partido {
    private Eqipo eqipoLocal, eqipoVisitante;
    private int gLocal,gVisitante;
    private Boolean jugado;
    public Partido(){}

    public Partido(Eqipo eqipoLocal, Eqipo eqipoVisitante) {
        this.eqipoLocal = eqipoLocal;
        this.eqipoVisitante = eqipoVisitante;
    }

    public Partido(Eqipo eqipoLocal, Eqipo eqipoVisitante, int gLocal, int gVisitante) {
        this.eqipoLocal = eqipoLocal;
        this.eqipoVisitante = eqipoVisitante;
        this.gLocal = gLocal;
        this.gVisitante = gVisitante;
        eqipoLocal.setgFavor(eqipoLocal.getgFavor()+gLocal);
        eqipoVisitante.setgContra(eqipoLocal.getgContra()+gVisitante);
        jugado=true;
    }
    public void mostrarDatos(){
        System.out.printf("%s:%d vs %d:%s%nn", eqipoLocal.getNombre(),eqipoLocal.getgFavor(),eqipoVisitante.getNombre(),eqipoVisitante.getgFavor());
    }

    public Eqipo getEqipoLocal() {
        return eqipoLocal;
    }

    public void setEqipoLocal(Eqipo eqipoLocal) {
        this.eqipoLocal = eqipoLocal;
    }

    public Eqipo getEqipoVisitante() {
        return eqipoVisitante;
    }

    public void setEqipoVisitante(Eqipo eqipoVisitante) {
        this.eqipoVisitante = eqipoVisitante;
    }

    public int getgLocal() {
        return gLocal;
    }

    public void setgLocal(int gLocal) {
        this.gLocal = gLocal;
    }

    public int getgVisitante() {
        return gVisitante;
    }

    public void setgVisitante(int gVisitante) {
        this.gVisitante = gVisitante;
    }

    public Boolean getJugado() {
        return jugado;
    }

    public void setJugado(Boolean jugado) {
        this.jugado = jugado;
    }
}
