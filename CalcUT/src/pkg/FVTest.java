package pkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class FVTest {


	@Test
	public void test() {
		FV_Calculator.futureValue("3", "2", "1");
		assertEquals(FV_Calculator.futureValue("3", "2", "1"), 8.0, 2);
		assertEquals(FV_Calculator.futureValue(".02", "1000", "10"), 1218.99, .01);
		assertEquals(FV_Calculator.futureValue(".1", "3234.29", "3"), 4304.83, .01);
		assertEquals(FV_Calculator.futureValue(".083", "100000", "10"), 221965.03, .01);
		assertEquals(FV_Calculator.futureValue(".125", "5000", "3"), 7119.14, .01);
		assertEquals(FV_Calculator.futureValue(".09", "10000", "30"), 132676.78, .01);
		assertEquals(FV_Calculator.futureValue(".001", "1000", "1"), 1000.99, 0.1);
		assertEquals(FV_Calculator.futureValue(".15", "25000", "20"), 409163.43, 0.1);
	}

}
