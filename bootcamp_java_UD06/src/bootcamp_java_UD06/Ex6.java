package bootcamp_java_UD06;

import java.util.Scanner;

public class Ex6 {
	public static int contar(int num) {
		int numContado = 0;
		while (num >= 1) {
			num = num / 10;
			numContado++;

		}
		return numContado;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número que quieres contar: ");
		int num = sc.nextInt();
		System.out.print("El número " + num + " tiene " + contar(num) + " cifras");
		sc.close();

	}

}
