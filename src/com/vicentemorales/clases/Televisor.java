package com.vicentemorales.clases;

public class Televisor extends ProductoElectrodomestico {
	int tamañoPantalla;
	int resolucion;
	public Televisor(String nombre, int precio, int cantidadDisponible, int tamañoPantalla, int resolucion) {
		super(nombre, precio, cantidadDisponible);
		this.tamañoPantalla = tamañoPantalla;
		this.resolucion = resolucion;
	}
	@Override
	public String toString() {
		return super.toString() + " Pantalla: " + this.getTamañoPantalla() + "'' " + this.getResolucion() + " Pixeles";
	}
	public void mostrarInformacion() {
	System.out.println("--Televisor--");
	System.out.println(nombre);
	System.out.println("Precio: $" + precio);
	System.out.println("Stock: " + cantidadDisponible);
	System.out.println("Tamaño: " + tamañoPantalla + "''");
	System.out.println("Resolucion: " + resolucion + "p");
	}
	public int getTamañoPantalla() {
		return tamañoPantalla;
	}
	public void setTamañoPantalla(int tamañoPantalla) {
		this.tamañoPantalla = tamañoPantalla;
	}
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	
}
