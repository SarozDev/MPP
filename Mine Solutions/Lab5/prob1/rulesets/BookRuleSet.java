package Lab5.prob1.rulesets;

import Lab5.prob1.gui.BookWindow;

import java.awt.Component;
import java.math.BigDecimal;

//import lesson5.labsolns.prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	private BookWindow book;
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		book = (BookWindow) ob;
		nonEmptyRule();
		isIdNumeric();
	}

	private void nonEmptyRule() throws RuleException{
		if(book.getIsbnValue().trim().isEmpty() ||
			book.getTitleValue().trim().isEmpty() ||
				book.getPriceValue().trim().isEmpty()){
			throw new RuleException("All field must be non empty");
		}
	}

	private void isIdNumeric() throws RuleException{
		String val = book.getIsbnValue().trim();
		try {
			Integer.parseInt(val);

		}
		catch (NumberFormatException e){
			throw new RuleException("IsbnValue must be numeric");
		}
		var len = val.length();
		if(String.valueOf(val).length() == 10 || String.valueOf(val).length() == 13){
			throw new RuleException("IsbnValue length must be 10 or 13");
		}
		if(len == 10 && !(val.charAt(0) == '0' || val.charAt(0) == '1')) {
			throw new RuleException("First digit of 10-digit ISBN must be 0 or 1");
		}
		if(len == 13 && !(val.startsWith("978") || val.startsWith("979"))) {
			throw new RuleException("All 13-digit ISBNs must begin with either '978' or '979'");
		}
	}

	private void isPriceFloatNumber() throws RuleException{
		String val = book.getPriceValue().trim();
		try{
			Float.parseFloat(val);
		}
		catch (Exception e){
			throw new RuleException("Price must be float number");
		}

		var doubleVal = Double.parseDouble(val);
		if(!(BigDecimal.valueOf(doubleVal).scale() == 2)){
			throw new RuleException("Price value should not be greater than 2 decimal places.");
		}

		if(doubleVal  <= 0.49){
			throw new RuleException("Price must have value bigger than 0.49.");
		}
	}

}
