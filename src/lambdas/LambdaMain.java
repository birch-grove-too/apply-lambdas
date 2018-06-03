package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LambdaMain {

	UnaryOperator<Integer> doubleMe = i -> i * 2;
	
	UnaryOperator<Integer> halveMe = i -> i/2;
	
	UnaryOperator<Integer> squareMe = i -> i * i;

	public static void main(String[] args) {
		
		LambdaMain driver = new LambdaMain();
		driver.operateUnaries();
		driver.exploreUnaries();
	}
	
	public void operateUnaries() {

		System.out.println("Double me: " + doubleMe.apply(Integer.valueOf(4)) );
		System.out.println("Halve me: " + halveMe.apply(Integer.valueOf(4)) );
		System.out.println("Square me: " + squareMe.apply(Integer.valueOf(4)) );
	}


	public void exploreUnaries() {
		Function<Integer,Integer> confuseMe = doubleMe.compose(halveMe);
		System.out.println("Confuse me: " + confuseMe.apply(Integer.valueOf(4)) );

	}
}
