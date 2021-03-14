package csc131.junit;

import static org.junit.Assert.assertThrows;
import org.junit.Test;
import org.junit.rules.ExpectedException; 

public class ConstructerIncorrectIDHighTest {

	@Test(expected = IllegalArgumentException.class)
    public void Constructor_IncorrectID_High() 
    {
        new GiftCard(100000, 100.00);
    }
}