package prob2;

import helperclasses.CheckoutRecordEntry;
import helperclasses.TestData;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/*
 * Print to the console the list of book titles � in sorted order -- 
 * for which the book was checked out on June 27, 2015. 
 * The ordering of the book titles is as follows: First sort by the length descending
 * of the title ( smaller number of characters first), then by reverse of the title 
 * (�yza� combes before �axb� because sorting is on the reverse of the title ) .  
 */
public class Problem2 {

	public static void main(String[] args) {
		//use this list  Hint: create 6/27/2015 like this: LocalDate.of(2015, 6, 27) 
		List<CheckoutRecordEntry> list = TestData.INSTANCE.getAllEntries();
		
		Comparator<String> reverseAlpha = (String str1, String str2) -> {
			String str1Reversed = new StringBuilder(str1).reverse().toString();
			String str2Reversed = new StringBuilder(str2).reverse().toString();
			
			return str1Reversed.compareTo(str2Reversed);
		};
		
		List<String> resTitles = list.stream()
				.filter(x->x.getCheckoutDate().equals(LocalDate.of(2015, 6, 27)))
				.map(x->x.getCopy().getBook().getTitle())
				.sorted(Comparator.comparing(String::length).reversed()
						.thenComparing(reverseAlpha))
				.collect(Collectors.toList());

		System.out.println(resTitles);
	}
	

}
