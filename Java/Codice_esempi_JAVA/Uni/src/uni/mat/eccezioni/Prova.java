package uni.mat.eccezioni;

public class Prova {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("xxxxxxxx \t \uABC8 � xxxxx");
		// Persona p=new Persona("Mario","Milano");
		// System.out.println("Questa "+"� "+"una "+"stringa "+p);

		String s1 = "43n";

		Integer dd;
		try {
			dd = Integer.valueOf(s1);
			System.out.println(dd);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Non � un numero");
		}

	}

}