package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {

	private Mundo bd;
	
	private Interfaz gui;
	
	public Controlador() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		
		bd = new Mundo();
		gui = new Interfaz();
		//aquí van los métodos que ejecutarán el programa
		bd.getConfig().getPropiedades();
		bd.getVentas().leerArchivoProductos(bd.getConfig().getArchivoProducto());
		bd.getVentas().leerArchivosDetalleVentas(bd.getConfig().getArchivoDetalleVenta());
		bd.getVentas().consolidarVnetas(bd.getConfig().getIVA());
		gui.escribirResultados(bd.getVentas().generarReporteVentas());
		gui.escribirResultados(bd.getVentas().generarReporteXProducto());
		
	}

	public Interfaz getGui() {
		return gui;
	}

	public void setGui(Interfaz gui) {
		this.gui = gui;
	}

	public Mundo getBd() {
		return bd;
	}

	public void setBd(Mundo bd) {
		this.bd = bd;
	}

}

