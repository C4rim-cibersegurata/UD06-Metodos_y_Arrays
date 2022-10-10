package bootcamp_java_UD06;

import java.util.Scanner;
import java.util.Random;

public class Ex2 {
	public static int calcNumsRand(int max, int min) {
		Random rand = new Random();
		return ((rand.nextInt((max - min) + 1) + min));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max, min, cant;
		System.out.println("Cuantos números quieres imprimir?");
		cant = sc.nextInt();
		System.out.print(" Numero minimo: ");
		min = sc.nextInt();
		System.out.print(" Numero maximo: ");
		max = sc.nextInt();

		for (int i = 0; i < cant; i++) {
			System.out.println(calcNumsRand(max, min));
		}

		sc.close();
	}

}
