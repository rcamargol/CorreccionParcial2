//Andrés Martínez Castañeda - Programación 1

package Controlador;

import Modelo.Mundo;
import Vista.Vista;

public class Controlador 
{

	private Mundo m;
	private Vista gui;
	
	public Controlador() 
	{
		m = new Mundo();
		gui = new Vista();
	}

}
