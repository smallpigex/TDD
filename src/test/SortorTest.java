package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import example.Sortor;

public class SortorTest {
     
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSortValue() {
		int[] values = new int[] {1};
		Sortor sortor = new Sortor();
		int[] result = sortor.sortValue(values);
		assertArrayEquals(new int[] {1}, result);
	}

}
