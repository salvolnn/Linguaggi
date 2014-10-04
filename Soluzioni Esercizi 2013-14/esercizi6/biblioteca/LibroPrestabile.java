public class LibroPrestabile extends Libro implements Prestabile{
	private boolean prestato;

	/** Costruttore
	 * @param
	 */
	public LibroPrestabile(){
		super();
		prestato = false;
	}

	/*Implementa presta() dell'interfaccia Prestabile*/
	public void presta(){
		if(!prestato){
			prestato = true;
			System.out.println("Libro prestato con successo!");
		}
		else{
			System.out.println("Il libro è già in prestito!");
		}
	}

	public void restituisci(){
		if(prestato){
			prestato = false;
			System.out.println("Libro restituito con successo!");
		}
		else{
			System.out.println("Il libro non era in prestito!");
		}
	}

	/** Override del metodo getInfo() */
	public String getInfo(){
		String str = super.getInfo();
		str = str + "Disponibile: " + (prestato ? "no" : "sì") + "\n";
		return(str);
	}
}
