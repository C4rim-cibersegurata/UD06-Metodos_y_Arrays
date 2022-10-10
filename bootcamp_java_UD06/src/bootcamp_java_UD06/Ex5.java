package bootcamp_java_UD06;

import java.util.Scanner;

public class Ex5 {
	public static String decToBinary(int num) {
		String binari = "";

		while (num > 0) {
			if (num % 2 == 0 || num % 2 == 1) {
				binari = (String.valueOf(num % 2)) + binari;
				num = num / 2;
			}

		}
		return binari;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número que quieres pasar a binario: ");
		int num = sc.nextInt();
		System.out.print(decToBinary(num));
		sc.close();
	}

}
