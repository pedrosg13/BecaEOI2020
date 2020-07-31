package Aleatorio;

public class TablasDeMultiplicar {

	public static void main(String[] args) {
		
		//itero i de 0 a 10
		for (int i = 1; i < 20; i++) {
			
			//itero la cabecera
			System.out.println("TABLA DEL " +i);
			
			//itero j de 0 a 10
			for (int j = 1; j <= 20; j++) {
				
				System.out.println(i+"X"+j+"="+(i*j));
				
			}
			
		}

	}

}
