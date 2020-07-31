package edu.es.eoi;

import edu.es.eoi.domain.Robot;

public class Main {

	public static void main(String[] args) {

		Robot robot = new Robot();
		System.out.println(robot);
		robot.on();
		
		Test.doSomething(); 

	}

}
