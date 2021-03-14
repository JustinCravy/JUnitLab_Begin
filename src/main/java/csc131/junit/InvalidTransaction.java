package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException; 

public class InvalidTransaction{
	@Test
	public void deduct_InvalidTransaction() {
		double balance;
		GiftCard card;
		int issuingStore;
		String b;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		
		b = "Invalid Transaction";
		assertEquals("deduct -10.00 from 100.00", b, card.deduct(-10.0));
	}

	
		
	}

