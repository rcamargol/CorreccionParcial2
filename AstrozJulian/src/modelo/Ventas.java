package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ventas 
{
	private DetalleVentas [] detalleVentas;
	private Productos [] productos;
	private double valorTotal;
	private double valorIva;
	private double valorMasIva;
	private int totalRegDV;
	private int totalRegPR;
	private File f;
	private FileReader fr;
	private BufferedReader br;
	
	public Ventas(int maxRegistros)
	{
		detalleVentas = new DetalleVentas[maxRegistros];
		productos = new Productos[maxRegistros];
		this.valorTotal = 0;
		this.valorIva = 0;
		this.valorMasIva = 0;
	}
	
	public void leerArchivoDetalleVentas(String archivo)
	{
		f = new File(archivo);
		String [] dv = new String [5];
		int i =  0;
		
		try
		{
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String linea = br.readLine();
			
			while(linea != null)
			{
				dv = linea.split(",");
				detalleVentas[i] = new DetalleVentas();
				this.detalleVentas[i].setCodigoDetalleVenta(Integer.parseInt(dv[0]));
				this.detalleVentas[i].setCodigoProducto(Integer.parseInt(dv[1]));
				this.detalleVentas[i].setCantidad(Integer.parseInt(dv[2]));
				this.detalleVentas[i].setValorUnitario(Double.parseDouble(dv[3]));
				this.detalleVentas[i].setValorTotal(Double.parseDouble(dv[4]));
				linea = br.readLine();
				i++;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		this.totalRegDV = i;
	}
	
	public void leerArchivoProductos(String nombrearchivo)
	{
		
	}
	
	public String buscarProducto(int codproducto) {
		int i;
		String valor = null;
		for (i = 0; i<this.totalRegPR ; i++) {
			if (productos[i].getCodigoProducto() == codproducto) {
				valor = productos[i].getNombreProducto();
			}
		}
		return valor;
	}
	
	public void consolodarVentas(double iva)
	{
		
	}
	
	public String generarReporteVentas()
	{
		
	}
	
	public String generarReporteXProducto() {
		String linea = "";
		linea = "Listado de Ventas por Producto\n\n";
		for (int i=0 ; i< this.totalRegDV ; i++) {
			linea += this.buscarProducto(this.detalleVentas[i].getCodigoProducto())+" -- ";
			linea += this.detalleVentas[i].getValorUnitario()+" -- ";
			linea += this.detalleVentas[i].getCantidad()+" -- ";
			linea += this.detalleVentas[i].getValorTotal()+"\n";
		}
		return linea;
	}

}
