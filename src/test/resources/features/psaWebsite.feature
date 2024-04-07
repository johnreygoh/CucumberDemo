Feature: Testing PSA website functionality

  Scenario: Home page title test
    Given The user is on the PSA home page
    When The user retrieves the title of the page
    Then The title of the page should be "Home | Philippine Statistics Authority | Republic of the Philippines"

  # Add more scenarios for each test case
