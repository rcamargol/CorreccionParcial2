package modelo;

public class DetalleVentas {
	private int codigoDetalleVenta;
	private int codigoProducto;
	private int cantidad;
	private double valorUnitario;
	private double valorTotal;
	

	public void setCodigoDetalleVenta(int parseInt) {
		codigoDetalleVenta= parseInt;
		
	}
	public void setCodigoProducto(int parseInt) {
		codigoProducto=parseInt;
		
	}
	public void setCantidad(int parseInt) {
		cantidad=parseInt;
		
	}
	public void setValorUnitario(double parseDouble) {
		valorUnitario=parseDouble;
		
	}
	public void setValorTotal(double parseDouble) {
		valorTotal=parseDouble;
		
	}
	public int getCodigoProducto() {
		// TODO Auto-generated method stub
		return codigoProducto;
	}
	public double getValorUnitario() {
		// TODO Auto-generated method stub
		return valorUnitario;
	}
	public int getCantidad() {
		// TODO Auto-generated method stub
		return cantidad;
		
		
	}
	public double getValorTotal() {
		// TODO Auto-generated method stub
		return valorTotal;
	}
	
}
