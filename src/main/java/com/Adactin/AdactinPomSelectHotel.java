package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPomSelectHotel {

private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelect() {
		return Select;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
    @FindBy(id="radiobutton_0")
	private WebElement Select;
    
	@FindBy(id="continue")
	private WebElement Continue;
	
	@FindBy(id="cancel")
	private WebElement cancel;
	
	public WebElement getCancel() {
		return cancel;
	}

	public AdactinPomSelectHotel(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
		  
	}



}
