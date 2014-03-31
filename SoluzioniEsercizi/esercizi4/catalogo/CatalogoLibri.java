import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CatalogoLibri{
	private ArrayList<Libro> catalogo;

	/** Costruttore
	 * @param
	 * Crea un nuovo catalogo libri e apre il menu
	 */
	public CatalogoLibri(){
		this.catalogo = new ArrayList<Libro>();
		menu();
	}

	/* Stampa del catalogo */
	public void stampaCatalogo(){
		System.out.println("Catalogo:");
		stampaVettore(catalogo.toArray(new Libro[catalogo.size()]));
	}

	public void inserisciLibro(){
		catalogo.add(new Libro());
	}

	public ArrayList<Libro> cercaTitolo(String key){
		ArrayList<Libro> res = new ArrayList<Libro>();
		for(int i = 0; i < catalogo.size(); i++){
			if(catalogo.get(i).getTitolo().toLowerCase().contains(key.toLowerCase())){
				res.add(catalogo.get(i));
			}
		}
		return res;
	}

	public ArrayList<Libro> cercaAutore(String key){
		ArrayList<Libro> res = new ArrayList<Libro>();
		for(int i = 0; i < catalogo.size(); i++){
			if(catalogo.get(i).getAutore().toLowerCase().contains(key.toLowerCase())){
				res.add(catalogo.get(i));
			}
		}
		return res;
	}

	public void menu(){
		int scelta;
		String key;
		ArrayList<Libro> found;
		Scanner s_string = new Scanner(System.in);
		Scanner s_int = new Scanner(System.in);
		System.out.println("Menu Catalogo Libri");
		System.out.println("1) Stampa catalogo");
		System.out.println("2) Inserisci libro");
		System.out.println("3) Cerca per titolo");
		System.out.println("4) Cerca per autore");
		System.out.println("0) Esci");
		scelta = s_int.nextInt();
		switch(scelta){
			case 0:
				System.exit(0);
				break;
			case 1:
				stampaCatalogo();
				break;
			case 2:
				inserisciLibro();
				break;
			case 3:
				System.out.print("Titolo da cercare: ");
				key = s_string.nextLine();
				found = cercaTitolo(key);
				stampaVettore(found.toArray(new Libro[found.size()]));
				break;
			case 4:
				System.out.print("Autore da cercare: ");
				key = s_string.nextLine();
				found = cercaAutore(key);
				stampaVettore(found.toArray(new Libro[found.size()]));
				break;
			default:
				System.out.println("Scelta non valida!");
		}
	}

	/* Stampa di un vettore */
	private void stampaVettore(Libro[] l){
		for(Libro a : l){
			System.out.println(a.toString());
		}
	}

	public static void main(String args[]){
		CatalogoLibri c = new CatalogoLibri();
		while(true){
			c.menu();
		}
	}
}
