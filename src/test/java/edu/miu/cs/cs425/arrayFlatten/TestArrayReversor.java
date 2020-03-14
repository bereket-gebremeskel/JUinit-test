package edu.miu.cs.cs425.arrayFlatten;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import edu.miu.cs.cs425.arrayReversor.ArrayFlattenerService;
import edu.miu.cs.cs425.arrayReversor.ArrayReversor;

public class TestArrayReversor {
	
	ArrayReversor ar;
	ArrayFlattenerService afs = Mockito.mock(ArrayFlattenerService.class);
	

	@Before
	public void setUp() throws Exception {
		ar = new ArrayReversor(afs);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverseArray() {
		int[][] input = {{1},{4,2}};
		int[] expected = {1,4,2};
		int[] reversed = {2,4,1};
		when(afs.flattenArray(input)).thenReturn(expected);
		assertArrayEquals(reversed, ar.reverseArray(input));
		
		verify(afs).flattenArray(input);
	}

}
