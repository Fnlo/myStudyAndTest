package Fnlo.QandA;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MinFuncTest {


	@Test
	public void testMin() {
		Integer[] integerArray = new Integer[]{0, 1, 2, 3, -1};
		System.out.println(MinFunc.min(integerArray));
	}

}
