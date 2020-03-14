package edu.miu.cs.cs425.arrayFlatten;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class FlattenArrayTest extends TestCase {
	FlattenArray fa;
	
	@Before
	protected void setUp() throws Exception {
		fa = new FlattenArray();
		super.setUp();
	}
	
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testFlattenArray() {
		int[][] input1 = {{1},{4,2},{10,20,30}};
		int[] expected1 = {1,4,2,10,20,30};
		
		assertArrayEquals(expected1,fa.flattenArray(input1));
	}
	
	@Test
	public void testnullPassedToFlattenArray() {
		int[] expected= null;
		assertArrayEquals(expected,fa.flattenArray(null));
		
	}

}
