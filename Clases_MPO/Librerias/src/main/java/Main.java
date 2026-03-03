import controller.Gestor;

/*
Un xml es un lenguaje demarcado
en el se escriben un conjuntos de nodos de estilo
nodo
    atributo
    valor
    contenido
solo puedo tener un nodo root
es un lenguaje marcado con etiquetas fuertes


*/
public class Main {
    public static void main(String[] args) {
        Gestor gestor= new Gestor();
        gestor.exportarXML();
    }
}
