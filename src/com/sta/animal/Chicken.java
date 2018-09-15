package com.sta.animal;

import com.sta.animal.behaviour.impl.Cluck;
import com.sta.animal.behaviour.impl.NoFly;

public class Chicken extends Bird{
	
	
	public Chicken() {
		setFlyBehaviour(new NoFly());
		setSingBehaviour(new Cluck());
	}
	
	public String sing() {
		return "Cluck Cluck";
	}
	
	public void fly() {
		System.out.println("I canot fly");
	}
}
