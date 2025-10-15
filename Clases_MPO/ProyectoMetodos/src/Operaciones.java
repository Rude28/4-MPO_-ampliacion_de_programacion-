public class Operaciones {
    // no teiene mein
    //variables
    //metodos -> funcionalidades que quieres poder ejecutar
    public void sumar(int op1,int op2){//aqui estamos poniendo como condicion que necesitamos que nos metan dos operadores
        int resultado= op1 + op2;
        System.out.println("El resultado de la suma es " + resultado);
    }
    private void restar(int op1,int op2){ // al ser privado nadie lo puede ver fuera de la clase
        int resultado= op1 - op2;// no comparte ambito por lo tanto podemos hacer dos variables con el mismo nombre
        System.out.println("El resultado de la resta es " + resultado);
    }
    protected void multiplicar(int op1,int op2){ //la diferencia con un publico es que permite su acceso dentro de la classe en la que se declara
        int resultado= op1 * op2;
        System.out.println("El resultado de la mmultiplicación es " + resultado);
    }
}


// al ser dos metodos staticos no puede aceder el main directamente, entonces necesitamos un intermediario