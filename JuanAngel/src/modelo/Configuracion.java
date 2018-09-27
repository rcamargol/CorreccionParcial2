package modelo;

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
		archivoVenta="";
		archivoDetalleVenta="";
		archivoProducto="";
		maxRegistros=0;
		IVA = 0;
		getPropiedades();
		}

		private void getPropiedades() {
			
			getPropiedades();
		}

		public int getMaxRegistros() {
			
			return maxRegistros;
		}
		

}

