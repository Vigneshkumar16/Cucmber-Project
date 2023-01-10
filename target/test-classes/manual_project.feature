Feature: As a User, I want to Order the Oil

  Scenario: The user downloads the Brochure
    When To lanch the URL of the application
    And click the “About Us” button
    And scroll down and see the Download Brochure (English)
    Then check the Brochure is downloaded

  Scenario: The user purchases the “Harmony”
    When click the “Products” button
    And mouse hover the “Products” button again hovers the “Aroma Oil”
    And select the “Sweet”
    And Users can see the “Harmony” and choose the oil
    And select the volume ml and add quality
    And Then click “Add To Cart”
    Then click the “Process To Checkout”

  Scenario: The user checks the missing product
    When click the “Products” button.
    Then mouse hover the “Products” button and clicks the Car Diffusers
