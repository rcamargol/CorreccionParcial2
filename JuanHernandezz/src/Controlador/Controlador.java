package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {

	private static final double IVA = 0;

	private Mundo bd;

	private Interfaz gui;

	public Controlador() {

		bd.getConfig().getPropiedades();
		bd.getVentas().leerArchivoProductos(nombrearchivo);
		bd.getVentas().leerArchivoDetalleVentas(nombreArchivo);
		bd.getVentas().consolidarVentas(IVA);
		gui.escribirResultados(bd.getVentas().generarReporteVentas());
		gui.escribirResultados(bd.getVentas().generarReporteXProducto());
	}

}
