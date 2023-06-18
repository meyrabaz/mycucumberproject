@excel_automation
Feature: excel_automation
  Scenario: TC01_login_customer
    Given user tries to login as "customer_info"
    Then verify the default page is visible
#    DT
#    Then verify the login is successful
    Then capture the screenshot
    Then close the application