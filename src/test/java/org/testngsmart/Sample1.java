package org.testngsmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {
	
	@Test
	private void tc1() {
		
		System.out.println("hai");
	}
}
