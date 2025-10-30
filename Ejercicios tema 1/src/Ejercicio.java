import java.util.Scanner;

public class Ejercicio {
    private Scanner lecturaTeclado; // aqui reservamos lecturaTeclado como scaner privado de esta clase solo
    //cuando lo usemos nos va a dar null, entonces cuadno la usemos tenemos que darle un valor
    public void ejercicio1(){
        lecturaTeclado = new Scanner(System.in); // aqui creamos el objeto lectura teclado vuya propiedad es el metodo
        //de scanear cosas que entren pro teclado
         // 1. Introducir valores
         // 2. Guardar en variables
        lecturaTeclado= new Scanner(System.in);
        System.out.println("¿Cual es el numero de bocatas?");
        int numeroBocatas= lecturaTeclado.nextInt();
        System.out.println("Cual es el número de refrescos");
        int numeroRefrescos= lecturaTeclado.nextInt();
        System.out.println("Cual es el precio de los bocatas");
        double precioBocatas= lecturaTeclado.nextDouble();
        System.out.println("Cual es el preico de los bocadillos");
        double precioRefrescos= lecturaTeclado.nextDouble();
        System.out.println("Cual es el numero de alumnos");
        int numeroAlumnos = lecturaTeclado.nextInt();

         // 3. Realizar calculos
        double subtotalBocatas=numeroBocatas*precioBocatas;
        double subtotalRefrescos=numeroRefrescos*precioRefrescos ;
        double totalCompra= subtotalRefrescos+subtotalBocatas;
        double cantidadAlumno= totalCompra/numeroAlumnos;
         // 4. Mostrar datos
        // para poder redondear debemos usar el print f en vez de el print ln
        // el print f nos permite formatear una salida, es decir hacer una especie de plantilla con parametros
        // para eso usamos las banderas %
        //numero sin decimales%D
        //numero con decimales %f (poniendo antes.2 concretamos cuantos decimales, en este caso dos)
        //booleano %d
        // si es una letra &s
        System.out.printf("El subtotal de bocatas es %.2f %n" ,subtotalBocatas);
        System.out.printf("El subtotal de refrescos es %.2f%n" ,subtotalRefrescos);
        System.out.printf("El precio por alumnos es %.0f%n" ,cantidadAlumno);
        lecturaTeclado.close();
        lecturaTeclado=null;
         // es importante cerrar con lectura.close();
    }
    public void ejercicio2 () {
        //Introducir valores con dos decimales
        lecturaTeclado = new Scanner(System.in);

        double precioCompra = lecturaTeclado.nextDouble();
        //Que estos valores vayan en un rango de entre 0 y 500
        if (precioCompra < 501 && precioCompra > 0) {
            double iva=precioCompra*25;
            iva=iva/100;
            System.out.println("El precio de comrpa es " +precioCompra +" y el IVA es"+iva);
        }else {
            System.out.println("El precio de compra es incorrecto");
        }
        //Calcular el iva del 25%
        //Mostrar valores
        lecturaTeclado.close();
        lecturaTeclado=null;
    }
    public void ejercicio3(){
        lecturaTeclado= new Scanner(System.in);
        System.out.println("Dime las decenas de mil");
        int numeroAnalizar= lecturaTeclado.nextInt();
        if(numeroAnalizar>9999&&numeroAnalizar<1000000);
        int decenasMil=numeroAnalizar/10000;
        int unidadesMil=(numeroAnalizar%10000)/1000;
        int centenas=((numeroAnalizar%10000)%1000)/100;
        int decenas=(((numeroAnalizar%10000)%1000)%100)/10;
        int unidades=(((numeroAnalizar%10000)%1000)%100)%10;
    }
    public void ejercicio4(){
        //leer cosas por consola
        //hacer operaciones por consolas
        //mostrar un resultado
        lecturaTeclado=new Scanner(System.in);
        int numeroSegundos=lecturaTeclado.nextInt();
        int horas=numeroSegundos/360;
        int minutos=numeroSegundos%360;
        minutos= mintuos/60;
        int segundos= numeroSegundos%360;
        segundos = minutos-segundos;
        System.out.println("Las horas son: "+horas+"Los minutos son: "+minutos+"Los segundos son: "+segundos);
    }
}
