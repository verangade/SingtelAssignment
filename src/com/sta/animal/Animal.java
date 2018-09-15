package com.sta.animal;

import com.sta.animal.behaviour.FlyBehaviour;
import com.sta.animal.behaviour.SingBehaviour;

public abstract class Animal {

	public void performWalk() {
		System.out.println("I am walking");
	}

	public abstract void performFly();
	public abstract void performSing();
}
