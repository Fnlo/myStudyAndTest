package Fnlo.Test.Number;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetScale() {
		assertEquals(0, Fnlo.Test.Number.Test.getScale(1310732));
		System.out.println("nihao");
	}

}
