package Controller;

import Model.CuadradoMagico;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.Socket;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CuadradoMagicoController {
    private CuadradoMagico cuadradoMagico;

    public void crearCuadrado(CuadradoMagico cuadradoMagico) {

        System.out.println("Empezamos a crear el cuadrado");
        int [][]cuadrado=cuadradoMagico.getCuadrado().clone();
        int distancia=cuadrado.length;
        int constanteMagica = (distancia * (distancia * distancia + 1)) / 2;
        int maximo = distancia * 2;
        int numero = 0;
        int intentos = 0;
        boolean correcto = false;
        while(!correcto) {
            for (int i = 0; i < distancia; i++) {
                for (int j = 0; j < distancia; j++) {
                    numero = (int) (Math.random() * maximo + 1);
                    cuadradoMagico.getCuadrado();
                    cuadrado[i][j] = numero;// aqui me va a generar numeros
                }
            }
        intentos++;
        if (comprobarCuadrado(cuadrado)){
            correcto=true;
        }
        }

        imprimirCuadrado(cuadrado,intentos,constanteMagica);
    }
    private boolean comprobarCuadrado (int[][]cuadrado) {
        int distancia=cuadrado.length;
        int constanteMagica = (distancia * (distancia * distancia + 1)) / 2;
        for (int i = 0; i < distancia; i++) {
            int fila = 0;
            for (int j = 0; j < distancia; j++) {
                fila += cuadrado[i][j];
            }
            if (fila != constanteMagica) {
                return false;
            }
        }
        for (int j = 0; j < cuadrado.length; j++) {
            int columna=0;
            for (int i = 0; i <cuadrado.length ; i++) {
                columna+=cuadrado[i][j];
            }
            if (columna != constanteMagica) {
                return false;
            }
        }
        int diagonal=0;
        int diagonal2=0;
        for (int i = 0; i < distancia; i++) {
            diagonal+=cuadrado[i][i];
            diagonal2+=cuadrado[i][distancia-1-i];
        }
        return diagonal==constanteMagica&&diagonal2==constanteMagica;
    }
    private void imprimirCuadrado(int[][]cuadrado, int intentos, int constanteMagica){
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado.length; j++) {
                System.out.printf("  %d  ",cuadrado[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.printf("La constante magica es: %d %n", constanteMagica);
        System.out.printf("El numero de intentos ha sido de: %d", intentos);
    }
}

