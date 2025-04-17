import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Demo test to print message")
//@Epic("Calculation test")
@Feature("Demo Testing")
public class SampleTest {

    @Test
    @DisplayName("Print hello world!")
    @Description("This method is to print hello world to test whether is working as expected or not")
    @Link("https://en.wikipedia.org/wiki/Rajasthan")
    @Story("printing hello world")
    public void myFirstTest() {
        System.out.println("Hello test case1");
    }

//    @Test
//    @Issue("https://en.wikipedia.org/wiki/Rajasthan")
//    @DisplayName("Two number are equals or not")
//    @Description("This method giving unpredictable result")
//    @Story("having comparison issue on this")
//    public void issueTest(){
//        Assertions.assertEquals(10,5);
//    }

    @Test
    @DisplayName("Add Two Numbers")
    @Description("this method adding two integer numbers and got result as expected")
    @Story("Add Integer Numbers")
    public void addTwoNumber(){
        System.out.println("Adding two numbers");
    }

}
