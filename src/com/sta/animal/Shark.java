package com.sta.animal;

public class Shark extends Fish{
	public Shark(){
		setBody("large");
		setColor("Grey");
	}


	public void eat() {
		System.out.println("I eat other fish");
		
	}
}
