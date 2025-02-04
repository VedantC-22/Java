package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsEx {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		//conting even integers in list
		int count = 0;
		for(int i : numbers) {
			if(i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		//using stream
		count = (int) numbers.stream().filter(n -> n % 2 == 0).count();
		System.out.println(count);
		
		//performing square of odd numbers
		List<Integer> squares = numbers.stream().filter(n -> n % 2 != 0)
												.map(n -> n * n)
												.collect(Collectors.toList());
		System.out.println(squares);
		
		//Creating Stream
		//1. Using stream()
		Stream<Integer> stream = numbers.stream();
		
		//2. From Arrays
		int[] arr = {1,3,5,7,9};
		Arrays.stream(arr);
		
		//3. Using Stream.of()
		Stream.of("a", "b", "c", "d");
		
		//4. Infinite streams
		List<Integer> a  = Stream.generate(() -> 1).limit(500).collect(Collectors.toList());
		System.out.println(a);
		
		List<Integer> odds = Stream.iterate(1, n -> 2*n + 1).limit(30).collect(Collectors.toList());
		System.out.println(odds);
	}

}
