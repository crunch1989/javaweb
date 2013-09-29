/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.service;

import com.stevens.mavenproject1.dao.DAOExcepcion;
import com.stevens.mavenproject1.model.DetallePedido;
import com.stevens.mavenproject1.model.Pedido;
import com.stevens.mavenproject1.service.PedidosNegocio;
import java.util.ArrayList;
import java.util.Collection;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author LAB704-00
 */
public class PedidosNegocioTest extends TestCase {
    @Test
	public void realizarPedidoTest(){
		
		DetallePedido dp1 = new DetallePedido();
		dp1.setIdProducto(1);
		dp1.setPrecio(10);
		dp1.setCantidad(1);
		
		DetallePedido dp2 = new DetallePedido();
		dp2.setIdProducto(2);
		dp2.setPrecio(20);
		dp2.setCantidad(1);

		Collection<DetallePedido> detalles = new ArrayList<DetallePedido>();
		detalles.add(dp1);
		detalles.add(dp2);
		Pedido pedido = new Pedido();
                pedido.setIdUsuario("david");
                pedido.setFecha("2011-07-15");
                pedido.setTotal(1);
                
		PedidosNegocio negocio = new PedidosNegocio();
		try {
			negocio.realizarPedido(pedido, detalles);
		} catch (DAOExcepcion e) {
			Assert.fail("Falló la inserción");
		}		
	}

}
