package Aleatorio;

public class TipoDatos {

	String nombre;
	String apellido;
	String fechaDeNacimiento;
	int mesNacimiento;
	int year;
	String ciudad;
	int edad;
	boolean estudios;
	boolean trabajas;
	char sexo;

	public void run() {
		System.out.println(mesNacimiento + nombre);

		if (edad < 18) {
			System.out.println("eres menor de edad");
		} else if (edad == 18) {
			System.out.println("eres mayor de edad");
		} else {

		}

		switch (edad) {
		case 18:
			System.out.println("eres menor de edad");
			break;
		case 16:
			System.out.println("eres menor");
			break;
		default:
			System.out.println("no estas en el limite");
			break;

		}

//		while (estudias) {
//			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
//		}
//		
//		
//		do {
//			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX");
//		} while (estudias);

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			for (int j = 0; j < 5; j++) {
				System.out.println(j);

			}
		}

	}

}
