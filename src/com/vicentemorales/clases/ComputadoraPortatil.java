package com.vicentemorales.clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
	String marca;
	int memoriaRAM;
	int numeroSerie;
	public ComputadoraPortatil(String nombre, int precio, int cantidadDisponible, String marca, int memoriaRAM,
			int numeroSerie) {
		super(nombre, precio, cantidadDisponible);
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.numeroSerie = numeroSerie;
	}
	public void mostrarInformacion() {
		System.out.println("--Computadora--");
		System.out.println(nombre);
		System.out.println("Precio: $" + precio);
		System.out.println("Stock: " + cantidadDisponible);
		System.out.println("Marca: " + marca);
		System.out.println("Memoria RAM: " + memoriaRAM);
		System.out.println("Numero de serie: " + numeroSerie);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getMemoriaRAM() {
		return memoriaRAM;
	}
	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
	public int getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	@Override
	public String toString() {
		return super.toString() + " Marca: " + this.getMarca() + " RAM: " + this.getMemoriaRAM() + " NºSerie: " +this.getNumeroSerie(); 
	}
}
