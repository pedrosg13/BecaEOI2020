package GitTest;

public class Prueba {
	
	private int numero;
	
	public int getNumero() {
		return numero;
		
	}
	
	public static void setNumero(int numero) {
		Prueba.numero = numero;
		
	}
	
	public static void doSomething(String param) {
		
		System.out.println(" parametro :" + param);
	}

}
