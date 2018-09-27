package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ventas {
	private DetalleVentas[] detalleVentas;
	private Productos[] productos;
	private double valorTotal;
	private double valorIVA;
	private double valormasIVA;
	private int totalRegDV;
	private int totalRegPR;
	private File f;
	private FileReader fr;
	private BufferedReader br;

	public Ventas(int maxregistros) {
		detalleVentas = new DetalleVentas[maxregistros];
		productos = new Productos[maxregistros];
		this.valorTotal = 0;
		this.valorIVA = 0;
		this.valormasIVA = 0;
	}

	public void leerArchivoDetalleVentas(String nombreArchivo) 
	{
		f = new File(nombreArchivo);
		String[] dv = new String[5];
		int i=0;
		try 
		{
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String linea = br.readLine();

			while(linea != null) {
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.totalRegDV = i;
	}

	public void leerArchivoProductos(String nombrearchivo)
	{
		// metodo a construir
		f = new File(nombrearchivo);
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String linea=br.readLine();
			while (linea == null)
			{
				linea = br.readLine();
				for (int i = 0; i < productos.length; i++) {
					productos[i].setCodigoProducto(Integer.parseInt(linea.split(",")[0]));
					productos[i].setNombreProducto(linea.split(",")[1]);
					productos[i].setValorProducto(Integer.parseInt(linea.split(",")[2]));
				}
			}
			
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
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

	public void consolidarVentas(double IVA) {
		
		valorIVA = IVA;
		for (int i = 0; i < productos.length; i++) {
		
			valorTotal = valorTotal +detalleVentas[i].getValorTotal();
		}
		valormasIVA = valorTotal + valorIVA;
		
	}

	public String generarReporteVentas() {
		String linea = "";
		linea = "Consolidado de Ventas del Dia\n\n";
		linea += "** Total Ventas: "+valorTotal+"\n";
		linea += "** Valor de IVA: "+valorIVA+"\n";
		linea += "** Total con IVA: "+valormasIVA; 
		
		return linea;
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
