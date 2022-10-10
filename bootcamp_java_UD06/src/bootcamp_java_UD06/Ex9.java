package bootcamp_java_UD06;

import java.util.Random;
import java.util.Scanner;

public class Ex9 {
	public static Random rand = new Random();

	public static int[] crearLista(int tamany, int max, int min) {
		int[] lista = new int[tamany];
		for (int i = 0; i < lista.length; i++) {
			lista[i] = (rand.nextInt(max - min) + min);
		}
		return lista;
	}

	public static void mostrarArray(int[] array) {
		int suma = 0;
		System.out.println("Lista de números: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			suma += array[i];
		}
		System.out.println("\nLa suma total es " + suma);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tamaño de la lista: ");
		int tamany = sc.nextInt();
		System.out.println("Valor mínimo: ");
		int min = sc.nextInt();
		System.out.println("Valor máximo: ");
		int max = sc.nextInt();
		mostrarArray(crearLista(tamany, max, min));
		sc.close();
	}

}
