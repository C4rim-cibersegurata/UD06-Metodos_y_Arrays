package bootcamp_java_UD06;

import java.util.Scanner;

public class Ex4 {
	public static void factorial(int num) {
		int factorialNum = 1;
		for (int i = 2; i <= num; ++i) {
			factorialNum = factorialNum * i;
		}
		System.out.print("El factorial de " + num + " es " + factorialNum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número para calcular el factorial: ");
		int num = sc.nextInt();
		factorial(num);
		sc.close();
	}

}
