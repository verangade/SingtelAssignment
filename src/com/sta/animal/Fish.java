package com.sta.animal;

import com.sta.animal.behaviour.FlyBehaviour;
import com.sta.animal.behaviour.SingBehaviour;
import com.sta.animal.behaviour.SwimBehaviour;
import com.sta.animal.behaviour.WalkBehaviour;
import com.sta.animal.behaviour.impl.NoFly;
import com.sta.animal.behaviour.impl.NoSound;
import com.sta.animal.behaviour.impl.NoWalk;
import com.sta.animal.behaviour.impl.Swim;


public class Fish extends Animal{
	
	FlyBehaviour flyBehaviour;
	SingBehaviour singBehaviour;
	WalkBehaviour walkBehaviour;
	SwimBehaviour swimBehaviour;
	
	public Fish() {
		flyBehaviour = new NoFly();
		singBehaviour=new NoSound();
		walkBehaviour=new NoWalk();
		swimBehaviour = new Swim();
	}


	@Override
	public void performWalk() {
		walkBehaviour.walk();
		
	}

	@Override
	public void performFly() {
		flyBehaviour.fly();
		
	}

	@Override
	public void performSing() {
		singBehaviour.sing();
		
	}

	public void performSwim() {
		swimBehaviour.swim();
		
	}

		
}
