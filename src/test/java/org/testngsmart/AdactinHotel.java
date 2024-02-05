package org.testngsmart;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinHotel extends BaseClassAdactin {
	

@BeforeClass
public void browserLaunch() {
	browserLaunch();
	max();
	getPageUrl("https://adactinhotelapp.com");
	System.out.println("Launched the URL");
	
}
	
@BeforeMethod
public void start() {
	findsysDateTime();
}

@Parameters({"username","password"})
@Test
public void testCase1(String name, String pass){
	
	PojoAdactin p = new PojoAdactin();
	
	applyWaitToAllElements();
	 
	 fill(p.getAdactinusername(),name);
	 
	 fill(p.getAdactinpassword(),pass);
	 
	 btnClick(p.getClicklogin());

	System.out.println("Login completed successfully");
}


@BeforeMethod
private void endTime()
{
	findsysDateTime();
}
	
	}
	



