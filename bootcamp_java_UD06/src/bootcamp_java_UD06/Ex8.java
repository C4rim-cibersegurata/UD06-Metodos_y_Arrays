package bootcamp_java_UD06;

import java.util.Scanner;

public class Ex8 {
	public static Scanner sc = new Scanner(System.in);

	public static void ompleArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Introduce un número para la lista");
			lista[i] = sc.nextInt();
		}

	}

	public static void mostraArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}

	}

	public static void main(String[] args) {
		int[] lista = new int[10];
		ompleArray(lista);
		mostraArray(lista);
	}

}
