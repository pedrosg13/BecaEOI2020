package Aleatorio;

public class Animal {

	private String raza;
	private double size;
	private double peso;
	private String color;
	private String sip;
	private int edad;
	private boolean cojo;
	
	public void calculaCuantoCome(String tipoComida) {
		
		tipoComida="carne";
		System.out.println("El animal come "+ tipoComida);
	}

	public Animal(String raza, double size, double peso, String color, String sip, int edad) {
		super();
		this.raza = raza;
		this.size = size;
		this.peso = peso;
		this.color = color;
		this.sip = sip;
		this.edad = edad;
	
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSip() {
		return sip;
	}

	public void setSip(String sip) {
		this.sip = sip;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCojo() {
		return cojo;
	}

	public void setCojo(boolean cojo) {
		this.cojo = cojo;
	}
	
	

}
