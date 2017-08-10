/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cap.java.app.resto.modelo.usuarios;

import java.util.Date;

/**
 *
 * @author mdominguez
 */
public class Usuario {
    private Integer id;
    private String nombre;
    private String email;
    private Date fechaNacimiento;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String email, Date fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
