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
	
	//Attributes
	private String body;
	private String color;
	
	private FlyBehaviour flyBehaviour;
	private SingBehaviour singBehaviour;
	private WalkBehaviour walkBehaviour;
	private SwimBehaviour swimBehaviour;
	
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
	
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

		
}
