import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RunTest {

    @Before
    public void setUp() {
        System.out.println("setUp()");
    }

    @Test
    public void testMethod() {
        System.out.println("testMethod()");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown()");
    }

}
