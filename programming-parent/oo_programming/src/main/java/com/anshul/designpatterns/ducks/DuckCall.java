package com.anshul.designpatterns.ducks;

public class DuckCall extends Duck{

	public DuckCall(Quackable q, Flyable f) {
		this.quackabel = q;
		this.flyable = f;
	}

	public DuckCall() {
		// just returning instance
	}
	@Override
	public void display() {
		System.out.println("I am Duck call");

	}
}
