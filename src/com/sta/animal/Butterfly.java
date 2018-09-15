package com.sta.animal;

import com.sta.animal.behaviour.FlyBehaviour;
import com.sta.animal.behaviour.SingBehaviour;
import com.sta.animal.behaviour.impl.Fly;
import com.sta.animal.behaviour.impl.NoSound;

public class Butterfly extends Bird{
	
	public Butterfly() {
		flyBehaviour = new Fly();
		singBehaviour = new NoSound();
		
	}
	private FlyBehaviour flyBehaviour;
	private SingBehaviour singBehaviour;
	
	public void performSing() {
		singBehaviour.sing();
	}
	
	public void performFly() {
		flyBehaviour.fly();
	}

}
