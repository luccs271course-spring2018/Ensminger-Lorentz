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
	@Test
	public void getTest1() {
		assertNotNull(fixture);
		ArrayList<String> storageCheck = new ArrayList<>();
		storageCheck.addAll(Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz", "7"));
		assertEquals(storageCheck, fixture.fizzBuzz(7));

	}
	@Test
	public void getTest2() {
		assertNotNull(fixture);
		ArrayList<String> storageCheck = new ArrayList<>();
		storageCheck.add("1");
		assertEquals(storageCheck, fixture.fizzBuzz(1));

	}
	@Test
	public void getTest3() {
		assertNotNull(fixture);
		ArrayList<String> storageCheck = new ArrayList<>();
		storageCheck.addAll(Arrays.asList("The integer entered must be greater than or equal to 1"));
		assertEquals(storageCheck, fixture.fizzBuzz(-10));

	}
	@Test
	public void getTest4() {
		assertNotNull(fixture);
		ArrayList<String> storageCheck = new ArrayList<>();
		storageCheck.addAll(Arrays.asList("The integer entered must be greater than or equal to 1"));
		assertEquals(storageCheck, fixture.fizzBuzz(-1));

	}
	@Test
	public void getTest5() {
		assertNotNull(fixture);
		ArrayList<String> storageCheck = new ArrayList<>();
		storageCheck.addAll(Arrays.asList("The integer entered must be greater than or equal to 1"));
		assertEquals(storageCheck, fixture.fizzBuzz(0));

	}


}
