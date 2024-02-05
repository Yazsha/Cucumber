package org.testngsmart;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample {

	
	@DataProvider(name="Login")
	public Object[][] data(){
		
		return new Object[][]{
			
			{"First-Value"}, {"Second-Value"}   
			};
					
	}
	
	@Test(dataProvider="Login")
	private void myTest(String a) {
		System.out.println("Passed Parameter Is : " + a);
	}
	
}
