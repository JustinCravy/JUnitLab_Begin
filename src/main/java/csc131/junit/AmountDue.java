package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException; 

public class AmountDue {

	@Test
	public void deduct_AmountDue() 
	{
		double balance;
		GiftCard card;
		int issuingStore;
		String b;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		b = "Amount Due: " + String.format("%6.2f",10.00);
		assertEquals("deduct 110.00 from 100.00", b, card.deduct(110.00));
		;
	}

}
