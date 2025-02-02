package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//What is a Consumer Interface?
//The Consumer<T> interface in Java is a built-in functional interface in the java.util.function package.
//It represents an operation that:
//	Takes an input of type T
//	Performs an action on the input
//Does NOT return any value (void return type)
//It is commonly used when performing side effects, such as printing, updating a database, or logging information.

public class ConsumerExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vedant", "Shivam", "Ram");
		Consumer<String> printName = System.out::println;
	
		
		
		names.forEach(printName);
		
		//Method .andThen()		
		Consumer<String> upper = name -> name.toUpperCase();
		
		Consumer<String> greet = name -> System.out.println("Hello, " + name);
		
		Consumer<String> upperThenGreet = upper.andThen(greet);
		
		names.forEach(upperThenGreet);
	}

}
