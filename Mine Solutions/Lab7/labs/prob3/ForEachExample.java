package Lab7.labs.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format



		System.out.println((list.stream().map(s->s.toUpperCase()).collect(Collectors.toList())));
		System.out.println((list.stream().map(String::toUpperCase).collect(Collectors.toList())));

		list.forEach(new ConsumerUpperCase());

		
	}

	static class ConsumerUpperCase implements Consumer<String>{
		@Override
		public void accept(String s) {
			System.out.println(s.toUpperCase());
		}
	}


	
	//implement a Consumer
	
	
}