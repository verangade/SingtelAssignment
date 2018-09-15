package com.sta.animal.behaviour.impl;

import com.sta.animal.behaviour.SingBehaviour;

public class NoSound implements SingBehaviour {

	@Override
	public void sing() {
		System.out.println("No Sound");

	}

}
