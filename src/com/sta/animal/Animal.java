package com.sta.animal;

public abstract class Animal {

	public void performWalk() {
		System.out.println("I am walking");
	}

	public abstract void performFly();
	public abstract void performSing();
}
