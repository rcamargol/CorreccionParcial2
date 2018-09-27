package Modelo;

public class Mundo {

	private Ventas ventas;
	private Configuracion config;

	public Mundo() {
		// TODO Auto-generated constructor stub
		config = new Configuracion();
		ventas = new Ventas(config.getMaxRegistros());
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

	public Ventas getVentas() {
		return ventas;
	}


}
