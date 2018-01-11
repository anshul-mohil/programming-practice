package com.anshul.designpatterns.ducks;

public class MallardDuck extends Duck {
	

	public MallardDuck(Quackable q, Flyable f) {
		this.quackabel = q;
		this.flyable = f;
	}
	public MallardDuck(){
		// just creating instance.
	}
	@Override
	public void display() {
		System.out.println(" Hey I am mallard Duck");
	}

}
