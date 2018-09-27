//Andrés Martínez Castañeda - Programación 1

package Vista;

import javax.swing.JOptionPane;

public class Vista 
{
	public void escribirResultados(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
}
