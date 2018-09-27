package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	public void escribirResultado(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "Tienda Genérica", JOptionPane.INFORMATION_MESSAGE);
	}
}
