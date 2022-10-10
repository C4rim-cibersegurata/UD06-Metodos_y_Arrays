package bootcamp_java_UD06;

import java.util.Random;
import java.util.Scanner;

public class Ex12 {
	public static Random rand = new Random();

	public static int[] crearLista(int tamany, int digito) {
		int[] lista = new int[tamany];
		int tamanyFinal = 0;
		for (int i = 0; i < lista.length; i++) {
			lista[i] = (rand.nextInt(300 - 1) + 1);
			if ((lista[i] % 10 == digito)) {
				tamanyFinal++;
			}
		}
		int[] listaFinal = new int[tamanyFinal];
		for (int i = 0, j = 0; i < lista.length; i++) {
			if ((lista[i] % 10 == digito)) {
				listaFinal[j] = lista[i];
			}
		}
		return listaFinal;
	}

	
	public static void mostraArray(int[] lista, int digito) {
		if (lista.length == 0) {
			System.out.println("No hay ningún dígito que acabe en "+digito);
		}
		for (int i = 0; i < lista.length; i++) {
			System.out.print(String.format(" " + lista[i]));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digito;
		System.out.println("Tamaño de la lista: ");
		int tamany = sc.nextInt();
		do {
			System.out.println("Dígito para comprobar: ");
			digito = sc.nextInt();
		}while (digito<0||digito>9);
		mostraArray(crearLista(tamany,digito),digito);
		sc.close();
	}

}
