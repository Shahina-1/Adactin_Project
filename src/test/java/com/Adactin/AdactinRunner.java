package com.Adactin;

import org.openqa.selenium.WebDriver;

public class AdactinRunner extends AdactinBase {

public static void main(String[] args)  {
		
		WebDriver driver = browserlaunch("https://adactinhotelapp.com/");	
		
		AdactinPom a = new AdactinPom(driver);
		sendkeys(a.getUsername(),"Shahina5");
		sendkeys(a.getPassword(),"Shahin");
		a.getLogin().click();
		
		AdactinPomSearchHotel b = new AdactinPomSearchHotel(driver);
		selectbyvisibletext_Dropdown(b.getSelectLocation(),"London");
		selectbyvisibletext_Dropdown(b.getSelectHotel(),"Hotel Sunshine");
		selectbyvisibletext_Dropdown(b.getSelectRoomType(),"Deluxe");
		selectbyvalue_Dropdown(b.getNumberOfRoom(),"2");
		b.getCheckIn().clear();
		sendkeys(b.getCheckIn(),"05/08/2023");
		b.getCheckOut().clear();
		sendkeys(b.getCheckOut(),"10/08/2023");
		selectbyvalue_Dropdown(b.getAdults(),"2");
		selectbyvalue_Dropdown(b.getChildren(),"1");
		b.getSearch().click();	
		
		AdactinPomSelectHotel c = new AdactinPomSelectHotel(driver);
		c.getSelect().click();
		c.getContinue().click();
		
		AdactinPomBookHotel d = new AdactinPomBookHotel(driver);
		sendkeys(d.getFirstName(),"sha");
		sendkeys(d.getLastName(),"ba");
		sendkeys(d.getAddress(),"1,ABC street");
		sendkeys(d.getCreditCardNo(),"1234567890098765");
		selectbyvisibletext_Dropdown(d.getSelectCardType(),"VISA");
		selectbyvalue_Dropdown(d.getSelectMonth(),"8");
		selectbyvalue_Dropdown(d.getSelectYear(),"2022");
		sendkeys(d.getCVVNo(),"098");
		d.getCancel().click();
		
		AdactinPomSelectHotel e = new AdactinPomSelectHotel(driver);
		e.getCancel().click();
		
		AdactinPomSearchHotel f = new AdactinPomSearchHotel(driver);
		f.getReset().click();
		
	}
	
	 


}
