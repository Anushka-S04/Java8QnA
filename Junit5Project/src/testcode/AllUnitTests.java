package testcode;

//import static org.junit.jupiter.api.Assertions.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

//junit test case from other

@RunWith(JUnitPlatform.class)
@SelectClasses({DemoTest1.class,JUnitMessageTest.class})
class AllUnitTests {

	

}
