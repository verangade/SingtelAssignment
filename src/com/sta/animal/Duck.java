package com.sta.animal;

import com.sta.animal.behaviour.impl.Fly;
import com.sta.animal.behaviour.impl.Quak;

public class Duck extends Bird{
	public Duck() {
		setFlyBehaviour(new Fly());
		setSingBehaviour(new Quak());
	}
	
	public void swim() {
		System.out.println("I can Swim");
	}
}
