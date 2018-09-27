package modelo;

public class Productos {
	private int codigoProducto;
	private String nombreProducto;
	private double valorProducto;
	public int getCodigoProducto() {
		// TODO Auto-generated method stub
		return codigoProducto;
	}
	public String getNombreProducto() {
		// TODO Auto-generated method stub
		return nombreProducto;
	}
	public double getValorProducto() 
	{
		return valorProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public void setValorProducto(double valorProducto) {
		this.valorProducto = valorProducto;
	} 
}
