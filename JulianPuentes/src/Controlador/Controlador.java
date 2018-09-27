package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;;

public class Controlador {
	Mundo bd;
	Interfaz gui;

	public Controlador() {
		bd = new Mundo();
		gui = new Interfaz();
		bd.getConfig().getPropiedades();
		gui.escribirResultados(null);
	}
}
