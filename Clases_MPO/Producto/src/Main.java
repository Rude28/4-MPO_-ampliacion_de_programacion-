import Controller.Gestor;
import model.Categoria;
import model.Producto;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Producto television=new Producto("Tv LG","001lg_Tec",600.0, Categoria.TECNOLOGICO);

        Gestor gestor=new Gestor();
        gestor.getProductosPorCondicion((item,val)->item.getPrecio()>val,90.0);
        Optional<Producto> p = gestor.buscarPorCodigo("nanana");
        p.orElse(new Producto("Tv YT","002lg_Tec",00.0, Categoria.TECNOLOGICO));
    }
}
