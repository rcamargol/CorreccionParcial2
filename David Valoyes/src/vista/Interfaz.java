package vista;

import javax.swing.JOptionPane;

public class Interfaz {

	public void escribirResultados(String dato) 
	{
		
		JOptionPane.showMessageDialog(null, dato, "Tienda generica", JOptionPane.INFORMATION_MESSAGE);
	}
}
