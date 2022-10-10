package bootcamp_java_UD06;

import java.util.Scanner;

public class Ex3 {
	public static boolean esPrimo(int num) {
		boolean respuesta = true;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {//si es compleix aquesta condicio vol dir que no es un nombre primer
				respuesta = false;
			}
		}
		return respuesta;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Introduce el número a comprobar ");
		num = sc.nextInt();
		if(esPrimo(num)) {System.out.print(num+" es primo ");}
		else {System.out.print(num+" no es primo ");}
		sc.close();
	}

}
