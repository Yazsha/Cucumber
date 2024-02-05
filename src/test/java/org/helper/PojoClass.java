package org.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testngdemo.Utilityclass;

public class PojoClass extends Utilityclass{
	
	public PojoClass() {
		
		PageFactory.initElements(driver,this);
	}
	
	//WebElement username=driver.findElement(By.id("username"));
	@FindBy(id="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement passwd;
	
	@FindBy(id="login")
	WebElement btnLogin;
	
	@FindBy(name="location")
	WebElement hotelLoc;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotelsname;

	@FindBy(id="room_type")
	private WebElement roomtype;

	@FindBy(id="room_nos")
	private WebElement noOfRooms;

	@FindBy(id="datepick_in")
	private WebElement checkIn;

	@FindBy(id="datepick_out")
	private WebElement checkout;

	@FindBy(id="adult_room")
	private WebElement adultPerRoom;

	@FindBy(id="child_room")
	private WebElement childPerRoom;

	@FindBy(id="Submit")
	private WebElement search;
	

	public WebElement getSearch() {
		return search;
	}

	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;

	@FindBy(id="continue")
	private WebElement contEle;

	@FindBy(name="first_name")
	private WebElement firstName;

	@FindBy(id="last_name")
	private WebElement lastName;

	@FindBy(id="address")
	private WebElement address;

	@FindBy(id="cc_num")
	private WebElement creditCardNumber;

	@FindBy(id="cc_type")
	private WebElement creditCardType;

	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;

	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;

	@FindBy(name="cc_cvv")
	private WebElement ccvNumber;

	@FindBy(id="order_no")
	private WebElement orderNo;
	
	@FindBy(name="book_now")
	private WebElement booking;

	                                                
	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getBooking() {
		return booking;
	}

	public WebElement getHotelsname() {
		return hotelsname;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	


	public WebElement getRadiobutton() {
		return radiobtn;
	}

	public WebElement getContinue() {
		return contEle;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCcvNumber() {
		return ccvNumber;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getHotelLoc() {
		return hotelLoc;
	}

	public WebElement getUname() {
		return uname;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
