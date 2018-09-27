package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {

		private Mundo bd;
		
		private Interfaz gui;
		
		public Controlador() {

			//aqui van los constructores tanto de Mundo, como de Vista
			
			bd = new Mundo();
			gui = new Interfaz();

			
		}

	}

