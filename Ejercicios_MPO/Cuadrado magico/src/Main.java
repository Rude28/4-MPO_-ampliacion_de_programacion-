import Controller.CuadradoMagicoController;
import Model.CuadradoMagico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos a crear un cuadrado mágico");
        System.out.println("Introduce un numero para el tamaño del cuadrado");
        Scanner scanner=new Scanner(System.in);
        int entrada=scanner.nextInt();
        int [][] cuadrado=new int[entrada][entrada];
        CuadradoMagico cuadradoMagico=new CuadradoMagico(cuadrado);
        CuadradoMagicoController cuadradoMagicoController=new CuadradoMagicoController();
        cuadradoMagicoController.crearCuadrado(cuadradoMagico);
    }
}

