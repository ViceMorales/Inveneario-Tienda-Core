package com.vicentemorales.clases;

import com.vicentemorales.TiendaElectronica;

public class ProductoElectrodomestico {
	public String nombre;
	int precio;
	public  int cantidadDisponible;
	public ProductoElectrodomestico(String nombre, int precio, int cantidadDisponible) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}
	public ProductoElectrodomestico(int cantidadDisponible) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = 0;
	}
	public void mostrarInformacion() {
		System.out.println(nombre);
		System.out.println("$" + precio);
		System.out.println(cantidadDisponible);
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
	public int getCantidadDisponible() {
		return cantidadDisponible;
	}
	public static void setCantidadDisponible(int cantidadDisponible) {
		cantidadDisponible = cantidadDisponible;
	}
	public void vender() {
		cantidadDisponible --;
		if (cantidadDisponible == 0) {
			System.out.println("El producto está agotado");
		}
	}
	@Override
	public String toString() {
		return this.getNombre() + " Precio: $" + this.getPrecio() + " Stock: " + this.getCantidadDisponible(); 
	}

	public static ProductoElectrodomestico get(int i) {
		ProductoElectrodomestico productoElecto = TiendaElectronica.listaDeProductos.get(i);
		return productoElecto;
	}
}