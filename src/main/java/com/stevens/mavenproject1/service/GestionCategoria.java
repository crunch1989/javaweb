/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevens.mavenproject1.service;

import com.stevens.mavenproject1.dao.CategoriaDAO;
import com.stevens.mavenproject1.dao.DAOExcepcion;
import com.stevens.mavenproject1.model.Categoria;
import java.util.Collection;



/**
 *
 * @author LAB704-00
 */
public class GestionCategoria {
    
    
    public static void main(String[] args) throws DAOExcepcion {
        
       /*
     Categoria catOfi=   GestionCategoria.insertar("Oficina", "Productos de oficina");
      Categoria cas=   GestionCategoria.insertar("Casa", "Productos de casa");
        System.out.println(catOfi.getId_categoria());
        System.out.println(cas.getId_categoria());
      */
        GestionCategoria.listar();
        
    }
    public Collection<Categoria> buscarPorNombre(String nombre)
			throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();
		return dao.listar();
	}

	public static Categoria insertar(String nombre, String descripcion)
			throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();

		Categoria vo = new Categoria();
		vo.setNombre(nombre);
		vo.setDescripcion(descripcion);

		return dao.insertar(vo);
	}

	public Categoria obtener(int idCategoria) throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();
		return dao.obtener(idCategoria);
	}

	public void eliminar(int idCategoria) throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();
		dao.eliminar(idCategoria);
	}

	public Categoria actualizar(int idCategoria, String nombre,
			String descripcion) throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();

		Categoria vo = new Categoria();
		vo.setId_categoria(idCategoria);
		vo.setNombre(nombre);
		vo.setDescripcion(descripcion);

		return dao.actualizar(vo);
	}

	public static  void listar() throws DAOExcepcion {
		CategoriaDAO dao = new CategoriaDAO();
		Collection<Categoria> resultado = dao.listar();
                for(Categoria categorias : resultado)
                {
                    System.out.println(categorias.getId_categoria()+" "+categorias.getNombre()+" "+categorias.getDescripcion());
                }
	}

    
}
