package com.sta;

import javax.xml.stream.FactoryConfigurationError;

import com.sta.animal.Bird;
import com.sta.animal.Cat;
import com.sta.animal.Chicken;
import com.sta.animal.Dog;
import com.sta.animal.Duck;
import com.sta.animal.Fish;
import com.sta.animal.Parrot;
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
		
		//Parrot Living near Dog
		Bird parrot1 = new Parrot(new Dog());
		//Parrot Living near Cat
		Bird parrot2 = new Parrot(new Cat());
		//Parrot Living near Rooster
		Bird parrot3 = new Parrot(new Rooster());
		//Parrot Living near Duck
		Bird parrot4 = new Parrot(new Duck());
		
		parrot1.performSing();
		parrot2.performSing();
		parrot3.performSing();
		parrot4.performSing();
		
		
		Fish fish = new Fish();
		fish.performFly();
		fish.performSing();
		fish.performWalk();
		fish.performSwim();
	}
}
