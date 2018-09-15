package com.sta.animal;

import com.sta.animal.behaviour.FlyBehaviour;
import com.sta.animal.behaviour.SingBehaviour;

public abstract class Bird extends Animal {
	
	private FlyBehaviour flyBehaviour;
	private SingBehaviour singBehaviour;
	

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setSingBehaviour(SingBehaviour singBehaviour) {
		this.singBehaviour = singBehaviour;
	}

	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performSing() {
		singBehaviour.sing();
	}
	
	public String sing() {
		return "I am Singing";
	}

}
