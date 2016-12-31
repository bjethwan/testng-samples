package sample3;

import java.io.IOException;

import org.testng.annotations.Test;

public class SimpleTest {

	@Test(expectedExceptions={IOException.class}, expectedExceptionsMessageRegExp=".* Message .*")
	public void exceptionMsgTestOne() throws Exception{
		throw new IOException("Pass Message Test");
	}
	
	//This has to fail.
	@Test(expectedExceptions={IOException.class}, expectedExceptionsMessageRegExp="Pass Message Test")
	public void exceptionMsgTestTwo() throws Exception{
		throw new IOException("Fail Message Test");
	}
}