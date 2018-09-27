package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {

	private Mundo bd;
	
	private Interfaz gui;
	
	public Controlador() 
	{

		bd = new Mundo();
		gui = new Interfaz();

		bd.getConfig().getPropiedades();
		bd.getVentas().leerArchivoProductos(bd.getConfig().getArchivoDetalleVenta());
		bd.getVentas().leerArchivoDetalleVentas(bd.getConfig().getArchivoDetalleVenta());
		bd.getVentas().consolidarVentas(bd.getConfig().getIVA());
//		gui.escribirResultados(bd.getVentas().generarReporteVentas());
		gui.escribirResultados(bd.getVentas().generarReporteXProducto());
	}

	public Mundo getBd() {
		return bd;
	}

	public void setBd(Mundo bd) {
		this.bd = bd;
	}

	public Interfaz getGui() {
		return gui;
	}

	public void setGui(Interfaz gui) {
		this.gui = gui;
	}

}

