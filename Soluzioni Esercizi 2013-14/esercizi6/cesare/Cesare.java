package cesare;
public class Cesare{

	public static String convertiCesare(String s, int key){
		char[] strval = s.toCharArray();
		int ch;
		char[] maiuscole = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		char[] minuscole = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
			for(int i = 0; i < strval.length; i++){
			ch = strval[i];
			if(ch >= 'A' && ch <= 'Z'){
				ch = ((ch - 'A' + key) % 26 + 26) % 26;
				strval[i] = maiuscole[ch];
			}
			else if(ch >= 'a' && ch <= 'z'){
				ch = ((ch - 'a' + key) % 26 + 26) % 26;
				strval[i] = minuscole[ch];
			}
		}
		return new String(strval);
	}
}
