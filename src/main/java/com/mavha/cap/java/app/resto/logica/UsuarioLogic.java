/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cap.java.app.resto.logica;

import java.util.Date;

/**
 *
 * @author mdominguez
 */
public interface UsuarioLogic {
    
    public void crearUsuario(String nombre,String email,Date fechaNacimiento);
    
}
