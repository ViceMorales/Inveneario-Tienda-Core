package com.vicentemorales;

import java.util.ArrayList;
import com.vicentemorales.clases.Televisor;
import com.vicentemorales.clases.ComputadoraPortatil;
import com.vicentemorales.clases.ProductoElectrodomestico;
import com.vicentemorales.clases.ProductoElectrodomestico;

public class TiendaElectronica {
	 public static ArrayList<ProductoElectrodomestico> listaDeProductos = new ArrayList<ProductoElectrodomestico>();
	 
	public TiendaElectronica() {
		listaDeProductos = new ArrayList<ProductoElectrodomestico>();
	}
	
	public static void agregarProducto(ProductoElectrodomestico producto){
		listaDeProductos.add(producto);
	}
	public static ArrayList<ProductoElectrodomestico> getListaDeProductos() {
		return listaDeProductos;
	}
	public void setListaDeProductos(ArrayList<ProductoElectrodomestico> listaDeProductos) {
		this.listaDeProductos = listaDeProductos;
	}
	
	public static ProductoElectrodomestico buscarPorNombre(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }
	public static void mostrarInfoObjeto(String nombre) {
		ProductoElectrodomestico producto = buscarPorNombre(nombre);
        if (producto != null) {
            System.out.println(producto.toString());
        } 
    }
}

