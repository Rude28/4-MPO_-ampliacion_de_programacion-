package Controller;

import model.Producto;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.function.BiPredicate;

public class Gestor {

    private List<Producto> productos;

    public Gestor(){
        productos=new ArrayList<>();
    }
    public void agregarProducto(Producto p){
        boolean existe=
        productos.stream()
                .anyMatch(item->item.getCodigo().equals(p.getCodigo()));
                            //el codigo del item es igual al codigo del producto que quieres agregar
    if (existe){
        System.out.println("Codigo ya usado no se puede agregar");
    }else {
        System.out.println("Codigo no usado se puede agregar");
    }
    }
    public void agregarPrecios(){

        productos.stream()
                .filter(item->item.getPrecio()<0)
                .forEach(item->item.setPrecio((Math.random()*100)+1));

        //me cojo la lista y voy de uno en uno preguntando si su precio es inferior a cero, en el caso de que sea iferior
        //los recorro y les asigno un nuevo precio
    }

    public void mostrarProductos(){
        productos.forEach(Producto::mostrarDatos);

        //quiero recorrer la lista de productos y al que itero le ejecuto el mostrar datos
        // (recorre productos y muestra datos)
    }
    public OptionalDouble calcularPrecioMedio(){
        productos.stream().mapToDouble(Producto::getPrecio).average().orElse(0.0);
        //convertimos la copia de lista de producto en una lista de doubles que tiene los precios de los productos
        // y con average nos devuelve la media y si no nos da el 0.0 (para despues no tener que gestionar la excepcion)
        return OptionalDouble.of(0.0);
    }
    public List<Producto> getListaProductosCaros(double limite){
        return productos.stream().filter(item->item.getPrecio()>=limite).toList();
        // copia la lista y la filtra por los productos que excedan el limite y devuelve la lista
    }
    public Optional<Producto> buscarPorCodigo(String codigo){
        System.out.println("Buscando producto");
        return productos.stream()
                        .filter(item->item.getCodigo().equalsIgnoreCase(codigo))
                        .findFirst();

    }
    public void ordenarProductos(){
        productos.sort(Comparator.comparingDouble(Producto::getPrecio).reversed());
        // de mayor a menor con el reversed, de menor a mayor si el
    }
    public List<Producto> getProductosPorCondicion(BiPredicate<Producto, Double> condicion, double valor){
        return productos.stream().filter(item->condicion.test(item,valor)).toList();
    }

    public DoubleSummaryStatistics getEstadisticas(){//para sacar las estadidsticas de un double
        return this.productos.stream()
                .mapToDouble(Producto::getPrecio)
                .summaryStatistics();
    }
    public void consultarProductos(){
        String urlConsulta="https://dummyjson.com/docs/products";
        //simulo que abro el navegador con:
        HttpClient client=HttpClient.newHttpClient();

        //hago la petición
        HttpRequest request=HttpRequest.newBuilder().uri(URI.create(urlConsulta)).GET().build();

        //obtengo una respuesta
        try {
            HttpResponse<String> response= client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException|IOException e) {
            System.out.println("Error en el proceso de conexion al servidor");
        } finally {
            try {
                client.close();
            }catch (Exception e){
                System.out.println("Error en el cerrado");
            }
        }
    }
}
