package bootcamp_java_UD06;

import java.util.Scanner;

public class Ex7 {
	public static void currency(int num,String moneda) {
		if (moneda.equalsIgnoreCase("Libra esterlina") || moneda.equals("1")) {System.out.print("El cambio sale a "+(num*0.86)+"£");}
		else if (moneda.equalsIgnoreCase("Dolar americano") || moneda.equals("2")) {System.out.print("El cambio sale a "+(num*1.28611)+"$");}
		else if (moneda.equalsIgnoreCase("Yen") || moneda.equals("3")) {System.out.print("El cambio sale a "+(num*129.852)+"¥");}
		else {System.out.print("No has escogido una de las opciones correctas '"+moneda+"' no se reconoce como moneda");}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escoge la moneda de cambio\n1. Libra esterlina\n2. Dolar americano\n3. Yen");
		String moneda = sc.nextLine();
		System.out.print("Introduce la cantidad de euros que quieres cambiar: ");
		int num = sc.nextInt();
		//sc.nextLine();
		currency(num,moneda);
		sc.close();
	}

}
