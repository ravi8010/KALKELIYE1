package com.capgemini.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.testbase.TestBase;

public class Payment_Details {
	
	WebDriver driver;	
	
	
	@FindBy(id="txtCardholderName")
	WebElement cardHolderName;
	

	@FindBy(name="debit")
	WebElement debit;
	
	
	@FindBy(name="cvv")
	WebElement cvv;
	

	@FindBy(name="month")
	WebElement month;

	@FindBy(name="year")
	WebElement year;
	
	@FindBy(id="btnPayment")
	WebElement confirmButton;
	
	
	
	
	


	public Payment_Details() throws InterruptedException {
		super();
		driver=TestBase.Initialisation();
		PageFactory.initElements(driver, this);
	}
	
	public void openPaymentDetails() throws InterruptedException
	{
		String projectLocation=System.getProperty("user.dir");
		driver.get(projectLocation+	"\\WebContent\\PaymentDetails.html");
		
		Thread.sleep(1000);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	
	
	public void setCardHolderName(String string) {
		cardHolderName.click();
		cardHolderName.sendKeys(string);
	}

	public void setDebit(String string) {
		debit.click();
		debit.sendKeys(string);
	}

	public void setCvv(String string) {
		cvv.click();
		cvv.sendKeys(string);
	}

	public void setMonth(String string) {
		month.click();
		month.sendKeys(string);
	}

	public void setYear(String string) {
		year.click();
		year.sendKeys(string);
	}
	
	public void clickConfirmButton()
	{
		confirmButton.click();
	}
	
	public String showmessage()
	{
		return "conference Room Booking successfully done";
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
