//Andr�s Mart�nez Casta�eda - Programaci�n 1

package Vista;

import javax.swing.JOptionPane;

public class Vista 
{
	public void escribirResultados(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "T�tulo del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
}
