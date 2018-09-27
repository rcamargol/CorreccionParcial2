package Modelo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuracion {
	private String archivoVenta;
	private String archivoDetalleVenta;
	private String archivoProducto;
	private double IVA;
	private int maxRegistros;
	private Properties prop;
	private String archivoprop = "C:\\Users\\aulamovil06\\Desktop\\producto.txt";

	public Configuracion() {
		prop = new Properties();
		archivoVenta="";
		archivoDetalleVenta="";
		archivoProducto="";
		maxRegistros=0;
		IVA = 0;
		getPropiedades();
	}
	
	public String getArchivoVenta() {
		return archivoVenta;
	}

	public void setArchivoVenta(String archivoVenta) {
		this.archivoVenta = archivoVenta;
	}

	public String getArchivoDetalleVenta() {
		return archivoDetalleVenta;
	}

	public void setArchivoDetalleVenta(String archivoDetalleVenta) {
		this.archivoDetalleVenta = archivoDetalleVenta;
	}

	public String getArchivoProducto() {
		return archivoProducto;
	}

	public void setArchivoProducto(String archivoProducto) {
		this.archivoProducto = archivoProducto;
	}

	public double getIVA() {
		return IVA;
	}

	public void setIVA(double iVA) {
		IVA = iVA;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getArchivoprop() {
		return archivoprop;
	}

	public void setArchivoprop(String archivoprop) {
		this.archivoprop = archivoprop;
	}

	public void setMaxRegistros(int maxRegistros) {
		this.maxRegistros = maxRegistros;
	}

	public void getPropiedades() {
		try {
			// load a properties file for reading
			prop.load(new FileInputStream(archivoprop));
			// get the properties and print
			prop.list(System.out);
			//Reading each property value
			System.out.println(prop.getProperty("propiedades"));
			System.out.println(prop.getProperty("C:\\\\Users\\\\aulamovil06\\\\Desktop\\\\producto.txt"));
			System.out.println(prop.getProperty("tienda"));
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
	

	

	public int getMaxRegistros() {
		// TODO Auto-generated method stub
		return 0;
	}
}
