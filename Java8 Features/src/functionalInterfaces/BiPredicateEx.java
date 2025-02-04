package functionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateEx {

	public static void main(String[] args) {
		
		//Bi-Predicate -> The BiPredicate<T, U> interface represents a predicate (boolean-valued function) that tests a condition on two arguments.
		System.out.println("---------BiPredicate----------");
		BiPredicate<Integer, Integer>isSumEven = (a, b) -> (a + b) % 2 == 0;
		System.out.println(isSumEven.test(5,9)); //true 5 + 9 = 14

		//Bi-Function -> The BiFunction<T, U, R> interface represents a function that takes two arguments and produces a result.
		System.out.println("---------BiFunction----------");
		BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
		System.out.println(sum.apply(5,8)); //13
		
		//Calculating length by concatenating two strings
		BiFunction<String, String,Integer> len = (str1, str2) -> (str1.concat(str2)).length();
		System.out.println(len.apply("Vedant", "Chaudhari")); //15
		
		//Bi-Consumer -> The BiConsumer<T, U> interface represents an operation that takes two arguments and performs an action without returning a result.
		System.out.println("---------BiConsumer----------");
		BiConsumer<String, Integer> printInfo = (name, age) -> System.out.println(name + " " + age);
		BiConsumer<String, Integer> greet = (name, age) -> System.out.println("Welcome " + name);
		
		printInfo.accept("Vedant", 21);
		BiConsumer<String, Integer> printThenGreet = printInfo.andThen(greet);
		
		printThenGreet.accept("Shivam", 25);
		
	}

}
