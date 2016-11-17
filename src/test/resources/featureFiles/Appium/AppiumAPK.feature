@appiumAPK
Feature: Debug

  Scenario Outline: Register a New User on a Mobile Device (Chrome)
    Given I am using Appium to run APK automation tests for device "<Device>" and Android version "<Version>"
    And I am using the "<APK>" local path
    Then I launch the App on the Device
    And I run some Example Tests

    Examples:
      | Device                        | Version | APK                                                                 |
      | Samsung_Galaxy_S7_Edge_API_22 | 5.1     | /Users/syn3286/Documents/Appium/uk.co.nationalrail.google.8.2.2.apk |