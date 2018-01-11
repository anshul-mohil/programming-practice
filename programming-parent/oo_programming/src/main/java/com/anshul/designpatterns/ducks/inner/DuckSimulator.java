package com.anshul.designpatterns.ducks.inner;

import com.anshul.designpatterns.ducks.Duck;
import com.anshul.designpatterns.ducks.DuckCall;
import com.anshul.designpatterns.ducks.FlyWithWings;
import com.anshul.designpatterns.ducks.FlyWithoutWings;
import com.anshul.designpatterns.ducks.KwarkSound;
import com.anshul.designpatterns.ducks.MallardDuck;
import com.anshul.designpatterns.ducks.QuackSound;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}
  
	void simulate() {
//		Duck mallardDuck = new MallardDuck(new QuackSound(), new FlyWithWings());
	//	Duck duckCall = new DuckCall(new KwarkSound(), new FlyWithoutWings());

		Duck mallardDuck = new MallardDuck();
		
		mallardDuck.setFlyable(new FlyWithWings());
		mallardDuck.setQuackabel(new QuackSound());
		Duck duckCall = new DuckCall();
		
		
		
 
		System.out.println("\nDuck Simulator");
 
		simulate(mallardDuck);
		System.out.println("==================");
		simulate(duckCall);
	}
   
	void simulate(Duck duck) {
		duck.display();
		duck.performFly();
		duck.performQuark();
	}
}
