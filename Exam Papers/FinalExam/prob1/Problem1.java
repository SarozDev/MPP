package prob1;


//work with this lambda expression:   (Double x, Double y, Double z) -> x * y * z < x + y

public class Problem1 {
	
	// name and type of lambda goes here
	
	TriPredicate<Double, Double, Double> triPredicate = (x, y, z) -> x*y*z < x+y;
	
	// representing lambda as a method reference
	
	TriPredicate<Double, Double, Double> triPredicate2 = Problem1::checkLess;
	
	//representing lambda as a static nested class
	
	//representing lambda as a static nested class
	static class CheckLess implements TriPredicate<Double, Double, Double> {
		@Override
		public boolean test(Double x, Double y, Double z) {
			return x*y*z<x+y;
		}
	}
	
	private static boolean checkLess(Double x, Double y, Double z) {
		return x*y*z <x+y;
	}
		
	//evaluate with Double inputs 2.1, 0.35, 0.5
	public void evaluator() {
		
		boolean out1 = triPredicate.test(2.1, 0.35, 0.5);
		boolean out2 = triPredicate2.test(2.1, 0.35, 0.5);
		boolean out3 = (new CheckLess()).test(2.1, 0.35, 0.5);
		
		System.out.println("out1: "+ out1);
		System.out.println("out2: "+ out2);
		System.out.println("out3: "+ out3);
		
	}
	
	public static void main(String[] args) {
		Problem1 p = new Problem1();
		p.evaluator();
	}
	
}
