package bootcamp_java_UD06;
import java.util.Scanner;
public class Ex1 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("De que figura quieres calcular el área:\n1. Triangulo\n2. Cuadrado\n3. Circulo");
		String seleccion=sc.nextLine();
		if (seleccion.equalsIgnoreCase("Triangulo") ||seleccion.equals("1") ) {System.out.println(areaTriangulo());}
		else if (seleccion.equalsIgnoreCase("Cuadrado") ||seleccion.equals("2") ) {System.out.println(areaCuadrado());}
		else if (seleccion.equalsIgnoreCase("Circulo") ||seleccion.equals("3") ) {System.out.println(areaCirculo());}
		else {System.out.println("Introduce una de las opciones");};
	}
	public static double areaTriangulo() {//metodo para calcular el área de un triangulo
		Double base,alt;
		System.out.println("Introduce la base del triangulo");
		base=sc.nextDouble();
		System.out.println("Introduce la altura del triangulo");
		alt=sc.nextDouble();
		System.out.print("Área triangulo = "+base+"x"+alt+"/2 = ");
		return ((base*alt)/2);
	}
	public static double areaCuadrado() {//metodo para calcular el área de un cuadrado
		Double c;
		System.out.println("Introduce el lado del cuadrado");
		c=sc.nextDouble();
		System.out.print("Área cuadrado = "+c+"^2 = ");
		return (c*c);
	}
	public static double areaCirculo() {//metodo para calcular el área de un circulo
		Double r;
		System.out.println("Introduce el radio");
		r=sc.nextDouble();
		System.out.print("Área circulo = PIx"+r+"^2 = ");
		return (Math.PI*(r*r));
	}
}
