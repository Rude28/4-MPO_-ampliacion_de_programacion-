public class Operadores {
public static void sumar(int numero1, int numero2){
    int resultado= numero1+numero2;
    System.out.println("el numero es"+ resultado);
}
public void resta(int numero1, int numero2){
    int resultado= numero1-numero2;
    System.out.println("el numero es"+ resultado);
}
private void multiplicacion(int numero1,int numero2){
    int resultado=numero1*numero2;
    System.out.println("el numero es"+ resultado);
}
protected static void division(int numero1, int numero2){
    int resultado=numero1/numero2;
    System.out.println("el numero es"+resultado);
}
public class Doperadores{
    public static void preba(){
        Operadores.sumar(5,2);
    }
}
}
