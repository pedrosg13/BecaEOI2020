package Ejercicios;

import java.util.Scanner;

public class Calculadora {
	
	String suma;
	String resta;
	String mult;
	String div;

	public static void main(String[] args) {
		
		System.out.println("introduce la variable 1: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		System.out.println("introduce la variable 2: ");
		scan = new Scanner(System.in);
		int b = scan.nextInt();

		System.out.println("introduce operacion: ");
		scan = new Scanner(System.in);
		int operacion = scan.nextInt();

		switch (operacion) {
		case suma:
			System.out.println("el resultado es " + (a+b));
			break;
		case :
			System.out.println("el resultado es " + (a-b));
			break;
		case "mult":
			System.out.println("el resultado es " + (a*b));
			break;
		case "div"
		:
			System.out.println("el resultado es " + (a/b));
			break;
		default:
			System.out.println("Operacion no permitida");
			break;
		}
		
		main(null);

	}

}
