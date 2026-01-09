package Contoller;

import Model.Alumno;
import Model.Profesor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@AllArgsConstructor
public class Colegio {
    private ArrayList<Alumno>alumnos;
    private Profesor profesor;
    private int matriculas;
    public Colegio(){
        alumnos=new ArrayList<>();
        profesor=new Profesor();
    }
    public void matricularAlumno(String nombre){

    }
}
