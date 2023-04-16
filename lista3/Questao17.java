package lista3;

public class Questao17 {

	public static void main(String[] args) {
		String palavra = "fishcer";
		String invertido= inverterpalavra(palavra);
		System.out.println(invertido);
	}
	public static String inverterpalavra(String palavra) {
	    String invertido = "";
	    for (int i = palavra.length()-1; i >= 0; i--) {
	        invertido = invertido+palavra.charAt(i);
	    }
	    return invertido;
	}

}
