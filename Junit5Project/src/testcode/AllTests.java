package testcode;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class, MyMathTest.class })
public class AllTests {

}
/*to run two tests together
 * package-- other-- junit test suite-- choose calc & math-- finish
 * test suite -> collection of many tests
 */