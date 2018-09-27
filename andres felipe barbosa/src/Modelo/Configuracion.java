package Modelo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuracion {
	private String archivoVenta;
	private String archivoDetalleVenta;
	private String archivoProducto;
	private double IVA;
	private int maxRegistro;
	private Properties prop;
	private String archivoProp = "configuracion.properties";

	public Configuracion() {
		prop = new Properties();
		archivoVenta="";
		archivoDetalleVenta="";
		archivoProducto="";
		maxRegistro=0;
		IVA = 0;
		getPropiedades();
	}
	
	

	public int getMaxRegistro() {
		return maxRegistro;
	}



	public void setMaxRegistro(int maxRegistro) {
		this.maxRegistro = maxRegistro;
	}



	public void getPropiedades() {
		try{
			prop.load(new FileInputStream(this.archivoProp));
			prop.list(System.out);
			
			System.out.println(prop.getProperty(archivoDetalleVenta));
			System.out.println(prop.getProperty(archivoVenta));
			System.out.println(prop.getProperty("IVA"));
			System.out.println(prop.getProperty(archivoProducto));
			System.out.println(prop.getProperty("maxRegistro"));
		}catch(IOException ex)
		{
			ex.printStackTrace();
		}
	//método a construir
	}
}
	

