package com.anshul.designpatterns.ducks.inner;

import com.anshul.designpatterns.ducks.Quackable;

public class DecoyDuck implements Quackable {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
