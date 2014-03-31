import java.util.Scanner;

public class Dizionario extends Libro {
	private boolean dual;	//True se il dizionario è bidirezionale
	private String lingua1;
	private String lingua2;

	/** Costruttore
	 * @param
	 */
	public Dizionario(){
		super();
		Scanner scan = new Scanner(System.in);
		System.out.print("Il dizionario è bidirezionale? (S/n): ");
		String str = scan.nextLine();
		if(str.toLowerCase().equals("s") || str.toLowerCase().equals("si") || str.toLowerCase().equals("sì")){
			this.dual = true;
		}
		else{
			this.dual = false;
		}
		System.out.print("Prima lingua: ");
		lingua1 = scan.nextLine();
		System.out.print("Seconda lingua: ");
		lingua2 = scan.nextLine();
	}

	/** Override toString()
	 * @param
	 */
	public String toString(){
		String str = super.toString();
		str = str + lingua1 + " -> " + lingua2 + "\n";
		if(dual == true){
			str = str + lingua2 + " -> " + lingua1 + "\n";
		}
		return str;
	}

	/** Override getInfo()
	 * @param
	 */
	public String getInfo(){
		return "Tipologia: Dizionario\nLocazione: " + this.getLocazione() + "\n" + toString();
	}
}
