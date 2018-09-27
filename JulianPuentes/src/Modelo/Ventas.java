package Modelo;

import java.io.*;
import java.lang.reflect.Array;

public class Ventas {
	private Array DetalleVentas, Productos;
	private double valorTotal, valorIVA, valorMasIva;
	private int totalRegDV, totalRegPR;
	private File f;
	private FileReader fr;
	private BufferedReader br;

	public Ventas() {

	}

	public String leerArchivoDetalleVentas() {

		return null;

	}

	public String leerArchivoProductos() {
		return null;

	}

	public int buscarProducto() {
		return 0;

	}

	public double consolidarVentas() {
		valorMasIva = valorTotal + valorIVA;
		return valorMasIva;

	}

	public String generarReporteVentas() {

		return null;

	}

	public String generarReporteXProducto() {
		return null;

	}
}
