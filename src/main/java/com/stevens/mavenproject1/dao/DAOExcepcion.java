/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevens.mavenproject1.dao;

/**
 *
 * @author LAB704-00
 */
public class DAOExcepcion extends Exception {
    private static final long serialVersionUID = 1L;

	public DAOExcepcion() {
		super();
	}

	public DAOExcepcion(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public DAOExcepcion(String arg0) {
		super(arg0);
	}

	public DAOExcepcion(Throwable arg0) {
		super(arg0);
	}

}
