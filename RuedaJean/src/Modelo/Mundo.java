package Modelo;

//Representa el mundo del problema: las clases y métodos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Mundo {
	
	private Ventas ventas;
	private Configuracion config;

	public Mundo() {
		// TODO Auto-generated constructor stub
		config = new Configuracion();
		ventas = new Ventas(config.getMaxRegistros());
	}

	public Ventas getVentas() {
		return ventas;
	}

	public void setVentas(Ventas ventas) {
		this.ventas = ventas;
	}

	public Configuracion getConfig() {
		return config;
	}

	public void setConfig(Configuracion config) {
		this.config = config;
	}
	
	
}
