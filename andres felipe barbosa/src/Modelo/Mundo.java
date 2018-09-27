package Modelo;

	public class Mundo {
		private Ventas ventas;
		private Configuracion config;

		public Mundo() {
			// TODO Auto-generated constructor stub
			config = new Configuracion();
			ventas = new Ventas(config.getMaxRegistro());
		}
	}


