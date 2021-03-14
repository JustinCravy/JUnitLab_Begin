package csc131.junit;

import static org.junit.Assert.assertThrows;
import org.junit.Test;
import org.junit.rules.ExpectedException; 

public class ConstructerIncorrectIDLowTest {

	@Test(expected = IllegalArgumentException.class)
    public void Constructor_IncorrectID_Low() 
    {
        new GiftCard(-1, 100.00);
    }
}