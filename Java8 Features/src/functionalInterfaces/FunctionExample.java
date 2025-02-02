package functionalInterfaces;

import java.util.function.Function;

//What is a Function Interface?
//The Function<T, R> interface in Java is a built-in functional interface in the java.util.function package. 
//It represents a function that:
//  1.Takes an input of type T
//  2.Returns an output of type R
//It is mainly used for data transformation where you apply a function to an input and get a computed result.

//Function Interface Definition

//@FunctionalInterface
//public interface Function<T, R> {
//    R apply(T t);
//}
//T → Input type
//R → Output type
//apply(T t) → Abstract method that processes T and returns R.

public class FunctionExample {

	public static void main(String[] args) {
		
		Function<Integer, Integer> squares = n -> n * n;
		System.out.println(squares.apply(5)); //25
		
//	    Methods
//		1. andThen(Function after)
//		Executes the current function first, then applies another function to the result.
//		Equivalent to f(g(x)).
		
		Function<Integer, Integer> cubes = n -> (int)Math.round(Math.pow(n, 3));
		
		Function<Integer, Integer> squareThenCube = squares.andThen(cubes); // n = 5 -> squares(5) -> 25 -> cubes(25) -> 625
		System.out.println(squareThenCube.apply(5));
		
		Function<Integer, Integer> cubeThenSquare = squares.compose(cubes);
		System.out.println(cubeThenSquare.apply(2)); //64
	}

}
