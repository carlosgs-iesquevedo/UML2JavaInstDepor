package es.carlosgs.instdepor;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private int id;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Socio socio;

    public Reserva(int id, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, Socio socio) {
        this.id = id;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.socio = socio;
    }
}
