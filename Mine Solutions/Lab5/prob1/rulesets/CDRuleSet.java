package Lab5.prob1.rulesets;

import Lab5.prob1.gui.CDWindow;

import java.awt.Component;
import java.math.BigDecimal;

//import lesson5.labsolns.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	private CDWindow cdWindow;

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		nonEmptyRule();
		isPriceFloatNumber();
	}

	private void nonEmptyRule() throws RuleException{
		if(cdWindow.getArtistValue().trim().isEmpty() ||
				cdWindow.getTitleValue().trim().isEmpty() ||
				cdWindow.getPriceValue().trim().isEmpty()){
			throw new RuleException("All field must be non empty");
		}
	}

	private void isPriceFloatNumber() throws RuleException{
		String val = cdWindow.getPriceValue().trim();
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
