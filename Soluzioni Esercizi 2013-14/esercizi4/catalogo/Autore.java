import java.util.Scanner;

public class Autore{
	private String nome;
	private String cognome;

	/** Costruttore
	 * @param
	 */
	public Autore(){
		Scanner s = new Scanner(System.in);
		System.out.printf("Nome autore: ");
		this.nome = s.nextLine();
		System.out.printf("Cognome autore: ");
		this.cognome = s.nextLine();
	}

	public String toString(){
		return nome + " " + cognome + "\n";
	}
}
