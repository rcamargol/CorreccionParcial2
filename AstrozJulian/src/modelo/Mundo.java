package modelo;

public class Mundo 
{
	private Ventas ventas;
	private Configuraci�n config;
	
	public Mundo()
	{
		config = new Configuraci�n();
		ventas = new Ventas(config.getMaxRegistros());
	}

	public Ventas getVentas() {
		return ventas;
	}

	public void setVentas(Ventas ventas) {
		this.ventas = ventas;
	}

	public Configuraci�n getConfig() {
		return config;
	}

	public void setConfig(Configuraci�n config) {
		this.config = config;
	}

	
}
