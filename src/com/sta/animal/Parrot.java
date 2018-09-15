package com.sta.animal;


import com.sta.animal.behaviour.impl.CockADoodleDoo;
import com.sta.animal.behaviour.impl.Meow;
import com.sta.animal.behaviour.impl.Quak;
import com.sta.animal.behaviour.impl.Woof;

public class Parrot extends Bird{
	
	private Animal nebihourAnimal;
	
	public Parrot(Animal nebihourAnimal) {
		this.nebihourAnimal = nebihourAnimal;
		
		if(nebihourAnimal instanceof Dog) {
			setSingBehaviour(new Woof());
		}else if(nebihourAnimal instanceof Cat) {
			setSingBehaviour(new Meow());
		}else if(nebihourAnimal instanceof Rooster) {
			setSingBehaviour(new CockADoodleDoo());
		}else if(nebihourAnimal instanceof Duck) {
			setSingBehaviour(new Quak());
		}
	}
	
	public void setNebihourAnimal(Animal nebihourAnimal) {
		this.nebihourAnimal = nebihourAnimal;
	}

	
}
