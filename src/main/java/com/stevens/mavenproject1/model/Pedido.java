/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevens.mavenproject1.model;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author LAB704-00
 */
public class Pedido {
    
        private int idPedido;
	private String idUsuario;
	private String fecha;
	private String estado;
	private double total;
	private Collection<DetallePedido> detalles = new ArrayList<DetallePedido>();

        
        
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Collection<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(Collection<DetallePedido> detalles) {
        this.detalles = detalles;
    }

}
