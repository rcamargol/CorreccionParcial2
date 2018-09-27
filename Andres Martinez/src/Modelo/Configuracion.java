//Andrés Martínez Castañeda - Programación 1

package Modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuracion 
{
	private String archivoVenta;
	private String archivoDetalleVenta;
	private String archivoProducto;
	private double IVA;
	private int maxRegistros;
	private String archivoProp = "configuracion.properties";
	
	private void getPropiedades() throws FileNotFoundException, IOException
	{
		Properties propiedades = new Properties();
		propiedades.load(new FileInputStream(archivoProp));
		this.archivoVenta = propiedades.getProperty("archivoVenta");
		this.archivoDetalleVenta = propiedades.getProperty("archivoDetalleVenta");
		this.archivoProducto = propiedades.getProperty("archivoProducto");
		this.IVA = Integer.parseInt(propiedades.getProperty("IVA"));
		this.maxRegistros = Integer.parseInt(propiedades.getProperty("maxRegistros"));
	}

	public String getArchivoVenta() 
	{
		return archivoVenta;
	}

	public String getArchivoDetalleVenta() 
	{
		return archivoDetalleVenta;
	}

	public String getArchivoProducto() 
	{
		return archivoProducto;
	}

	public double getIVA() 
	{
		return IVA;
	}

	public int getMaxRegistros() 
	{
		return maxRegistros;
	}

	public String getArchivoProp() 
	{
		return archivoProp;
	}

	public void setArchivoVenta(String archivoVenta) 
	{
		this.archivoVenta = archivoVenta;
	}

	public void setArchivoDetalleVenta(String archivoDetalleVenta) 
	{
		this.archivoDetalleVenta = archivoDetalleVenta;
	}

	public void setArchivoProducto(String archivoProducto) 
	{
		this.archivoProducto = archivoProducto;
	}

	public void setIVA(double iVA) 
	{
		IVA = iVA;
	}

	public void setMaxRegistros(int maxRegistros) 
	{
		this.maxRegistros = maxRegistros;
	}

	public void setArchivoProp(String archivoProp) 
	{
		this.archivoProp = archivoProp;
	}
}
