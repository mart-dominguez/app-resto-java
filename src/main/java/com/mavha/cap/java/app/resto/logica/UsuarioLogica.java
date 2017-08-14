/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cap.java.app.resto.logica;

import com.mavha.cap.java.app.resto.modelo.usuarios.Usuario;

/**
 *
 * @author mdominguez
 */
public class UsuarioLogica {
        
    private static Integer ID_USUARIO = 0;
    
    public Usuario crearUsuario(String nombre,String clave){
        Usuario  usuario = null;
        if(nombre == null || clave==null) return usuario;
        if(nombre.length()<5) return usuario;
        if(clave.length()<8) return usuario;
        usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setEsActivo(true);
        usuario.setClave(clave);
        usuario.setId(ID_USUARIO++);
        return usuario;
        
    }

}
