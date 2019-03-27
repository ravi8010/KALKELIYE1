package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import com.capgemini.pages.ConfrenceRegistration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferenceRegistrationTest {
	ConfrenceRegistration confReg;

	@Given("^User open the web browser\\.$")
	public void user_open_the_web_browser() throws Throwable {
		
		
		confReg=new ConfrenceRegistration();
		
	
	}

	@Given("^Open the ConferenceRegistration\\.html page\\.$")
	public void open_the_ConferenceRegistration_html_page() throws Throwable {
		
		confReg.openConferenceRegPage();
	
	}

	@Then("^validate the page title as \"([^\"]*)\"\\.$")
	public void validate_the_page_title_as(String arg1) throws Throwable {
		
		assertEquals(arg1, confReg.getTitle());
		Thread.sleep(2000);
		confReg.quitPage();
	
	}

	@When("^Confirm Booking button is clicked without entering the First Name in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_First_Name_in_the_text_box() throws Throwable {
	 
		confReg.setFirstName("");
		confReg.setLastName("lastName");
		confReg.setEmail("ravi@gmail.com");
		confReg.setPhone("9876543210");
		
		confReg.setPersons("2");
		
		
		
		confReg.setbRoom("ABC");
		confReg.setAreaName1("agra");
		
		
		confReg.setCity("Pune");
		confReg.setState("Tamilnadu");
		
		confReg.setMemberStatus("sder");
		
		
	}

	

	@When("^Confirm Booking button is clicked without entering the Last Name in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_Last_Name_in_the_text_box() throws Throwable {
		
		
		confReg.setFirstName("ravi");
		confReg.setLastName("");
		confReg.setEmail("ravi@gmail.com");
		confReg.setPhone("9876543210");
		
		confReg.setPersons("2");
		
		
		
		confReg.setbRoom("ABC");
		confReg.setAreaName1("agra");
		
		
		confReg.setCity("Pune");
		confReg.setState("Tamilnadu");
		
		confReg.setMemberStatus("sder");
		
	
	}

	@When("^Confirm Booking button is clicked without entering the correct email format in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_correct_email_format_in_the_text_box() throws Throwable {
		
		
		confReg.setFirstName("ravi");
		confReg.setLastName("lastName");
		confReg.setEmail("vigmail.com");
		confReg.setPhone("9876543210");
		
		confReg.setPersons("2");
		
		
		
		confReg.setbRoom("ABC");
		confReg.setAreaName1("agra");
		
		
		confReg.setCity("Pune");
		confReg.setState("Tamilnadu");
		
		confReg.setMemberStatus("sder");
	  
	}

	@When("^Confirm Booking button is clicked without entering the Mobile Number in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_Mobile_Number_in_the_text_box() throws Throwable {
	  
		
		
		
		confReg.setFirstName("ravi");
		confReg.setLastName("lastName");
		confReg.setEmail("ravi@gmail.com");
		confReg.setPhone("");
		
		confReg.setPersons("2");
		
		
		
		confReg.setbRoom("ABC");
		confReg.setAreaName1("agra");
		
		
		confReg.setCity("Pune");
		confReg.setState("Tamilnadu");
		
		confReg.setMemberStatus("sder");
	}

	@When("^Confirm Booking button is clicked without entering the correct Mobile Number format in the text box\\.$")
	public void confirm_Booking_button_is_clicked_without_entering_the_correct_Mobile_Number_format_in_the_text_box() throws Throwable {
	
		
		
		confReg.setFirstName("ravi");
		confReg.setLastName("lastName");
		confReg.setEmail("ravi@gmail.com");
		confReg.setPhone("9");
		
		confReg.setPersons("2");
		
		
		
		confReg.setbRoom("ABC");
		confReg.setAreaName1("agra");
		
		
		confReg.setCity("Pune");
		confReg.setState("Tamilnadu");
		
		confReg.setMemberStatus("sder");
		
		
	}

	@When("^Confirm Booking button is clicked without selecting the Number of people statying at the hotel\\.$")
	public void confirm_Booking_button_is_clicked_without_selecting_the_Number_of_people_statying_at_the_hotel() throws Throwable {
	   
		
		confReg.setFirstName("ravi");
		confReg.setLastName("lastName");
		confReg.setEmail("ravi@gmail.com");
		confReg.setPhone("9876543210");
		
		confReg.setPersons("");
		
		
		
		confReg.setbRoom("ABC");
		confReg.setAreaName1("agra");
		
		
		confReg.setCity("Pune");
		confReg.setState("Tamilnadu");
		
		confReg.setMemberStatus("sder");
		
		
	}

	@When("^Confirm Booking button is clicked without selecting the Building & Room Number\\.$")
	public void confirm_Booking_button_is_clicked_without_selecting_the_Building_Room_Number() throws Throwable {
	
		
		

		confReg.setFirstName("ravi");
		confReg.setLastName("lastName");
		confReg.setEmail("ravi@gmail.com");
		confReg.setPhone("9876543210");
		
		confReg.setPersons("2");
		
		
		
		confReg.setbRoom("");
		confReg.setAreaName1("agra");
		
		
		confReg.setCity("Pune");
		confReg.setState("Tamilnadu");
		
		confReg.setMemberStatus("sder");
		
	}

	@When("^Confirm Booking button is clicked without selecting the area\\.$")
	public void confirm_Booking_button_is_clicked_without_selecting_the_area() throws Throwable {
		
		
		

		confReg.setFirstName("ravi");
		confReg.setLastName("lastName");
		confReg.setEmail("ravi@gmail.com");
		confReg.setPhone("9876543210");
		
		confReg.setPersons("2");
		
		
		
		confReg.setbRoom("ABC");
		confReg.setAreaName1("");
		
		
		confReg.setCity("Pune");
		confReg.setState("Tamilnadu");
		
		confReg.setMemberStatus("sder");
	
	}

	@When("^Confirm Booking button is clicked without selecting the city\\.$")
	public void confirm_Booking_button_is_clicked_without_selecting_the_city() throws Throwable {
		
		

		confReg.setFirstName("ravi");
		confReg.setLastName("lastName");
		confReg.setEmail("ravi@gmail.com");
		confReg.setPhone("9876543210");
		
		confReg.setPersons("");
		
		
		
		confReg.setbRoom("ABC");
		confReg.setAreaName1("agra");
		
		
		confReg.setCity("");
		confReg.setState("Tamilnadu");
		
		confReg.setMemberStatus("sder");
	  
	}

	@When("^Confirm Booking button is clicked without selecting the state\\.$")
	public void confirm_Booking_button_is_clicked_without_selecting_the_state() throws Throwable {
	 
		

		confReg.setFirstName("ravi");
		confReg.setLastName("lastName");
		confReg.setEmail("ravi@gmail.com");
		confReg.setPhone("9876543210");
		
		confReg.setPersons("2");
		
		
		
		confReg.setbRoom("ABC");
		confReg.setAreaName1("agra");
		
		
		confReg.setCity("Pune");
		confReg.setState("");
		
		confReg.setMemberStatus("sder");
		
	}

	@When("^Confirm Booking button is clicked without selecting the membership status\\.$")
	public void confirm_Booking_button_is_clicked_without_selecting_the_membership_status() throws Throwable {
		
		confReg.setFirstName("ravi");
		confReg.setLastName("lastName");
		confReg.setEmail("ravi@gmail.com");
		confReg.setPhone("9876543210");
		
		confReg.setPersons("2");
		
		
		
		confReg.setbRoom("ABC");
		confReg.setAreaName1("agra");
		
		
		confReg.setCity("Pune");
		confReg.setState("Tamilnadu");
		
		confReg.setMemberStatus("");

	  
	}

	@When("^Confirm Booking button is clicked\\.$")
	public void confirm_Booking_button_is_clicked() throws Throwable {
	   
		confReg.setFirstName("ravi");
		confReg.setLastName("lastName");
		confReg.setEmail("ravi@gmail.com");
		confReg.setPhone("9876543210");
		
		confReg.setPersons("2");
		
		
		
		confReg.setbRoom("ABC");
		confReg.setAreaName1("agra");
		
		
		confReg.setCity("Pune");
		confReg.setState("Tamilnadu");
		
		confReg.setMemberStatus("dfef");

		
		
	}

	@Then("^move to the next page with title as \"([^\"]*)\"$")
	public void move_to_the_next_page_with_title_as(String arg1) throws Throwable {
		
		assertEquals(arg1, confReg.getTitle());
		Thread.sleep(2000);
		confReg.quitPage();
		
		
	}
	
	
	@Then("^validate the error message as \"([^\"]*)\"\\.$")
	public void validate_the_error_message_as(String arg1) throws Throwable {
		
		
		String alertMessage = confReg.getMessage();
		if (alertMessage != null)
			assertEquals(alertMessage, arg1);
		confReg.quitPage();
	
	}
	
	
}
