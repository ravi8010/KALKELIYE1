Feature: This is a  PaymentDetails Page


 Scenario: Verify paymentDetails page title.
    Given User open the webbrowser.
    And Open the paymentDetails.html page.
    Then validate the payment_page title as "Payment Details".



Scenario: Ensure the alert box is displayed.
Given User open the webbrowser.
    And Open the paymentDetails.html page.
    When Payment  button is clicked without entering the Card Holder Name in the text box.
    Then show the error message as "Please fill the Card holder name".
    
      Scenario: Ensure the alert box is displayed.
    Given User open the webbrowser.
    And Open the paymentDetails.html page.
    When Payment button is clicked without entering the Debit card Number in the text box.
    Then show the error message as "Please fill the Debit card Number".
    
    
      Scenario: Ensure the alert box is displayed.
   Given User open the webbrowser.
    And Open the paymentDetails.html page.
    When Payment  button is clicked without entering the Card expiration month in the text box.
    Then show the error message as "Please fill expiration month".
    
    Scenario: Ensure the alert box is displayed.
    Given User open the webbrowser.
    And Open the paymentDetails.html page.
    When Payment  button is clicked without entering the Card expiration year in the text box.
    Then show the error message as "Please fill the expiration year".
    
      Scenario: Nentering valid data.
      Given User open the webbrowser.
    And Open the paymentDetails.html page.
    When Payment button is clicked.
    Then show message as "Conference Booking Successfully done"