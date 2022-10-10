package bootcamp_java_UD06;

import java.util.Random;
import java.util.Scanner;

public class Ex11 {
	public static Random rand = new Random();
	public static int[] asignarLista(int[] lista1) {
		int lista2[] = new int[lista1.length];//asignamos el mismo tamaño al segundo array 
		return lista2;
	}
	
	public static void ompleArray(int[] lista, int min, int max) {
		for(int i=0;i<lista.length;i++) {
			lista[i] = (rand.nextInt(max-min) + min);
		}
	}
	
	public static int[] multiplicarArrays(int[] lista1, int[] lista2) {
		int listaResultado[] = new int[lista1.length];
		
		for(int i=0;i<listaResultado.length;i++) {
			listaResultado[i] = lista1[i] * lista2[i];
		}
		
		return listaResultado;
	}
	
	public static void mostraArray(int[] lista) {
		for (int i=0;i<lista.length;i++) {
			System.out.print(String.format(" "+lista[i]));
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tamaño de la lista: ");
		int tamany = sc.nextInt();
		int[] lista1 = new int[tamany];
		System.out.println("Valor mínimo: ");
		int min = sc.nextInt();
		System.out.println("Valor máximo: ");
		int max = sc.nextInt();
		ompleArray(lista1, min, max);
		int[] lista2 = asignarLista(lista1);
		ompleArray(lista2, min, max);
		int[] listaResultado = multiplicarArrays(lista1,lista2);
		mostraArray(lista1);
		mostraArray(lista2);
		mostraArray(listaResultado);
		sc.close();
	}

}
