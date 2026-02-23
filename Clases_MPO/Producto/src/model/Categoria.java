package model;

public enum Categoria {

    /*categoria de objetos inamovibles como en un supermercado y se declaro como enum*/

    ALIMENTACION("Esta categoria es de muebles para decorar"),
    MUEBLES(),
    ROPA(),
    TECNOLOGICO("Esta categoria marca productos de tecnologia");

    private String descripcion;
    private Categoria(){}

    Categoria(String descripcion){

    }
    public String getDescripcion(){
        return descripcion;
    }

}
