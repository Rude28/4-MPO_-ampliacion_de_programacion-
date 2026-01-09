package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Alumno {
    private int nMat;
    private Asignatura asignatura1,asignatura2,asignatura3;
    public Alumno(int nMat,int id1,int id2,int id3){
    this.asignatura1=new Asignatura( id1);
    this.asignatura2=new Asignatura(id2);
    this.asignatura3=new Asignatura(id3);
    }
    //Como se crea una asignatura
    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3){
        this.asignatura1=asignatura1;
        this.asignatura2=asignatura2;
        this.asignatura3=asignatura3;

    }
    public void mostrarDatos(){
        System.out.println("Mostrando datos del alumno");
        System.out.println("Los datos de la primera asignatura son ");
        asignatura1.MostrarDatos();
        System.out.println("Los datos de la segunda asignatura son ");
        asignatura2.MostrarDatos();
        System.out.println("Los datos de la tercera asignatura son ");
        asignatura3.MostrarDatos();
    }
}
