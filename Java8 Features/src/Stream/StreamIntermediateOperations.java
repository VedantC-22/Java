package Stream;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperations {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		List<Integer> nums = Arrays.asList(1,5,3,2,4,20,35,69,78,10,2,54,3,6,75,21);
		List<String> names = Arrays.asList("Vedant", "Dhiraj", "Akshay", "Chetan", "Shivam", "Ved", "Dhirendra", "Vedant");
		
		//1.Filter
		
		//List of names starting with specific letter
		List<String> startWith = names.stream().filter( x -> x.toLowerCase().startsWith("v")).collect(Collectors.toList());
		System.out.println(startWith);
		
		//2.sorted
		
		Stream<Integer> sortedStream = nums.stream().sorted();
		System.out.println(sortedStream.collect(Collectors.toList()));
		
		Stream<Integer> sorted = nums.stream().sorted((a, b) -> b - a);
		System.out.println(sorted.collect(Collectors.toList()));
		
		//3.distinct
		
		//it counts names starting with 'v', it may include duplicate entries.
		long res = names.stream().filter(x -> x.toLowerCase().startsWith("v")).count();
		System.out.println(res); //3
		
		//It counts distinct names starting with 'v'.
		long res2 = names.stream().filter(x -> x.toLowerCase().startsWith("v")).distinct().count();
		System.out.println(res2); //2
		
		//4.Limit
		System.out.println(Stream.iterate(5, x -> x * 2).limit(100).collect(Collectors.toList()));
		System.out.println(Stream.generate(() -> 1).limit(20).collect(Collectors.toList()));
		
		//5.skip
		System.out.println(Stream.iterate(5, x -> x + 5).limit(100).collect(Collectors.toList()));
		Stream.iterate(5, x -> x + 5).skip(5).limit(100)
		.forEach(System.out::println); //it will skip first n elements from sequence
		
		//6. flatMap
		List<String> sentence = Arrays.asList("Hello how are you?", "whar are doing?");
		List<String> flatmap = sentence.stream().flatMap(x -> Arrays.stream(x.split(" "))).toList();
		
		List<List<String>> fruits = Arrays.asList(
				Arrays.asList("apple", "mango"),
				Arrays.asList("kiwi", "banana"),
				Arrays.asList("grapes", "papaya")
		);
		
		List<String> fruitList = fruits.stream().flatMap(x -> x.stream()).toList();
		System.out.println(fruitList);
				
		
		//Terminal Operations
		//1.Collect
			Set<String> upperName = names.stream().map(x -> x.toUpperCase()).collect(Collectors.toSet());
			System.out.println(upperName);
		
		//2.forEach
			names.stream().forEach(System.out::println);
		
		//3.reduce: combines elements to produce a single result
			long res1 = nums.stream().reduce(2, (x, y) -> x + y);
			System.out.println(res1);
			
		//4.anyMatch, allMatch, noneMatch
			boolean ans = nums.stream().anyMatch((x) -> x % 4 == 0);
			System.out.println(ans);
			
			System.out.println(nums.stream().anyMatch(x -> x % 11 == 0)); //false
			
			System.out.println(nums.stream().allMatch(n -> n > 0)); //true
			
			System.out.println(nums.stream().allMatch(x -> x % 2 != 0)); //false
			
			
			System.out.println(nums.stream().noneMatch(x -> x < 0)); //true becoz, all numbers are positive
	
		//6. findFirst, findAny
			System.out.println(names.stream().findFirst().get());
			System.out.println(names.stream().findAny().get());
			
			
			//Example: finding names with length less than 4
			List<String> list = Arrays.asList("Vedant", "Om", "Shiv", "Dhiraj", "Ram", "Das","Kunal");
			list.stream().filter(x -> x.length() > 4).forEach((x) -> System.out.print(x + "  "));;
			
			//Example: Calculating cubes and sorting numbers
			List<Integer> numlist = Arrays.asList(5,8,3,-9,8,-7,7,4,-8,2);
			List<Long> result = numlist.stream().map(x -> Math.round(Math.pow(x, 3))).sorted().toList();
			System.out.println(result);
			
			//Example: Counting occurrences of a character
			//✅ chars() returns an IntStream of Unicode values of characters.
			//✅ Supports filtering, counting, and sorting characters efficiently.
			//✅ Efficient for processing large text data using Streams.
			String str = "Hello, world";
			System.out.println(str.chars().filter(x -> x == 'l').count());
		
		//7. peek()
			List<Integer> n = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
			List<Integer> squares = n.stream().peek(x -> System.out.println("Befor square " + x)).map(x -> x * x).peek(x -> System.out.println("After squaring " + x)).toList();
		
		//8. toArray()
			
			Object[] arr = n.stream().map(x -> x * x).toArray();
			
		//9. min/max
			Optional<Integer> y = Stream.of(12,58,63,4,936,95,72,64,20,63,46,85).min(Comparator.naturalOrder());
			System.out.println(y);
			Optional<Integer> x = Stream.of(12,58,63,4,936,95,72,64,20,63,46,85).min((a, b) -> b - a);
			System.out.println(x);
			
		//10. forEachOrdered
			List<Integer> numslist = Arrays.asList(1,2,3,4,5,6,7,8,9,10,12);
			numslist.parallelStream().forEach(System.out::println);
			numslist.parallelStream().forEachOrdered(System.out::println);
			
	}

}

//filter()	Filters elements
//map()		Transforms elements
//sorted()	Sorts elements
//distinct()Removes duplicates
//limit(n)	Limits elements
//skip(n)	Skips elements