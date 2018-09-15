package com.sta;

import com.sta.animal.Bird;
import com.sta.animal.Chicken;
import com.sta.animal.Duck;

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Duck duck = new Duck();
		duck.sing();
		duck.swim();
		
		
		
		Bird chicken = new Chicken();
		chicken.sing();
		chicken.fly();
	}
}
