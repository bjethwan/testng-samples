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
		System.out.println(Thread.currentThread().getName() + ": Fast test 1");
	}

	@Test(groups = { "fast" })
	public void bFastTest() {
		System.out.println(Thread.currentThread().getName() + ": Fast test 2");
	}
	
	@Test(groups = { "fast", "brokenTest" })
	public void bbFastTest() {
		System.out.println(Thread.currentThread().getName() + ": Fast test 2 (Broken!!!!)");
	}

	@Test(groups = { "fast", "slow" })
	public void cFastSlowTest() {
		System.out.println(Thread.currentThread().getName() + ": Fast slow test 1");
	}

	@Test(groups = { "fast", "slow" })
	public void dFastSlowTest() {
		System.out.println(Thread.currentThread().getName() + ": Fast slow test 2");
	}

	@Test(groups = { "normal" })
	public void normalTest() {
		System.out.println(Thread.currentThread().getName() + ": Normal test 1");
	}

	@Test(groups = { "slow" })
	public void aSlowTest() {
		System.out.println(Thread.currentThread().getName() + ": Slow test 1");
	}

}
