package es.carlosgs.instdepor;

import java.util.ArrayList;
import java.util.List;

enum TipoArticulo {
    BALÓN, RED, RAQUETA
}

public class Articulo {
    private int codigo;
    private String descripcion;
    private TipoArticulo tipo;

    private List<ReservaArticulo> reservas;

    public Articulo(int codigo, String descripcion, TipoArticulo tipo, List<ReservaArticulo> reservas) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.reservas = reservas;
    }
}
