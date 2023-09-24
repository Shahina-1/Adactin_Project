package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPomSearchHotel {

private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectLocation() {
		return SelectLocation;
	}

	public WebElement getSelectHotel() {
		return SelectHotel;
	}

	public WebElement getSelectRoomType() {
		return SelectRoomType;
	}

	public WebElement getNumberOfRoom() {
		return NumberOfRoom;
	}

	public WebElement getCheckIn() {
		return CheckIn;
	}

	public WebElement getCheckOut() {
		return CheckOut;
	}

	public WebElement getAdults() {
		return Adults;
	}

	public WebElement getChildren() {
		return Children;
	}

	public WebElement getSearch() {
		return Search;
	}
	
    @FindBy(id="location")
	private WebElement SelectLocation;
    
	@FindBy(id="hotels")
	private WebElement SelectHotel;
	
	@FindBy(id="room_type")
	private WebElement SelectRoomType;
	
	@FindBy(id="room_nos")
	private WebElement NumberOfRoom;
	
	@FindBy(id="datepick_in")
	private WebElement CheckIn;
	
	@FindBy(id="datepick_out")
	private WebElement CheckOut;
	
	@FindBy(id="adult_room")
	private WebElement Adults;
	
	@FindBy(id="child_room")
	private WebElement Children;
	
	@FindBy(id="Submit")
	private WebElement Search;
	
	@FindBy(id="Reset")
	private WebElement Reset;
	
	public WebElement getReset() {
		return Reset;
	}

	public AdactinPomSearchHotel(WebDriver driver) {
		    this.driver=driver;
		    PageFactory.initElements(driver,this);
	}



}
