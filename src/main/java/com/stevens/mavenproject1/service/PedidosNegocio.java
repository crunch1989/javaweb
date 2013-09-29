/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevens.mavenproject1.service;

import com.stevens.mavenproject1.dao.DAOExcepcion;
import com.stevens.mavenproject1.dao.PedidoDAO;
import com.stevens.mavenproject1.model.DetallePedido;
import com.stevens.mavenproject1.model.Pedido;
import java.util.Collection;

/**
 *
 * @author LAB704-00
 */
public class PedidosNegocio {
    public void realizarPedido( Pedido pedido,Collection<DetallePedido> detalles)  throws DAOExcepcion {
		
		pedido.setDetalles(detalles);
		
		PedidoDAO dao = new PedidoDAO();
		try {
			dao.insertar(pedido);
		} catch (DAOExcepcion e) {
			throw e;
		}		

	}

}
