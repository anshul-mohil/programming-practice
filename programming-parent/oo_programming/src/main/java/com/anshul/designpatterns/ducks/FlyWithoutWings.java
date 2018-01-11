package com.anshul.designpatterns.ducks;

public class FlyWithoutWings implements Flyable {
@Override
public void fly() {
	System.out.println("Hey I am flying without wings");	
}
}
