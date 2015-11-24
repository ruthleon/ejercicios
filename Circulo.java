

public class Circulo {
	
	private double radio;
	
	public Circulo(){
		this.radio=1;
		
	}
	
	public Circulo(double radioParam){
		this.radio=radioParam;
	
	}

	public void setRadio(double radioParam){
		
		this.radio=radioParam;
	}
	public double getRadio(){
	return this.radio;	
	
	}
	public double getArea(){
		return Math.PI*radio*radio;
	}		
		
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
