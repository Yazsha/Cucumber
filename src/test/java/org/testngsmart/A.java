package org.testngsmart;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	
	@Test
	private void tc11() {
		
		System.out.println("Test11");
		
	}
	@Test	
private void tc12() {
	
	System.out.println("Test12");
	Assert.assertTrue(true, "verify the assert");
}
	@Test(retryAnalyzer=Failed.class)
private void tc13() {
	
	
		
		System.out.println("Test13");
Assert.assertTrue(false, "Verify the assert");
	
	}
	
}
