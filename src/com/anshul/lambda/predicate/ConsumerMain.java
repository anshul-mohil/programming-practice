package com.anshul.lambda.predicate;

import com.anshul.lambda.basic.Person;

public class ConsumerMain {
	static Person p1 = new Person("Manni", "Bevkuf", 26);
	static Person p2 = new Person("Manni", "Ullu ki patthi", 31);

	public static void main(String[] args) {
		// take parameter but does not return anything
		// consumer();
		// does not take parameter but return output
		// supplier();
		// takes input and return output define while declaring lambda
		// function();
		// takes input and return boolean value;
		// predicate();
		// chaning ie. when more 1 lamda expressions are chained.
		// ie. output of 1 expression will be input to the other.
		predicateChaining();
		predicateAndChaining();
	}

	private static void predicateChaining() {
		Predicate<String> pre1 = x -> x.length() < 30;
		Predicate<String> pre2 = x -> x.length() > 1;
		// chaining
		Predicate<String> pre3 = pre1.and(pre2);
		System.out.println(pre3.test("Anshul"));
	}
	private static void predicateAndChaining() {
		Predicate<String> pre1 = x -> x.length() < 3;
		Predicate<String> pre2 = x -> x.length() > 1;
		// chaining
		Predicate<String> pre3 = pre1.or(pre2);
		System.out.println(pre3.test("Anshul"));
	}
	private static void predicate() {
		// Definition
		Predicate<Person> predicate = x -> x.getAge() > 30;

		// Calling
		System.out.println(predicate.test(p1));
		System.out.println(predicate.test(p2));
	}

	private static void function() {
		Function<Person, Comparable> func1 = x -> x.getFirstName() + " " + x.getLastName() + " age: " + x.getAge();
		String detail = (String) func1.apply(new Person("Manni", "Bevkuf", 26));
		System.out.println(detail);

	}

	private static void supplier() {
		Supplier<String> sup = () -> new String("Hey man I am supplier").toString();
		Supplier<Person> per1 = () -> new Person("Anshul", "Mohil", 90);
		Supplier<Person> per2 = Person::new;
	}

	private static void consumer() {
		Consumer<String> print = s -> System.out.println(s);

		print.accept("Anshul");
	}

}
