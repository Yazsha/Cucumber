package org.testngsmart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoAdactin extends BaseClassAdactin{
	
	public PojoAdactin() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Login Details
	
	@ CacheLookup
	@FindBy(name="username")
	private WebElement adactinusername;
	
	@ CacheLookup
	@FindBy(id="password")
	private WebElement adactinpassword;
	
	
	@ CacheLookup
	@FindBy(id="login")
	private WebElement clicklogin;


	public WebElement getAdactinusername() {
		return adactinusername;
	}


	public void setAdactinusername(WebElement adactinusername) {
		this.adactinusername = adactinusername;
	}


	public WebElement getAdactinpassword() {
		return adactinpassword;
	}


	public void setAdactinpassword(WebElement adactinpassword) {
		this.adactinpassword = adactinpassword;
	}


	public WebElement getClicklogin() {
		return clicklogin;
	}


	public void setClicklogin(WebElement clicklogin) {
		this.clicklogin = clicklogin;
	}
	
	
	
	
}
