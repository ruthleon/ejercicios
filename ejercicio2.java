
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Descuento des1=new Descuento (0.1,100);
		des1.setTotalCompra(150);
		double total=des1.getTotal();
		System.out.println("TotalCompra:"+total);
		System.out.println("TotalCompra:"+des1.getTotal());
		
	}

}
