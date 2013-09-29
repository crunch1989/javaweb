/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.dao;

import com.stevens.mavenproject1.dao.DAOExcepcion;
import com.stevens.mavenproject1.dao.ProductoDAO;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author LAB704-00
 */
public class ProductoDAOTest {
    @Test
	public void obtenerTotalTest(){
		ProductoDAO dao = new ProductoDAO();
		try {
			int total = dao.obtenerTotal();	
			System.out.println("Total --> " + total);
			
			Assert.assertTrue(total > 0);
		} catch (DAOExcepcion e) {
			Assert.fail("falló");
		}		
	}

}
