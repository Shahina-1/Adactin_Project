package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPomBookHotel {

	
private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getSelectCardType() {
		return SelectCardType;
	}

	public WebElement getSelectMonth() {
		return SelectMonth;
	}

	public WebElement getSelectYear() {
		return SelectYear;
	}

	public WebElement getCVVNo() {
		return CVVNo;
	}

	public WebElement getCancel() {
		return Cancel;
	}
	
    @FindBy(id="first_name")
	private WebElement FirstName;
    
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="cc_num")
	private WebElement CreditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement SelectCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement SelectMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement SelectYear;
	
	@FindBy(id="cc_cvv")
	private WebElement CVVNo;
	
	@FindBy(id="cancel")
	private WebElement Cancel;
	
	public AdactinPomBookHotel(WebDriver driver) {
		     this.driver=driver;
		     PageFactory.initElements(driver,this);
	}
	



}
