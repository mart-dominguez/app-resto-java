/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cap.java.app.resto.modelo.pedidos;

import com.mavha.cap.java.app.resto.modelo.usuarios.Administrador;
import com.mavha.cap.java.app.resto.modelo.usuarios.Cliente;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mdominguez
 */
public class Pedido {

    private Integer id;
    private Date fecha;
    private EstadoPedido estado;
    private Cliente pedidoPor;
    private Administrador aceptadoPor;
    private List<DetallePedido> detalle;

}
