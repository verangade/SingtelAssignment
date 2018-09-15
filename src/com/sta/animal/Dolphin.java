package com.sta.animal;

import com.sta.animal.behaviour.SwimBehaviour;
import com.sta.animal.behaviour.impl.Swim;


public class Dolphin extends Animal{
	private SwimBehaviour swimBehaviour;
	
	public Dolphin() {
		swimBehaviour = new Swim();
	}
	
	public void performSwim() {
		swimBehaviour.swim();
	}

	@Override
	public void performFly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void performSing() {
		// TODO Auto-generated method stub
		
	}
}
