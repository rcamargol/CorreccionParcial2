package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	public Interfaz()
	{
		
	}
	
	public void escribirResultados(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "Tienda Gen�rica", JOptionPane.INFORMATION_MESSAGE);
	}

}
