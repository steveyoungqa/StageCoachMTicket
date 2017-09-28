@appiumChrome
Feature: Debug

  Scenario Outline: Register a New User on a Mobile Device (Chrome)
    Given I am using Appium to run Mobile Browser automation tests for device "<Device>" and Android version "<Version>"
    And I am using the "<Url>" url for the mobile browser
    And I close the Mobile Browser


    Examples:
      | Device                        | Version | Url                   | Language | Firstname | Surname | Country | day | month | year |
#      | Nexus_7_API_22                | 5.1     | https://google.co.uk/ | English  | Ted       | Tester  | GB      | 7   | 5     | 1956 |
#      | Galaxy_Tab_4.0_API_22         | 5.1     | https://google.co.uk/  | English  | Ted       | Tester  | GB      | 7   | 5     | 1956 |
      | Samsung_Galaxy_S7_Edge_API_22 | 5.1     | https://google.co.uk/ | English  | Ted       | Tester  | GB      | 7   | 5     | 1956 |