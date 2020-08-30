package main;

import domain.Box;
import domain.BoxFactory;

public class Application {

	public static void main(String[] args){
		Box box1 = BoxFactory.getBoxFactory().getBox();
		
		System.out.println(box1.toString());

	}

}
