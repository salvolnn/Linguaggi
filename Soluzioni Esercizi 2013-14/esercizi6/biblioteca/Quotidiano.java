import java.util.Scanner;

public class Quotidiano extends Documento{
	private String testata;
	private String giornoSett;
	private int giorno;
	private String mese;
	private int anno;

	/** Costruttore
	 * @param
	 */
	public Quotidiano(){
		Scanner scan_str = new Scanner(System.in);
		Scanner scan_int = new Scanner(System.in);
		System.out.print("Testata: ");
		this.testata = scan_str.nextLine();
		System.out.println("Inserisci data:");
		System.out.print("Giorno (0-31): ");
		this.giorno = scan_int.nextInt();
		System.out.print("Mese (Gennaio-Dicembre): ");
		this.mese = scan_str.nextLine();
		System.out.print("Anno (yyyy): ");
		this.anno = scan_int.nextInt();
		System.out.print("Giorno della settimana: ");
		this.giornoSett = scan_str.nextLine();
		System.out.print("Locazione: ");
		setLocazione(scan_str.nextLine());
	}

	public String toString(){
		return testata + " di " + giornoSett + " " + giorno + " " + mese + " " + anno;
	}

	public String getInfo(){
		return "Tipologia: Quotidiano\nLocazione: " + getLocazione() + "\n" + toString();
	}
}
