package functionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vedant", "Dhiraj", "Chetan", "Shivam");
		
		Consumer<String> printName = System.out::println;
		names.forEach(printName);
		
		Function<String, Integer> nameLength = String::length;
		for(String s : names) {
			System.out.println(s.length());
		}
		
//		Reference to an Instance Method 
//		using lambda expression
//		names.sort((a, b) -> a.compareTo(b));
		System.out.println(names);
		
		//using method reference
		names.sort(String::compareTo);
		System.out.println(names);
		
//		Reference to a Constructor
//		using lambda expression
		Supplier<List<Integer>>	list = () -> new ArrayList<>();
		
		//using method reference
		Supplier<List<Integer>> listGetter = ArrayList::new;
		List<Integer> l = listGetter.get();
		l.add(22);
		System.out.println(l);
	}

}
