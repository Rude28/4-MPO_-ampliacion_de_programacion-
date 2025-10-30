public class Main {
    public static void main(String[] args) {
        System.out.println("Proyecto metodos");
        System.out.println("Vamos a realizar llamadas a metodos");
        String nombre="Gabriel";
        saludar(nombre);//aqui estoy llamando a el argumento del metodo para que este se ejecute tomando una variable como referencia
        nombre="Carmen";
        saludar(nombre);
        despedir(nombre);

        //Operaciones.sumar(4,4);
        int numero;
        Operaciones operacionesMatetmaricas = new Operaciones(); // aqui hemos creado un objeto que hace publico lo que tenemos en operaciones
        //tip variable que debe de ser el mismo que el nomrbre de la clase, variable = palabra reservada para variables complejas, clase
        operacionesMatetmaricas.sumar(1,4);
    }
    public static void saludar(String nombre){//* aqui estoy haciendo un metodo
        // y dandole un argumento llamado nombre que es de tipo strign*\\
        System.out.println("Hola"+nombre);
        System.out.println("Encantado de saludarte, vamos a practicar");
        System.out.println("Vamos a practicar el lalmado de metodos");
        // si dos m
    }
    public static void despedir(String nombre){ // al ser statico se ejecuta directamente
        System.out.println("Hasta luego cara huevo");
    }
    public
}

