import java.lang.Math;

public class Serbatoio{
	private int livello;
	public static final int MAX_LIV = 100;

	public Serbatoio(){
		this(100);
	}

	public Serbatoio(int liv){
		this.livello = liv;
	}

	public void rifornimento(int qnt){
		this.livello = Math.min(this.livello + qnt, MAX_LIV);
	}
		
	public void consumo(int qnt){
		this.livello = Math.max(this.livello - qnt, 0);
	}

	public int getLivello(){
		return this.livello;
	}

	public static void main(String args[]){
		Serbatoio s1 = new Serbatoio(20);
		System.out.println(s1.getLivello());
		System.out.println("Consuma 50 litri");
		s1.consumo(50);
		System.out.println(s1.getLivello());
		System.out.println("Rifornisce 70 litri");
		s1.rifornimento(70);
    	System.out.println(s1.getLivello());
		System.out.println("Consuma 120 litri");
		s1.consumo(120);
        System.out.println(s1.getLivello());
	}
}
