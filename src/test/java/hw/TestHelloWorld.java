package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestHelloWorld {

    private Main fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new Main();
    }

    @After
    public void tearDown() throws Exception {
        fixture = null;
    }

    @Test
    public void getMessage() {
        assertNotNull(fixture);
        ArrayList<String> storageCheck = new ArrayList<>();
        storageCheck.addAll(Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizz buzz", "16", "17"));
        assertEquals(storageCheck, fixture.fizzBuzz(17));

    }


}
