/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cap.java.app.resto.logica;

import com.mavha.cap.java.app.resto.modelo.usuarios.Usuario;
import java.util.Date;

/**
 *
 * @author mdominguez
 */
public interface UsuarioLogic {
    
    public Usuario crearUsuario(String nombre,String clave);
    public Usuario crearUsuario(String nombre,String clave,String mail);
    
}