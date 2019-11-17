package main;

//import synchro.Synchro;
import computerClub.*;

public class Main {

	public synchronized static void main(String[] args) {

		//Основная лаба
		/*
		 * Object ob1 = new Object(); Object ob2 = new Object();
		 * 
		 * Synchro sync1 = new Synchro(ob1, ob2); Synchro sync2 = new Synchro(ob2, ob1);
		 * 
		 * sync1.start(); sync2.start();
		 */
		
		//Доп
		ComputerClub cc = new ComputerClub(5,2);
	}
}
