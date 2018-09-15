package com.sta.animal.behaviour.impl;

import com.sta.animal.behaviour.WalkBehaviour;

public class NoWalk implements WalkBehaviour{

	@Override
	public void walk() {
		System.out.println("I can not Walk");
		
	}

}
