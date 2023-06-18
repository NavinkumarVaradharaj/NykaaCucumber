@RegressionTest
Feature: Testing the Product purchasing in Nykaa 
  I want to use this template for my feature file

  
  Scenario: User login into the website
    Given User launch the application
    When User click the signIn option
    And User enter "9345845131" as mobile number
    And User click the proceed button
    And User enter the otp and verify
    Then User navigate to User Home Page
    
    Scenario: User search for baby powder 
    When user able to view baby powder
    Then user able to view list of baby powder
    
    Scenario: User select the himalaya baby powder
    When user able to select the himalaya powder
    And user able to change the size using dropdown
    And user able to add the product into bag
    And user able to open the bag
    And user able to change the required quantity
    And user able to proceed with the required quantity
    
    Scenario: User Pay using the Credit card
    When user able to enter credit card number
    And user able to enter expiry date
    And user able to enter cvv number
    And user able to pay using credit card
    And user take the screenshot if payment failed
    
    
   
   
	