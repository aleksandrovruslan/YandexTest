import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunTest {

    @Before
    public void setUp() {
        System.out.println("setUp()");
    }

    @Test
    public void testMethod() {
        System.out.println("testMethod()");
        String expected = "String";
        String actual = "String";
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() {
        System.out.println("tearDown()");
    }

}
