package es.carlosgs.instdepor;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaInstalacion extends Reserva {
    private Instalacion instalacion;

    public ReservaInstalacion(int id, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin,
                              Socio socio, Instalacion instalacion) {
        super(id, fecha, horaInicio, horaFin, socio);
        this.instalacion = instalacion;
    }
}
