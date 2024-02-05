package org.testngdemo;

import java.io.IOException;
import java.util.Date;

import org.helper.PojoClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleAdactinHotel extends Utilityclass {

	@BeforeClass
	public void beforeclass() {
		loadEdge();
		lanchUrl("https://adactinhotelapp.com/");
		System.out.println("Edge browser launched successfully");

	}
	@BeforeMethod
	public void beforeTest() {
	Date d = new Date();
	System.out.println("Test Starts ........"+ d);
	
	}
	@Parameters({ "userid", "userpass" })
	@Test
	public void tc1(String name, String pass) {
		PojoClass p = new PojoClass();
		enterText(p.getUname(), name);
		enterText(p.getPasswd(), pass);
		clickElement(p.getBtnLogin());

	}

	@Parameters({ "loc", "hotelname", "roomType", "numofrooms", "checkindate", "checkoutdate", "adultsperRoom",
			"childrenperRoom"}) 
	@Test
	public void tc2(String locat, String selhotel, String rmtype, String rmnum, String checkindate, String checkoutdate,
			String numofadults, String numofkids)  {

		PojoClass p = new PojoClass();
		
		enterText(p.getHotelLoc(), locat);
		enterText(p.getHotelsname(), selhotel);
		selByVal(p.getRoomtype(), rmtype);
		selByVal(p.getNoOfRooms(), rmnum);
		enterText(p.getCheckIn(), checkindate);
		enterText(p.getCheckout(), checkoutdate);
		selByVal(p.getAdultPerRoom(), numofadults);
		selByVal(p.getChildPerRoom(), numofkids);
		clickElement(p.getSearch());
		clickElement(p.getRadiobutton());
		clickElement(p.getContinue());
	}
	@Parameters({"Firstname", "lastname", "address", "cardnum", "cardtype", "expirymonth", "expiryyear",
			"cvv" })
@Test
public void tc3(String fname, String lstname, String add, String cardno,
		String cardty, String exmon, String exyr, String cvvno){
	
		PojoClass p = new PojoClass();
		
		enterText(p.getFirstName(),fname);
		enterText(p.getLastName(),lstname);
		enterText(p.getAddress(), add);
		enterText(p.getCreditCardNumber(), cardno);
		enterText(p.getCreditCardType(), cardty);
		selByVal(p.getExpiryMonth(), exmon);
		selByVal(p.getExpiryYear(), exyr);
		enterText(p.getCcvNumber(), cvvno);
		clickElement(p.getBooking());
		System.out.println("Booked the hotel successfully");
	}
    @AfterMethod
      
	public void afterTest() {
    	Date d = new Date(); 
	System.out.println("Test successfuly ended"+d);
		
	}

	@Test
	public void tc4() throws IOException, InterruptedException {
		PojoClass p = new PojoClass();
		Thread.sleep(6000);
		String ordNo = gettAttribute(p.getOrderNo(),"value");
		
		System.out.println(ordNo);

	}
	
		
		
	}


