/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cap.java.app.resto.logica;

import com.mavha.cap.java.app.resto.modelo.usuarios.Usuario;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mdominguez
 */
public class UsuarioLogicaTest {
    
    public UsuarioLogicaTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crearUsuario method, of class UsuarioLogica.
     */
    @Test
    public void testCrearUsuario() {
        UsuarioLogica userLogica = new UsuarioLogica();
        Usuario resultado = userLogica.crearUsuario(null, null);
        assertNull(resultado);
        resultado = userLogica.crearUsuario("abcdefgh", null);
        assertNull(resultado);
        resultado = userLogica.crearUsuario(null, "12345678910");
        assertNull(resultado);
        resultado = userLogica.crearUsuario("abcd", "12345678910");
        assertNull(resultado);
        resultado = userLogica.crearUsuario("abcde", "1234567");
        assertNull(resultado);
        resultado = userLogica.crearUsuario("abcde", "12345678");
        assertNotNull(resultado);

    }

    @Test
    public void testCrearUsuarioConMail() {
        UsuarioLogica userLogica = new UsuarioLogica();
        Usuario resultado = userLogica.crearUsuario(null, null);
        assertNull(resultado);
        resultado = userLogica.crearUsuario("abcdefgh", null);
        assertNull(resultado);
        resultado = userLogica.crearUsuario(null, "12345678910");
        assertNull(resultado);
        resultado = userLogica.crearUsuario("abcd", "12345678910");
        assertNull(resultado);
        resultado = userLogica.crearUsuario("abcde", "1234567");
        assertNull(resultado);
        resultado = userLogica.crearUsuario("abcde", "12345678");
        assertNotNull(resultado);

    }
    
}
