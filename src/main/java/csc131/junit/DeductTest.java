package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DeductTest {

	@Test
	public void deduct_RemainingBalance() 
	{
		
		double balance;
		GiftCard card;
		int issuingStore;
		String b;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		b = "Remaining Balance: " + String.format("%6.2f" , 90.00);
		assertEquals("deduct(10.00)", b, card.deduct(10.0));
	}

}
