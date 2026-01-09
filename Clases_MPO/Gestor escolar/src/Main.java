import Model.Alumno;
import Model.Asignatura;
import Model.Profesor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Asignatura pogramacion=new Asignatura(1);
        Asignatura sistemas=new Asignatura(2);
        Asignatura entornos=new Asignatura(3);
        ArrayList<Alumno>listaAlumnos=new ArrayList<>();
        listaAlumnos.add(new Alumno(1,2,3,4));
        listaAlumnos.add(new Alumno(new Asignatura(1),new Asignatura(2),new Asignatura(3)));
        listaAlumnos.add(new Alumno(new Asignatura(1),new Asignatura(2),new Asignatura(3)));
        listaAlumnos.add(new Alumno(new Asignatura(1),new Asignatura(2),new Asignatura(3)));
        listaAlumnos.add(new Alumno(new Asignatura(1),new Asignatura(2),new Asignatura(3)));
        listaAlumnos.add(new Alumno(new Asignatura(1),new Asignatura(2),new Asignatura(3)));
        listaAlumnos.add(new Alumno(new Asignatura(1),new Asignatura(2),new Asignatura(3)));
        listaAlumnos.add(new Alumno(new Asignatura(1),new Asignatura(2),new Asignatura(3)));

        Alumno borja=new Alumno();//Con todas las asignaturas
        Alumno celia=new Alumno();//Con todas las asignaturas
        Alumno cebrian=new Alumno();//Sin ndada
        Alumno esteban=new Alumno(1,2,3);//Con id
        Profesor profesor=new Profesor();
        profesor.ponerNotas(celia);
        profesor.CalcularMedia(celia);
    }
}
