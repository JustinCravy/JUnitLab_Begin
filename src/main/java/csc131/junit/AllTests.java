package csc131.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AmountDue.class, ConstructerIncorrectIDHighTest.class, ConstructerIncorrectIDLowTest.class,
		DeductTest.class, GetBalanceTest.class, GiftCardTest.class, IlegalArguemntExceptionTest.class,
		InvalidTransaction.class })
public class AllTests {

}
