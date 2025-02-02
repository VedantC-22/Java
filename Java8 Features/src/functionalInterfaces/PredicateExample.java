package functionalInterfaces;

import java.util.function.Predicate;

//What is a Predicate?
//A Predicate is a functional interface in Java that represents a boolean-valued function. 
//It is primarily used for filtering and evaluating conditions. 
//The Predicate<T> interface is part of java.util.function package and is widely used in lambda expressions, stream operations, and method references.


//@FunctionalInterface
//public interface Predicate<T> {
//    boolean test(T t);
//}
//T is the type of input to the predicate.
//The test(T t) method returns true or false based on the given condition.

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> isEven = n -> n % 2 == 0;
		System.out.println(isEven.test(5)); //false
		System.out.println(isEven.test(16)); //true
		
		Predicate<Integer> isNegative = n -> n < 0;
		
		//Predicate methods
		//1. add(Predicate other) -> Combines to predicates using logical AND
		Predicate<Integer> isNegativeEven = isEven.and(isNegative);
		System.out.println(isNegativeEven.test(9)); //false ❌Even and ❌Negative
		System.out.println(isNegativeEven.test(-9)); //false ❌Even and ✔️Negative
		System.out.println(isNegativeEven.test(-8)); //false ✔️Even and ✔️Negative
		
		

	}

}
