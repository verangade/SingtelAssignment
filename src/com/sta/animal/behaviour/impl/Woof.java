package com.sta.animal.behaviour.impl;

import com.sta.animal.behaviour.SingBehaviour;

public class Woof implements SingBehaviour{

	@Override
	public void sing() {
		System.out.println("Woof, woof");
		
	}

}
