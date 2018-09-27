package modelo;

public class Mundo {
	
		private Ventas ventas;
		private Configuracion config;

		public Mundo() {
			// TODO Auto-generated constructor stub
			config = new Configuracion();
			ventas = new Ventas(config.getMaxRegistros());
		}

		public Object getConfig() {
			
			return config;
		}

		public Object getVentas() {
			// TODO Auto-generated method stub
			return ventas;
		}

		

}

