package es.carlosgs.instdepor;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaArticulo extends Reserva {
    private Articulo articulo;
    private int cantidad;

    public ReservaArticulo(int id, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin,
                           Socio socio, Articulo articulo, int cantidad) {
        super(id, fecha, horaInicio, horaFin, socio);
        this.articulo = articulo;
        this.cantidad = cantidad;
    }
}
