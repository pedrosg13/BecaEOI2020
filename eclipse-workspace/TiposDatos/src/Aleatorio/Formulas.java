package Aleatorio;

public class Formulas {

	public static void main(String[] args) {

		//definir variables
		double a = 4;
		double b = 2;
		double c = 1;
		double d = 1;
		
		
		//imprimir resolución 
		
		double resultado=(a/b)+(c/d);
		
		System.out.println("el resultadp es: "+ calcular (a, b ,c, d));

	}
	
	public static double calcular(double a,double b,double c,double d) {
		
		return (a/b)+(c/d);
	
	}
		
}
