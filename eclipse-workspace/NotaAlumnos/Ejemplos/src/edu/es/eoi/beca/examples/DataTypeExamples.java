package edu.es.eoi.beca.examples;

public class DataTypeExamples {

	final static String SEPARADOR="**********************************************************************************************";
	
	static double variableNueva=55;
	
	public static void main(String[] args) {
				
		
		//tipos de datos
		
		boolean result = true;
		char letraC = 'C';
		byte b = 100;
		short s = 10000;
		int i = 100000; 
		double f = 10.65;
		float g= (float) 10.65;
		
		System.out.println(f);
		System.out.println(g);
		
		System.out.println(SEPARADOR);
		
		String nombre1="Pepe";
		String nombre2="pepe";
		
			
		System.out.println(nombre1+nombre2);
		
		//operadores Relacionales y condicionales
		
		System.out.println( result==false);
		System.out.println(f>=10);
		System.out.println(f!=10.65);
		
		System.out.println(true&&result);
		System.out.println(true||result); //dead code		
		
		System.out.println(SEPARADOR);
		
		String str= new String("test");
		String str2="hola";
		
		String str3=str+str2;
		str3=str.concat(str2).concat("test");
		
		System.out.println(str3);
		//Paso por referencia
				  
		//utilizar el debug
		
		int x=56;   
		int y=5;
		
		int z=opera1(x,y);
		
		System.out.println("x=" + x + ",y="+y+",z="+z);
		
		z=opera2(x,y);
		
		System.out.println("x=" + x + ",y="+y+",z="+z);
		
		
		System.out.println(SEPARADOR);
		
		Client cliente1= new Client("44556677L", "NAME 1", "SURNAME_1", "10-02-1975");
		Client cliente2= new Client("55667788L", "NAME 2", "SURNAME_2", "17-06-1974");	
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		System.out.println(SEPARADOR);
		
		cambiaNombre(cliente1);
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		System.out.println(SEPARADOR);
		
		cliente2=cliente1;
		
		System.out.println(cliente1);   //mirar id en vista de variables y comprobar que es el mismo
		System.out.println(cliente2);
		
		System.out.println(SEPARADOR);
		
		 cliente1= new Client("44556677L", "NAME 1", "SURNAME_1", "10-02-1975");
		 cliente2= new Client("55667788L", "NAME 2", "SURNAME_2", "17-06-1974");	
		
		 opera3(cliente1.getName());
		 
		 System.out.println(cliente1);
		 
		 opera4(cliente1);
		 
		 System.out.println(cliente1);
		 
		 String cadena="hola mundo";
		 cadena.substring(0,6);
		 
		 
		 //Strings
		 
		 String cadena1="hola";
		 
		 String cadena2="hola";
		  
		 
		 boolean sonIguales=cadena1==cadena2;
		 
		 sonIguales=cadena1.equals(cadena2);
		 
		 System.out.println("son iguales "+sonIguales);
		 
		 
		//ARRAYS
		
		int[] arrayEnteros= new int[10];
		arrayEnteros[0]=0;
		arrayEnteros[1]=1;
		arrayEnteros[2]=2;
		arrayEnteros[3]=3;
		arrayEnteros[4]=4;
		arrayEnteros[5]=5;
		arrayEnteros[6]=6;
		arrayEnteros[7]=7;
		arrayEnteros[8]=8;
		arrayEnteros[9]=9;
		//arrayEnteros[10]=10;
				
		System.out.println(arrayEnteros.length);
		
		for (int j = 0; j < arrayEnteros.length; j++) {			
			System.out.println(arrayEnteros[j]);
		}
		
		System.out.println(SEPARADOR);
		
		Client[] clientes= new Client[3];
		
		clientes[0]= cliente1;
		clientes[1]= cliente1;
		clientes[2]= cliente2;
		
		for (int j = 0; j < clientes.length; j++) {
			System.out.println(clientes[j].getName());
		}
		
		
		
		//autoboxing
		
		int entero1=12;
		
		Integer entero2= new Integer(12);
		
		String cadena4="123";
		
		int cadena5=Integer.parseInt(cadena4);
		
		
		Integer entero3= 5;
		
		
		
	}
	
	
	public static void cambiaNombre(Client cliente1){
		
		cliente1.setName("HE_CAMBIADO_TU_NOMBRE");
		
	}
	
	public  static int opera1(int x,int y){
		
		return x+y;
		
	}
	
	public static int opera2(int x,int y){
		
		x=3;
		
		return x+y;
		
	}
	
	public static void  opera3(String string){
		
		string=string.concat("TEST");
		System.out.println("string=" + string);
		
	}
	
	public static void  opera4(Client client){
		
		client.setName("TEST");	
		
	}
	
	

}
