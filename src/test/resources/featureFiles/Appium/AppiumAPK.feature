@appiumAPK
Feature: Debug

  Scenario Outline: Register a New User on a Mobile Device (Chrome)
    Given I am using Appium to run APK automation tests for device "<Device>" and Android version "<Version>"
    And I am using the "<APK>" local path
    Then I launch the App on the Device
    And I run some Example Tests

    Examples:
      | Device                | Version | APK                                                                 |
#      |Galaxy_S6_API_22| 5.1     | /Users/syn3286/Documents/Appium/uk.co.nationalrail.google.8.2.2.apk |
#      |Galaxy_S7_Edge_API_22| 5.1     | /Users/youngey/Documents/JVMProjects/Appium/Stagecoach-MTicket-Mobile-Android-Dev-b6-6-release.apk |
#      |Nexus_7_API_22| 5.1     | /Users/youngey/Documents/JVMProjects/Appium/Stagecoach-MTicket-Mobile-Android-Dev-b6-6-release.apk |
      |Nexus_One_API_22| 5.1     | /Users/youngey/Documents/JVMProjects/Appium/uk.co.nationalrail.google.8.2.2.apk |


#  NEED TO SORT OUT GALAXY S6 & S7 REASON FOR NOT WORKING - NAMING CONVENTION!!!