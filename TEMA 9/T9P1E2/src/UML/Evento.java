/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Naia
 */
public class Evento {
    private String nombre;
    private String lugarEvento;
    private LocalDate fechaEvento;
    private LocalTime horaInicio;
    private LocalTime horaFinal;
    private String capacidad;

    public Evento(String nombre, String lugarEvento, LocalDate fechaEvento, LocalTime horaInicio, LocalTime horaFinal, String capacidad) {
        this.nombre = nombre;
        this.lugarEvento = lugarEvento;
        this.fechaEvento = fechaEvento;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.capacidad = capacidad;
    }

    public Evento() {
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarEvento() {
        return lugarEvento;
    }

    public void setLugarEvento(String lugarEvento) {
        this.lugarEvento = lugarEvento;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return   nombre + lugarEvento + fechaEvento + horaInicio + horaFinal + capacidad;
    }

    
    
}
