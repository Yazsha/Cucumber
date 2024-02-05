package org.smarttestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {

	@BeforeClass
	private void launchBrower()
	{
		System.out.println("browser launch");
		
		}
	
	@BeforeMethod
	private void startTime()
	{
		System.out.println("starttime");
		
}
	@AfterMethod
	private void endTime()
	{
		System.out.println("end");
		
	}
	@AfterClass
	private void closeBrower() {
		
		System.out.println("close browser");
	}
	@Test
	private void tc3()
	{
		System.out.println("tc3");	
	}
	@Test
	private void tc2()
	{
		System.out.println("tc2");	
	}
	@Test
	private void tc1()
	{
		System.out.println("tc1");	
	}
	
}
