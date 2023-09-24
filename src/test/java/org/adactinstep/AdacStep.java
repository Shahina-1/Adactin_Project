package org.adactinstep;

import org.openqa.selenium.WebDriver;

import com.Adactin.AdactinBase;
import com.Adactin.AdactinPom;
import com.Adactin.AdactinPomBookHotel;
import com.Adactin.AdactinPomSearchHotel;
import com.Adactin.AdactinPomSelectHotel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AdacStep extends AdactinBase {

	public WebDriver driver;
	public AdactinPom a;
	public AdactinPomSearchHotel b;
	public AdactinPomSelectHotel c;
	public AdactinPomBookHotel d;
	
	@Given("Launch browser and Url")
	public void launch_browser_and_url() {
		driver = browserlaunch("https://adactinhotelapp.com/");
	}
	@Given("Pass the username")
	public void pass_the_username() {
		a = new AdactinPom(driver);
		sendkeys(a.getUsername(),"Shahina5");
	}
	@Given("Pass the password")
	public void pass_the_password() {
		a = new AdactinPom(driver);
		sendkeys(a.getPassword(),"Shahin");
	}
	@Then("click the login")
	public void click_the_login() {
		a = new AdactinPom(driver);
	    a.getLogin().click();
	}
	
	@Given("Select Location")
	public void select_location() {
		b = new AdactinPomSearchHotel(driver);
		selectbyvisibletext_Dropdown(b.getSelectLocation(),"London");
	}
	@Given("Select Hotel")
	public void select_hotel() {
		 b = new AdactinPomSearchHotel(driver);
		 selectbyvisibletext_Dropdown(b.getSelectHotel(),"Hotel Sunshine");
	}
	@Given("Select RoomType")
	public void select_room_type() {
		b = new AdactinPomSearchHotel(driver);
	    selectbyvisibletext_Dropdown(b.getSelectRoomType(),"Deluxe");
	}
	@Given("Number of Rooms")
	public void number_of_rooms() {
		 b = new AdactinPomSearchHotel(driver);
		 selectbyvalue_Dropdown(b.getNumberOfRoom(),"2");
	}
	@Given("CheckIn")
	public void check_in() {
		 b = new AdactinPomSearchHotel(driver);
		 b.getCheckIn().clear();
	     sendkeys(b.getCheckIn(),"05/08/2023");
	}
	@Given("CheckOut")
	public void check_out() {
		b = new AdactinPomSearchHotel(driver); 
		b.getCheckOut().clear();
		sendkeys(b.getCheckOut(),"10/08/2023");
	}
	@Given("Number of Adults")
	public void number_of_adults() {
		b = new AdactinPomSearchHotel(driver);
		selectbyvalue_Dropdown(b.getAdults(),"2");
	}
	@Given("Number of Children")
	public void number_of_children() {
		b = new AdactinPomSearchHotel(driver);
		selectbyvalue_Dropdown(b.getChildren(),"1");
	}
	@Then("click the Search")
	public void click_the_search() {
		 b = new AdactinPomSearchHotel(driver);
		 b.getSearch().click();	
	}
	
	@Given("Select the button")
	public void select_the_button() {
		 c = new AdactinPomSelectHotel(driver);
		 c.getSelect().click();
	}
	@Then("click the continue")
	public void click_the_continue() {
		c = new AdactinPomSelectHotel(driver);
		c.getContinue().click();
	}
	
	@Given("Pass the firstname")
	public void pass_the_firstname() {
		 d = new AdactinPomBookHotel(driver);
		 sendkeys(d.getFirstName(),"sha");
	}
	@Given("Pass the lastname")
	public void pass_the_lastname() {
		d = new AdactinPomBookHotel(driver);
		sendkeys(d.getLastName(),"ba");
	}
	@Given("Pass the Address")
	public void pass_the_address() {
		d = new AdactinPomBookHotel(driver);
		sendkeys(d.getAddress(),"1,ABC street");
	}
	@Given("Pass the CreditCardNo")
	public void pass_the_credit_card_no() {
		 d = new AdactinPomBookHotel(driver);
		 sendkeys(d.getCreditCardNo(),"1234567890098765");
	}
	@Given("Select the CreditCardType")
	public void select_the_credit_card_type() {
		 d = new AdactinPomBookHotel(driver);
		 selectbyvisibletext_Dropdown(d.getSelectCardType(),"VISA");
	}
	@Given("Select the Month")
	public void select_the_month() {
		 d = new AdactinPomBookHotel(driver);
		 selectbyvalue_Dropdown(d.getSelectMonth(),"8");
	}
	@Given("Select the Year")
	public void select_the_year() {
		 d = new AdactinPomBookHotel(driver);
		 selectbyvalue_Dropdown(d.getSelectYear(),"2022");
	}
	@Given("Pass the CVVno")
	public void pass_the_cv_vno() {
		 d = new AdactinPomBookHotel(driver);
		 sendkeys(d.getCVVNo(),"098"); 
	}
	@Then("click the cancel")
	public void click_the_cancel() {
		 d = new AdactinPomBookHotel(driver);
		 d.getCancel().click(); 
	}
	@Then("click cancel")
	public void click_cancel() {
		c = new AdactinPomSelectHotel(driver);
		c.getCancel().click();
	}
	@Then("click the Reset")
	public void click_the_reset() {
		b = new AdactinPomSearchHotel(driver);
		b.getReset().click();  
	}


}
