package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import example.Sortor;

public class SortorTest {
	private Sortor sortor = new Sortor();
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSortValue() {
		int[] testValues1 = new int[] {1};
		int[] result1 = sortor.sortValue(testValues1);
		assertArrayEquals(new int[] {1}, result1);
		
		int[] testValues2 = new int[] {2, 1};
		int[] result2 = sortor.sortValue(testValues2);
		assertArrayEquals(new int[] {1, 2}, result2);
		
		int[] testValues3 = new int[] {4, 5, 3, 2, 1};
		int[] result3 = sortor.sortValue(testValues3);
		assertArrayEquals(new int[] {1, 2, 3, 4, 5}, result3);
	}

}
