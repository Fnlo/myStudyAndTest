package Fnlo.QandA;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MinFuncTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMin() {
		Integer[] integerArray = new Integer[]{0, 1, 2, 3, -1};
		System.out.println(MinFunc.min(integerArray));
	}

}
