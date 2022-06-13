@smoke
Feature: User could search for any product

  Scenario: User could search for any product

    Given type "Apple" on search text box
    When click on SEARCH button or hit enter key

    Then User could find Apple products

  Scenario: User search for products with SKU

    Given type "AP_MBP_13" on search text box
    When click on SEARCH button or hit enter key

    Then User could find Apple product