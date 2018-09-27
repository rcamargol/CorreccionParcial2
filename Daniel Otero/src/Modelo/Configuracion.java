package Modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuracion {

	private Properties p;
	private String archivoDetalleVenta;
	private String archivoProducto;
	private double IVA;
	private int maxRegistros;
	private Properties prop;
	private String archivoprop = "configuracion.properties";

	public Configuracion() throws FileNotFoundException, IOException {
		prop = new Properties();
		String archivoVenta = "";
		archivoDetalleVenta="";
		archivoProducto="";
		maxRegistros=0;
		IVA = 0;
		getPropiedades();
	}
	
	public void getPropiedades() throws FileNotFoundException, IOException {
		//método a construir
		
		
		prop.load(new FileInputStream(archivoprop));
		archivoDetalleVenta = prop.getProperty("archivoDetalleVenta");
		IVA = Integer.parseInt(prop.getProperty("iva"));
		archivoProducto = prop.getProperty("archivoProducto");
		maxRegistros =  Integer.parseInt(prop.getProperty("maxRegistros"));
		
		
			
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

	
	
	
	
	
	
	
}
