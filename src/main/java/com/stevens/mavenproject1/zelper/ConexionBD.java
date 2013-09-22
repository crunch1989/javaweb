/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevens.mavenproject1.zelper;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LAB704-00
 */
public class ConexionBD {
    
    public static Connection obtenerConexion() throws SQLException {

	Connection con = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/java_web","root", "mysql");
					
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return con;
}

    
}
