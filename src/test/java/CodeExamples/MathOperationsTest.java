package CodeExamples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathOperationsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getSum() {
        int firstVariable = 5;
        int secondVariable = 4;
        int result = 9;
        assertEquals( result, MathOperations.getSum(firstVariable, secondVariable));
    }
}