/*Scrivere un programma che, preso in input un file di testo
 *  input.txt, cifri il testo col cifrario di Cesare e scriva il
 *  risultato appendendolo al file input.txt. Scrivere anche un
 *   programma per decifrare un file cifrato col cifrario di Cesare
 */
package cesare;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class CesareAppend{

	public static void main(String[] args) throws IOException{
		File in = new File("input.txt");
		String str;
		int chiave;
		if(in.exists()){
			Scanner s = new Scanner(in);
			PrintWriter out = new PrintWriter("tmp.txt");
			System.out.print("Inserisci chiave di cifratura (numero intero): ");
			chiave = new Scanner(System.in).nextInt();
			while(s.hasNextLine()){
				str = s.nextLine();
				str = Cesare.convertiCesare(str, chiave);
				out.println(str);
			}
			s.close();
			out.close();
			in = new File("tmp.txt");
			out = new PrintWriter(new FileWriter("input.txt", true));
			s = new Scanner(in);
			while(s.hasNextLine()){
				out.println(s.nextLine());
			}
			s.close();
			out.close();
			in.delete();
		}
		else{
			System.out.println("Il file input.txt non esiste!");
		}
	}
}
