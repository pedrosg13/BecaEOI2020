package edu.es.eoi.domain;

public class Robot {
	
	//	definir características de mi robot
	String colour;
	double height;
	double weight;
	String serialNumber;
	String form;
	String material;
	int wheels;
	String name;
	
	// 	como se comporta
	public void on() {
		System.out.println("me enciendo");
	};
	public void off() {
		System.out.println("me apago");
	};
	void doTask() {
		System.out.println("hago la tarea");
	};
	void fail() {
		System.out.println("he petado");
	};
	void speedUp() {
		System.out.println("voy más rapido");
	};
	void speedDown() {
		System.out.println("velocidad caracol");
	};
	
}