package Geometria.FigurePiane;

public class Cerchio{
	public static final double pi = 3.1416;
	private double raggio;

	public Cerchio(){
		this(1.0);
	}

	public Cerchio(double r){
		this.raggio = r;
	}

	public double calcolaArea(){
		return raggio * raggio * Cerchio.pi;
	}

	public static void main(String args[]){
		Cerchio c = new Cerchio(3);
		System.out.println(c.calcolaArea());
	}
}
