
public class Descuento {
	
	private double descuento;
	public double totalCompra;

	public Descuento(double descuentoParam,double totalCompraParam){
		this.descuento=descuentoParam;
		this.totalCompra=totalCompraParam;
	}
	public double getTotal(){
		return totalCompra-totalCompra*descuento;
		//return totalCompra-totalCompra*descuento;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public double getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}
}
