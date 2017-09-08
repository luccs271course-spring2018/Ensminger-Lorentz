package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
		assertEquals("hello world", fixture.fizzBuzz(5));
	}


}
