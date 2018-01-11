package com.anshul.designpatterns.ducks.inner;

import com.anshul.designpatterns.ducks.Quackable;

public class RubberDuck implements Quackable {
	public void quack() {
		System.out.println("Squeak");
	}
}
