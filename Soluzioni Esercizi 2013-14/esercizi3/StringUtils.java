public class StringUtils{
	public static String iniziali(String nome, String cognome){
		return nome.charAt(0) + "&" + cognome.charAt(0);
	}

	public static String stringReverse(String str){
		int len = str.length();
		char[] tmp = new char[str.length()];
		for(int i = 0; i < len; i++){
			tmp[len - i - 1] = str.charAt(i);
		}
		return String.valueOf(tmp);
	}

	public static int contaOccorrenze(String text, String pattern){
		int origin = text.length();
		int after = text.replaceAll(pattern, "").length();
		return (origin - after) / pattern.length();
	}

	public static void main(String args[]){
		System.out.println(iniziali("Paolo", "Rossi"));
		System.out.println(stringReverse("Mattia"));
		System.out.println(contaOccorrenze("Ho pescato una scarpa", "sca"));
	}
}

