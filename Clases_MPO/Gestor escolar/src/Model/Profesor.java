package Model;

import lombok.Data;

@Data

public class Profesor {
    public void ponerNotas(Alumno alumno){
        alumno.getAsignatura1().setClasificacion((Math.random()*11)+0.1);
    }
    public double CalcularMedia(Alumno alumno){
        double media =alumno.getAsignatura1().getClasificacion()+alumno.getAsignatura2().getClasificacion()
                +alumno.getAsignatura3().getClasificacion();
        return media;
    }
}
