package functionalInterfaces;

import java.text.DateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

//The Supplier<T> interface is a functional interface in Java that does not take any input but returns a value. 
//It is part of the java.util.function package.

public class SupplierEx {

	public static void main(String[] args) {
		//Generating fixed string
		Supplier<String> greet = () -> "Hello, World";
		System.out.println(greet.get());
		//Generating random number 0-99
		Supplier<Integer> random = () -> new Random().nextInt(100);
		System.out.println(random.get());
		
		//fetching current date
		Supplier<String> date = () -> DateFormat.getDateInstance().format(new Date()) ;
		System.out.println(date.get());
		
		//Generating unique UUIDs
		Supplier<String> uniqueId = () -> UUID.randomUUID().toString();

        System.out.println(uniqueId.get()); // Output: A unique UUID
	}

}
