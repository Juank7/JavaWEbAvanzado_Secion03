package com.tecsup.javawebavanzado.sesion03.negocio;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import com.tecsup.javawebavanzado.sesion03.exception.DAOExcepcion;
import com.tecsup.javawebavanzado.sesion03.modelo.Productos;

public class GestionProductos2 {

	static HashMap<Integer, Collection<Productos>> 
	productosXcategorias = new HashMap<Integer, Collection<Productos>>(); 

static {
	productosXcategorias.put(new Integer(1), 
				Arrays.asList(new Productos(10,"Smartphone",50,"phone"),
							  new Productos(11,"Tablet",100,"tablet")));
	productosXcategorias.put(new Integer(2), 
			Arrays.asList(new Productos(20,"La Casa Verde",300,"verde"),
						  new Productos(21,"El Capitan Grant",400,"capitan")));
	productosXcategorias.put(new Integer(3), 
			Arrays.asList(new Productos(30,"Futbol",400,"futbol"),
						  new Productos(31,"Voley",400,"voley")));

}

public Collection<Productos> listarPorCategoria(int idCategoria) throws DAOExcepcion {
	// TODO Auto-generated method stub
	return productosXcategorias.get(idCategoria);
}

}
