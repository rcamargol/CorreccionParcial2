package modelo;

import java.util.Properties;

public class Configuración 
{
	private String archivoVenta;
	private String archivoDetalleVenta;
	private String archivoProducto;
	private double iva;
	private int maxRegistros;
	private Properties prop;
	private String archivoProp = "configuracion,properties";
	
	public Configuración()
	{
		prop = new Properties();											
		archivoVenta = "";
		archivoDetalleVenta = "";
		archivoProducto = "";
		maxRegistros = 0;
		iva = 0;
		getPropiedades();
	}
	
	public void getPropiedades()
	{
		
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

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
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

	public String getArchivoProp() {
		return archivoProp;
	}

	public void setArchivoProp(String archivoProp) {
		this.archivoProp = archivoProp;
	}
}
