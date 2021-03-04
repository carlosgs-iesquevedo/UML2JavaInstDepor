package es.carlosgs.instdepor;

import java.util.List;

enum TipoInstalacion {
    PISCINA, FRONTON, GIMNASIO, PISTA_TENIS
}

public class Instalacion {
    private String nombre;
    private TipoInstalacion tipo;

    private List<ReservaInstalacion> reservas;

    public Instalacion(String nombre, TipoInstalacion tipo, List<ReservaInstalacion> reservas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.reservas = reservas;
    }
}
