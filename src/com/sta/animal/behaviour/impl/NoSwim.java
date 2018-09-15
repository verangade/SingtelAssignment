package com.sta.animal.behaviour.impl;

import com.sta.animal.behaviour.WalkBehaviour;

public class NoSwim implements WalkBehaviour{

	@Override
	public void walk() {
			System.out.println("I cannot swim");		
	}

}
