package com.anshul.lambda.basic;

import java.util.function.Function;

/**
 *
 * @author José Paumard
 */
public class MainComparator {
	static Person per1 = null;
	static Person per2 = null;
	static Person per3 = null;
	
		
	public static void main(String... args) {
		per1 = new Person("Anshul", "Mohil", 31);
		per2 = new Person("Anukul", "Mohil", 29);
		per3 = new Person("Manpreet", "kaur", 50);
	//	protoType1();
		lambdaBasic();
	//	lambdaFunction();
	}
/**
 * single statement lambda will return value without explicit return statement.
 */
private static void lambdaBasic(){
	
	/**
	 * Java 7 style anaonymous class
	 */
	Comparator<Person> ageDiff_normal = new Comparator<Person>() {
		
		@Override
		public int compare(Person t1, Person t2) {

			return t1.getAge() - t2.getAge();
		}
	};

	// Java 7 calling/passing objects to implementation
	System.out.println(ageDiff_normal.compare(per1, per2));
	
	/**
	 * java 8 lambda expressions
	 */
	Comparator<Person> ageDiff = (p1,p2) -> p1.getAge() - p2.getAge() ;

	Comparator<Person> nameLenDiff = (p1, p2) -> (p1.getFirstName() + p1.getLastName()).length() - (p2.getFirstName() + p2.getLastName()).length();
	
	Comparator<Person> nameLenDiff2 = (p1, p2) -> {
		int l1 = (p1.getFirstName() + p1.getLastName()).length();
		int l2 = (p2.getFirstName() + p2.getLastName()).length();
				
		return l1-l2;
		};
	
    
	// To use this implementation call method on variableImpl and pass parameters.
	// java 8/ lambda calling/passing objects to implementation
	System.out.println("Difference between Person 1 and person2 is: " + ageDiff.compare(per1,per2) +" Years");
	System.out.println("Diff in lenght of Person1 and person2 is :  "+ nameLenDiff.compare(per1, per2) + " Lenght");
	System.out.println("Diff in lenght with explanatory syntax: " + nameLenDiff2.compare(per1,per2));
}

private static void lambdaFunction(){
	//Declaration of a function which is an inbuild interface to define lambda
	// Its first parameter is the argument and the second parameter is return type.
	// Function<Person,Integer> ageFunc = (Person p) -> p.getAge();  //or
	/**
	 * Function is a short hand to write a function on some object. in this case its Person object.
	 * which return something in this case any Comparable object.
	 */
	
  	Function<Person,Comparable> ageFunc = p -> p.getAge();
	// apply function will help returning the value as per definition in lambda varibale.
	System.out.println(ageFunc.apply(per1) + " is the value returned by the function based on definition");
	
	//Breaking step by step working
	// step 1: creating a function defines what action to perform. like: passed object.getAge();
	// step 2: comparing method will use Function class the definition of function method.
	// step 3: comparing method will return the implementation of compare method. ie. Implementation of Functions's return type 'R'
	//         ie. Comparable's only abstract method.
	// step 4: very very imp.... So when you call compare(per1,per3) this call will be on the returned Comparator object which has
	//         compare method implementation in its returned statement. which means calling to compare will be handled by the 
	//         return statement of comparing.
														//    (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
	System.out.println("Person 1 and Person 3 age diff  " + Comparator.comparing(ageFunc).compare(per1, per3));
    System.out.println("Adding age of Per1 and Per 3 is : " + Comparator.addingAge(ageFunc).compare(per1, per3));
	
	/**
	 * reverse function to demonstrate that how variable datatype has direct effect on 
	 * statement you write in lamba and what you are returning.
	 */
	Function<Comparable,Person> reverseFunc = x -> new Person("Ansh","Mohil",99);
	System.out.println(reverseFunc.apply(87)+ " is the value returned by the function based on definition");
	
	
}

private static void protoType1(){


	Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
	Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
	Comparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());

	Function<Person, Integer> f1 = p -> p.getAge();
	Function<Person, String> f2 = p -> p.getLastName();
	Function<Person, String> f3 = p -> p.getFirstName();
	


	Comparator<Person> cmpPersonAge = Comparator.comparing(Person::getAge);
	Comparator<Person> cmpPersonLastName = Comparator.comparing(Person::getLastName);

	Comparator<Person> cmp = Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName)
			.thenComparing(Person::getAge);
	Person per1 = new Person("Anshul", "Mohil", 30);
	Person per2 = new Person("Anukul", "Mohil", 28);
	Person per3 = new Person("Manpreet", "kaur", 26);
	
//	Comparator<Person> cmpPerson_1 = Comparator.comparing_1(Person::getFirstName).compare(per1, per2);
	// working with function class type Integer only
//	Comparator<Person> cmpFun1 = Comparator.comparingWithFun(f1);
//	Comparator<Person> cmpFun2 = Comparator.comparingWithFun( p -> p.getAge());
	
	// with generic return type in function
	Comparator<Person> cmpFun3 = Comparator.comparing(Person::getAge);
	Comparator<Person> cmpFun4 = Comparator.comparing(p -> p.getFirstName());

	System.out.println(
			"Age difference between anukul and anshul is:" + " " + cmpAge.compare(per2, per1) + "  years ");

}

}


