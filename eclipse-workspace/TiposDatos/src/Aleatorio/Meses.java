package Aleatorio;

public class Meses {
	
	static String[] meses;

	public static void main(String[] args) {
		
		meses= new String[12];
		
		meses[0]="Enero";
		meses[1]="Febrero";
		meses[2]="Marzo";
		meses[3]="Abreil";
		meses[4]="Mayo";
		meses[5]="Junio";
		meses[6]="Julio";
		meses[7]="Agosto";
		meses[8]="Septiembre";
		meses[9]="Octubre";
		meses[10]="Nobiembre";
		meses[11]="Diciembre";
		
		
		for (int i = 0; i < meses.length; i++)  {
			System.out.println("Mes: "+ meses[i]+", tiene "+getNumeroDias(i));
		}
		
	}
	
	public static int getNumeroDias(int mes) {
		
		if (mes ==0 || mes == 2|| mes == 4|| mes == 6 || mes == 7 || mes == 9 || mes == 12) {
			return 31;
		} else if (mes == 1) {
			return 28;
		} else {
			return 30;
		}
			
	}

}
