package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
	
	public void leerArchivoProductos(String nombreArchivo)
	{
f=new File(nombreArchivo);
String[]dv=new String[3];
int i =0;
		try
		{
		FileReader fr=new FileReader(nombreArchivo);
		BufferedReader br= new BufferedReader(fr);
		String linea=br.readLine();
		while(linea!=null)
		{
			dv= linea.split(",");
			productos[i]=new Productos();
			this.productos[i].getCodigoProducto();
			this.productos[i].getNombreProducto();
			this.productos[i].getValorProducto();
			linea = br.readLine();
			i++;
		}
		
		}
		catch(IOException e)
		{
e.printStackTrace();
}
	this.totalRegPR=i;
		
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
		double valor=0;
		for (int i = 0; i < this.totalRegDV; i++) {
			valorTotal=this.detalleVentas[i].getValorTotal();
			valorIVA=19;
			valormasIVA= valorIVA+valorTotal;
			i++;
		}
	}
	
	public String generarReporteVentas() {
String reporte="";
reporte="Reporte de ventas general \n\n";
for (int i=0; i<this.totalRegDV;i++)
{
	reporte += this.buscarProducto(this.detalleVentas[i].getCodigoProducto());
	reporte += this.detalleVentas[i].getCodigoDetalleVenta();
	reporte +=this.detalleVentas[i].getValorTotal();
	
}

		return reporte;
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


