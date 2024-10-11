package com.vicentemorales;

import com.vicentemorales.clases.Televisor;
import com.vicentemorales.clases.ComputadoraPortatil;
import com.vicentemorales.clases.ProductoElectrodomestico;
import com.vicentemorales.TiendaElectronica;

public class Aplicacion {
	public static void main(String[] args) {
		ProductoElectrodomestico tv1 = new Televisor("TVLG", 99000, 1, 35, 1080);
		ProductoElectrodomestico tv2 = new Televisor("SmartTV", 250000, 7, 80, 720);
		ProductoElectrodomestico pc1 = new ComputadoraPortatil("Lenovo thinkpad", 350000, 6, "Lenovo", 16, 6874465);
		ProductoElectrodomestico pc2 = new ComputadoraPortatil("Macbook Air", 650000, 3, "Mac", 32, 9223877);
		
		TiendaElectronica.agregarProducto(tv1);
		TiendaElectronica.agregarProducto(tv2);
		TiendaElectronica.agregarProducto(pc1);
		TiendaElectronica.agregarProducto(pc2);
		
		tv1.vender();
		tv1.mostrarInformacion();
		pc2.vender();
		pc2.mostrarInformacion();
		
	
		TiendaElectronica.mostrarInfoObjeto("Macbook Air"); //Busca por nombre
		System.out.println(ProductoElectrodomestico.get(0));//Busca por indice del atributo
		System.out.println(TiendaElectronica.getListaDeProductos());//Lista completa de Productos
		
		
		
	}
}