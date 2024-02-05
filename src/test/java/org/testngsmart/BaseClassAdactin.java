package org.testngsmart;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassAdactin {
	
	public static WebDriver driver;
	
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void loadEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	public static void max() 
	{
		driver.manage().window().maximize();
	}
	
	
	public static void getPageUrl(String url) 
	{
		driver.get(url);
		
	}
	
    public static void fill(WebElement element ,String text)
    {
	element.sendKeys(text);
    }
    
    public static void btnClick(WebElement element) 
    {
	element.click();
    }
    public static void pageTitle() 
    {
	String title = driver.getCurrentUrl();
	System.out.println(title);
    }
    public static void closeBrowser() 
    {
	driver.close();
    }
                 
	public static void applyWaitToAllElements() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
		
		public static void takeSnap (String filename) throws IOException 
		{ TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\User\\eclipse-workspace\\SeleniumProject\\screen\\+ filename + .png");
		FileUtils.copyFile(src, des);
				
		 
		}
		public void findsysDateTime() {
			Date d= new Date();
			System.out.println(d);

		}
		
}
	

