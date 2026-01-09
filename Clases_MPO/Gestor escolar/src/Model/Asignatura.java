package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asignatura {
    private int id;
    private double clasificacion;

    public Asignatura(int id) {
        this.id = id;
    }
    public void MostrarDatos(){
        System.out.println("id "+id);
        System.out.println("calificaion "+clasificacion);
    }
}

