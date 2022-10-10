package bootcamp_java_UD06;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
	public static Random rand = new Random();

	public static boolean esPrimo(int num) {
		boolean respuesta = true;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {// si es compleix aquesta condicio vol dir que no es un nombre primer
				respuesta = false;
			}
		}
		return respuesta;
	}

	public static int[] crearLista(int tamany, int max, int min) {
		int[] lista = new int[tamany];
		int primo;
		for (int i = 0; i < lista.length; i++) {
			primo = (rand.nextInt(max - min) + min);
			if (esPrimo(primo)) {
				lista[i] = (primo);
			} else {
				i--;
			}
		}
		return lista;
	}

	public static void mostrarArray(int[] array) {
		System.out.println("Lista de números: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	private static void primoMaximo(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		System.out.println("\nEl mayor número primo del array es " + max);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tamaño de la lista: ");
		int tamany = sc.nextInt();
		System.out.println("Valor mínimo: ");
		int min = sc.nextInt();
		System.out.println("Valor máximo: ");
		int max = sc.nextInt();
		int[] lista = crearLista(tamany, max, min);
		mostrarArray(lista);
		primoMaximo(lista);
		sc.close();

	}

}
