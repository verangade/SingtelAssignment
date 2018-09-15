package com.sta;

import com.sta.animal.Bird;
import com.sta.animal.Chicken;
import com.sta.animal.Duck;
import com.sta.animal.Rooster;

public class Solution {
	public static void main(String[] args) {
		/*Bird bird = new Bird();
		bird.walk();
		bird.performFly();
		bird.sing();*/
		
		Duck duck = new Duck();
		duck.performSing();
		duck.swim();
		
		Bird chicken = new Chicken();
		chicken.performSing();
		chicken.performFly();
		
		Bird rooster = new Rooster();
		rooster.performSing();
		chicken.performFly();;
	}
}
