package com.tecsup.javawebavanzado.sesion03.beans;

import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.tecsup.javawebavanzado.sesion03.exception.DAOExcepcion;
import com.tecsup.javawebavanzado.sesion03.modelo.Producto;
import com.tecsup.javawebavanzado.sesion03.negocio.GestionProductos;

@ManagedBean(name = "productoBean")
@RequestScoped

public class ProductoBean {

	private int idCategoria;
	private String nombre;
	private String imagen;
	private int precio;
	
	private Collection<Producto> producto;
	
	public void cargarProductos(int id) {
		System.out.println("Dentro de cargarProductos()");
		GestionProductos negocio = new GestionProductos();
		try {
			producto = negocio.listarPorCategoria(idCategoria);
			System.out.println("Total de productos: " + producto.size());
		} catch (DAOExcepcion e) {
			e.printStackTrace();
		}
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Collection<Producto> getProductos() {
		return producto;
	}

	public void setProductos(Collection<Producto> productos) {
		this.producto = productos;
	}
	
	
	
}
