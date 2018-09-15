package com.sta.animal;

import com.sta.animal.behaviour.impl.CockADoodleDoo;

public class Rooster extends Chicken {
	public Rooster() {
		setSingBehaviour(new CockADoodleDoo());
	}
}
