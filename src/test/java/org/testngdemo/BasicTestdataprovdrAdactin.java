package org.testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTestdataprovdrAdactin {
	
@Test(dataProvider="loginTestData")
public void TestLogin(String userName,String passWord) throws Exception {
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://adactinhotelapp.com/");
	driver.findElement(By.id("username")).sendKeys(userName);
	driver.findElement(By.name("password")).sendKeys(passWord);
	driver.findElement(By.id("login")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']")).isDisplayed());
	Thread.sleep(5000);
}
@DataProvider(name="loginTestData")
public Object[][] loginData() {
	Object[][] data= new Object[4][2];
	data[0][0]="vaithy2410";
	data[0][1]="vaithy@2410";
	
	data[1][0]="vaithy2410";
	data[1][1]="jdhgf2342";
	
	data[2][0]="yfdduigi";
	data[2][1]="vaithy@2410";
	
	data[3][0]="jsgad";
	data[3][1]="iiopk234";
	
	return data;
	
	}


}