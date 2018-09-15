package com.sta;

import com.sta.animal.Bird;
import com.sta.animal.Chicken;
import com.sta.animal.Duck;
import com.sta.animal.Rooster;

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		
		Duck duck = new Duck();
		System.out.println(duck.sing());
		duck.swim();
		
		Bird chicken = new Chicken();
		System.out.println(chicken.sing());
		chicken.fly();
		
		Bird rooster = new Rooster();
		System.out.println(chicken.sing());
		chicken.fly();
	}
}
