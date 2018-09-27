package modelo;

public class Mundo 
{
	private Ventas ventas;
	private Configuración config;
	
	public Mundo()
	{
		config = new Configuración();
		ventas = new Ventas(config.getMaxRegistros());
	}

	public Ventas getVentas() {
		return ventas;
	}

	public void setVentas(Ventas ventas) {
		this.ventas = ventas;
	}

	public Configuración getConfig() {
		return config;
	}

	public void setConfig(Configuración config) {
		this.config = config;
	}

	
}
