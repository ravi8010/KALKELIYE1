package com.capgemini.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.capgemini.testbase.TestBase;

public class ConfrenceRegistration {
	
WebDriver driver;	
	
	
	@FindBy(id="txtFirstName")
	WebElement firstName;
	
	@FindBy(name="txtLN")
	WebElement lastName;
	
	@FindBy(name="Email")
	WebElement email;
	
	@FindBy(name="Phone")
	WebElement phone;
	
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[5]/td[2]/select")
	WebElement persons;
	
	@FindBy(name="Address")
	WebElement bRoom;


	@FindBy(name="Address2")
	WebElement areaName;
	
	
	
	@FindBy(name="city")
	WebElement city;
	

	



	@FindBy(name="state")
	WebElement state;
	


	@FindBy(name="memberStatus")
	WebElement memberStatus;
	
	
	
	

	

	public ConfrenceRegistration() throws InterruptedException {
		super();
		driver=TestBase.Initialisation();
	}
	
	public void openConferenceRegPage() throws InterruptedException
	{
		String projectLocation=System.getProperty("user.dir");
		driver.get(projectLocation+	"\\WebContent\\ConferenceRegistartion.html");
		PageFactory.initElements(driver, this);
		Thread.sleep(1000);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	
	public void setFirstName(String string) {
		firstName.click();
		firstName.sendKeys(string);
	}

	public void setLastName(String string) {
		lastName.click();
		lastName.sendKeys(string);
	}

	public void setEmail(String string) {
		email.click();
		email.sendKeys(string);
	}

	public void setPhone(String string) {
		phone.click();
		phone.sendKeys(string);
	}

	public void setCity(String string) {
		Select city1 = new Select(city);
		city1.selectByVisibleText(string);
	}

	public void setState(String string) {
		Select state1 = new Select(state);
		state1.selectByVisibleText(string);
	}

	public void setPersons(String string) {
		Select persons1 = new Select(persons);
		persons1.selectByVisibleText(string);
	}

	public void setAreaName1(String areaName1) {
	areaName.click();
	areaName.sendKeys(areaName1);
	}
	
	
	

	public void setbRoom(String broom) {
		bRoom .click();
		bRoom.sendKeys(broom);
	}

	

	public void setMemberStatus(String arg1) {
		memberStatus.click(); 
		memberStatus.sendKeys(arg1);
	}
	
	
	
	

	public void quitPage()
	{
		driver.close();
	}
	
	
	public String getMessage()
	{
		String alertMessage=null;
		if (this.isAlertPresent()) {
			alertMessage=driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
		}
		return alertMessage;
	}
	
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}


}
