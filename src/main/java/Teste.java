import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		String[] lista = new String[10];

		for (int i = 0; i < lista.length; i++) {
			lista[i] = "nome";
		}

		for (String string : lista) {
			System.out.println(string);
		}

		ArrayList<String> lista2 = new ArrayList<String>();

		for (int i = 0; i < 20; i++) {
			lista2.add(i, "ana");
			if (i == 10){
				lista2.add(10, "metade");
				
			}
		}
		for (String string : lista2) {
			System.out.println(string);
		}

	}

}
