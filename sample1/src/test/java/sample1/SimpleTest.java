package sample1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SimpleTest {

	@BeforeClass
	public void setUp() {
		System.out.println("Executing  @BeforeClass");
	}

	@Test(groups = { "fast" })
	public void aFastTest() {
		System.out.println("Fast test 1");
	}

	@Test(groups = { "fast" })
	public void bFastTest() {
		System.out.println("Fast test 2");
	}

	@Test(groups = { "fast", "slow" })
	public void cFastSlowTest() {
		System.out.println("Fast slow test 1");
	}

	@Test(groups = { "fast", "slow" })
	public void dFastSlowTest() {
		System.out.println("Fast slow test 2");
	}


	@Test(groups = { "normal" })
	public void normalTest() {
		System.out.println("Normal test 1");
	}


	@Test(groups = { "slow" })
	public void aSlowTest() {
		System.out.println("Slow test 1");
	}

}
