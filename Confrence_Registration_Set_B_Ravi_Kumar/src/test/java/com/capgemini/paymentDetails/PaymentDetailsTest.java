package com.capgemini.paymentDetails;

import static org.junit.Assert.assertEquals;

import com.capgemini.pages.Payment_Details;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentDetailsTest {
	
	
	Payment_Details pd;
	
	
	@Given("^User open the webbrowser\\.$")
	public void user_open_the_webbrowser() throws Throwable {
		pd= new Payment_Details();
		
		
	  
	}

	@Given("^Open the paymentDetails\\.html page\\.$")
	public void open_the_paymentDetails_html_page() throws Throwable {
	   
		pd.openPaymentDetails();
	}

	@Then("^validate the payment_page title as \"([^\"]*)\"\\.$")
	public void validate_the_payment_page_title_as(String arg1) throws Throwable {
		assertEquals(arg1, pd.getTitle());
		Thread.sleep(2000);
		pd.quitPage();
	  
	}

	

	@When("^Payment  button is clicked without entering the Card Holder Name in the text box\\.$")
	public void payment_button_is_clicked_without_entering_the_Card_Holder_Name_in_the_text_box() throws Throwable {
	   
		 
		pd.setCardHolderName("");
		pd.setDebit("9876543210321456");
		pd.setCvv("256");
		pd.setMonth("12");
		pd.setYear("2020");
		pd.clickConfirmButton();
	}

	@Then("^show the error message as \"([^\"]*)\"\\.$")
	public void show_the_error_message_as(String arg1) throws Throwable {
		String alertMessage = pd.getMessage();
		if (alertMessage != null)
			assertEquals(alertMessage, arg1);
		pd.quitPage();
	  
	}

	@When("^Payment button is clicked without entering the Debit card Number in the text box\\.$")
	public void payment_button_is_clicked_without_entering_the_Debit_card_Number_in_the_text_box() throws Throwable {
	   
		pd.setCardHolderName("ravi");
		pd.setDebit("");
		pd.setCvv("256");
		pd.setMonth("12");
		pd.setYear("2020");
		pd.clickConfirmButton();
	}

	@When("^Payment  button is clicked without entering the Card expiration month in the text box\\.$")
	public void payment_button_is_clicked_without_entering_the_Card_expiration_month_in_the_text_box() throws Throwable {
		pd.setCardHolderName("ravi");
		pd.setDebit("9876543210321456");
		pd.setCvv("256");
		pd.setMonth("");
		pd.setYear("2020");
		pd.clickConfirmButton();
	  
	}

	@When("^Payment  button is clicked without entering the Card expiration year in the text box\\.$")
	public void payment_button_is_clicked_without_entering_the_Card_expiration_year_in_the_text_box() throws Throwable {
		pd.setCardHolderName("ravi");
		pd.setDebit("9876543210321456");
		pd.setCvv("256");
		pd.setMonth("12");
		pd.setYear("");
		pd.clickConfirmButton();
	  
	}

	@When("^Payment button is clicked\\.$")
	public void payment_button_is_clicked() throws Throwable {
		pd.setCardHolderName("ravi");
		pd.setDebit("9876543210321456");
		pd.setCvv("256");
		pd.setMonth("12");
		pd.setYear("2020");
		pd.clickConfirmButton();
	  
	}

	@Then("^show message as \"([^\"]*)\"$")
	public void show_message_as(String arg1) throws Throwable {
		pd.showmessage();
	  
	}
	
	
	



}
