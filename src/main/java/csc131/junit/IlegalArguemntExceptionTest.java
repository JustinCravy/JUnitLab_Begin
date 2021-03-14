package csc131.junit;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.rules.ExpectedException; 

public class IlegalArguemntExceptionTest {

	 @Test(expected = IllegalArgumentException.class)
	    public void constructor_IncorrectBalance() throws IllegalArgumentException
	    {
	        new GiftCard(1, -100.00);
	    }
}