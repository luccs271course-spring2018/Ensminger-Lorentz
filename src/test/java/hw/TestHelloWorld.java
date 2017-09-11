package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
	/*@Test
	public void getTest1()
	{
		assertNotNull(fixture);
		String check = "Invalid entry, number must be greater than or equal to 1";
		assertEquals(check, fixture.fizzBuzz(-10));
	}
	@Test
	public void getTest2(){
		assertNotNull(fixture);
		String check = "Invalid entry, number must be greater than or equal to 1";
		assertEquals(check,fixture.fizzBuzz(-1));

	}
	@Test
	public void getTest3() {
		assertNotNull(fixture);
		String check = "Invalid entry, number must be greater than or equal to 1";
		assertEquals(check, fixture.fizzBuzz(0));
	}*/

	/*@Test
	public void getTest4() {
		assertNotNull(fixture);

		String [] storagecheck = {"1"};
		assertArrayEquals(storagecheck , fixture.fizzBuzz(1));

	}

	@Test
	public void getTest5() {
		assertNotNull(fixture);

		String [] storagecheck = {"1", "2", "fizz","4", "buzz","fizz","7"};
		assertArrayEquals(storagecheck , fixture.fizzBuzz(7));

	}*/
	@Test
	public void getMessage() {
		assertNotNull(fixture);
		ArrayList<String> checking = new ArrayList<>();
		String [] storagecheck =("1", "2", "fizz","4", "buzz","fizz","7","8","fizz","buzz","11","fizz","13","14","fizz buzz","16","17");
		for (String num: storagecheck)
		{
			checking.add(num);
		}
		assertEquals(storagecheck , fixture.fizzBuzz(17));

	}


}
