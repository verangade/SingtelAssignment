package com.sta.animal;

import com.sta.animal.behaviour.SwimBehaviour;
import com.sta.animal.behaviour.impl.Swim;


public class Dolphin {
	private SwimBehaviour swimBehaviour;
	
	public Dolphin() {
		swimBehaviour = new Swim();
	}
	
	public void performSwim() {
		swimBehaviour.swim();
	}
}
