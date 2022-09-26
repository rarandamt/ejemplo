/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.example.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

/**
 *
 * @author RAF
 */

public class Actor {
    @Id
    //@Column("id_actor")    
    private int idActor;
    private String nombre;
    private String apellidos;
    private Date ultimaActualizacion;

    
    
    
    public Actor() {
    }
    public Actor(int idActor) {
        this.idActor = idActor;
    }

    public Actor(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    
    
    
    
    public int getIdActor() {
        return idActor;
    }

    public void setIdActor(int idActor) {
        this.idActor = idActor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(Date ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }

    @Override
    public String toString() {
        return "Actor{" + "idActor=" + idActor + ", nombre=" + nombre + ", apellidos=" + apellidos + ", ultimaActualizacion=" + ultimaActualizacion + '}';
    }
    
    
    
}
