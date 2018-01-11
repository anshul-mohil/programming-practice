package com.anshul.designpatterns.ducks;

public abstract class Duck{

	Quackable quackabel = null;
	Flyable flyable = null;

	public void swim() {
		System.out.println(" Swiming like a duck ");
	}

	public void performQuark() {
		if(quackabel != null)
			quackabel.quack();
		else
			System.out.println("Quackable is null : initialize by type of quack you want me to perform");
	}

	public Quackable getQuackabel() {
		return quackabel;
	}

	public void setQuackabel(Quackable quackabel) {
		this.quackabel = quackabel;
	}

	public Flyable getFlyable() {
		return flyable;
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public void performFly() {
		if(flyable != null)
		flyable.fly();
		else
			System.out.println("Flyable is null: Initialize me the way you want me to see flying");
	}
	public abstract void display();
}
