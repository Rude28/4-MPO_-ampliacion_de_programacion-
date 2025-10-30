public class Main {
    public static void main(String[] args) {
    saludar("Gabriel");
    saludar1("Andrea",7);
    Operadores.sumar(5,3);
    Operadores r =new Operadores();
    r.resta (2,1);
    Operadores.division(5,2);

    }
    public static void saludar(String nombre,){
        System.out.println("Hola me llamo "+nombre);
    }
    public static void saludar1(String nombre,int numero){
        System.out.println("Hola me llamo "+nombre+"y tengo "+ numero+" años " );
    }

}
