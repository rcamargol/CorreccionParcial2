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
	private String archivoprop = "configuracion.properties";

	public Configuracion() {
		prop = new Properties();
		archivoVenta="venta.txt";
		archivoDetalleVenta="detalleventa.txt";
		archivoProducto="producto.txt";
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




	public int getMaxRegistros() {
		return maxRegistros;
	}




	public void setMaxRegistros(int maxRegistros) {
		this.maxRegistros = maxRegistros;
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




	public void getPropiedades() {
	//m�todo a construir
		try {
			
			prop.load(new FileInputStream(archivoprop));
			
			prop.list(System.out);
			
			System.out.println(prop.getProperty(archivoDetalleVenta));
			System.out.println(prop.getProperty(archivoVenta));
			System.out.println(prop.getProperty("iva"));
			System.out.println(prop.getProperty(archivoProducto));
			System.out.println(prop.getProperty("maxRegistros"));
			} catch (IOException ex) {
			ex.printStackTrace();
			}
		
	}

}
