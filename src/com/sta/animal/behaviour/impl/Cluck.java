package com.sta.animal.behaviour.impl;

import com.sta.animal.behaviour.SingBehaviour;

public class Cluck implements SingBehaviour {

	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}

}
