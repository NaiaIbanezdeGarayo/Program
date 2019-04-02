/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Naia
 */
public class Evento {
    private String nombre;
    private String lugarEvento;
    private Date fechaEvento;
    private Time horaInicio;
    private Time horaFinal;
    private String capacidad;

    public Evento(String nombre, String lugarEvento, Date fechaEvento, Time horaInicio, Time horaFinal, String capacidad) {
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

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Time horaFinal) {
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
