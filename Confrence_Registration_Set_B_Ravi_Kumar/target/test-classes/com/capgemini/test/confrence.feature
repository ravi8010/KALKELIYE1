Feature: This is a conference Booking Page

  Scenario: Verify ConferenceRegistration page title.
    Given User open the web browser.
    And Open the ConferenceRegistration.html page.
    Then validate the page title as "Conference Registartion".
    
    
   
   Scenario: Ensure the alert box is displayed.
   Given User open the web browser.
    And Open the ConferenceRegistration.html page.
    When Confirm Booking button is clicked without entering the First Name in the text box.
    Then validate the error message as "Please fill the First Name".
       
   Scenario: Ensure the alert box is displayed.
   Given User open the web browser.
    And Open the ConferenceRegistration.html page.
    When Confirm Booking button is clicked without entering the Last Name in the text box.
    Then validate the error message as "Please fill the Last Name".
    
    
    
    
    
       Scenario: Ensure the alert box is displayed.
      Given User open the web browser.
    And Open the ConferenceRegistration.html page.
    When Confirm Booking button is clicked without entering the correct email format in the text box.
    Then validate the error message as "Please fill the Email".
    
      Scenario: Ensure the alert box is displayed.
     Given User open the web browser.
    And Open the ConferenceRegistration.html page.
    When Confirm Booking button is clicked without entering the Mobile Number in the text box.
    Then validate the error message as "Please fill the Contact No.".
    
    Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And Open the ConferenceRegistration.html page.
    When Confirm Booking button is clicked without entering the correct Mobile Number format in the text box. 
    # 7,8 or 9 and doesn’t have 10 digits in the text box.
    Then validate the error message as "Please enter valid Contact no.".
    
      
      Scenario: Ensure the alert box is displayed.
    Given User open the web browser.
    And Open the ConferenceRegistration.html page.
    When Confirm Booking button is clicked without selecting the Number of people statying at the hotel.
    Then validate the error message as "Please fill the Number of people attending".
    
    
    
     Scenario: Ensure the alert box is displayed.
     Given User open the web browser.
    And Open the ConferenceRegistration.html page.
    When Confirm Booking button is clicked without selecting the Building & Room Number.
    Then validate the error message as "Please fill the Building & Room No".
    
    
     Scenario: Ensure the alert box is displayed.
     Given User open the web browser.
    And Open the ConferenceRegistration.html page.
    When Confirm Booking button is clicked without selecting the area.
    Then validate the error message as "Please fill the Area name".
    
    
    
     Scenario: Ensure the alert box is displayed.
     Given User open the web browser.
    And Open the ConferenceRegistration.html page.
    When Confirm Booking button is clicked without selecting the city.
    Then validate the error message as "Please select city".
    
    Scenario: Ensure the alert box is displayed.
     Given User open the web browser.
    And Open the ConferenceRegistration.html page.
    When Confirm Booking button is clicked without selecting the state.
    Then validate the error message as "Please select state".
    
    
    
    
    Scenario: Ensure the alert box is displayed.
     Given User open the web browser.
    And Open the ConferenceRegistration.html page.
    When Confirm Booking button is clicked without selecting the membership status.
    Then validate the error message as "Please Select MemeberShip status".
    
    
    
    
        Scenario: Navigates to Success Page on entering valid data.
     Given User open the web browser.
    And Open the ConferenceRegistration.html page.
    When Confirm Booking button is clicked.
    Then move to the next page with title as "Payment Details"