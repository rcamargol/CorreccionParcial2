package Modelo;

public class Mundo {
	private Ventas ventas;
	private Configuracion config;

	public Mundo() {
		// TODO Auto-generated constructor stub
		config = new Configuracion();
		ventas = new Ventas(config.getMaxRegistros());
	}

	public Object getConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getVentas() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setVentas(Ventas ventas) {
		this.ventas = ventas;
	}

	public void setConfig(Configuracion config) {
		this.config = config;
	}
}

