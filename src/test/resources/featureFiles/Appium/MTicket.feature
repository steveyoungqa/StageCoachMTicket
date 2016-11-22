@mTicket
Feature: Debug

  Scenario Outline: Register a New User on a Mobile Device (Chrome)
    Given I am using Appium to run APK automation tests for device "<Device>" and Android version "<Version>"
    And I am using the "<APK>" local path
    Then I launch the App on the Device
    Then I validate the Virgin Trains Splash screen is displayed
    And I select the Skip button
    Then I select Buy Tickets
#    And I select Help & Info

    Examples:
      | Device                 | Version | APK                                                                                                |
      | Nexus_7_API_22         | 5.1     | /Users/youngey/Documents/JVMProjects/Appium/Stagecoach-MTicket-Mobile-Android-Dev-b6-6-release.apk |
#      | Nexus_5_API_22         | 5.1     | /Users/youngey/Documents/JVMProjects/Appium/Stagecoach-MTicket-Mobile-Android-Dev-b6-6-release.apk |
#      | Samsung_S5_API_22      | 5.1     | /Users/youngey/Documents/JVMProjects/Appium/Stagecoach-MTicket-Mobile-Android-Dev-b6-6-release.apk |
#      | Samsung_S4_Mini_API_22 | 5.1     | /Users/youngey/Documents/JVMProjects/Appium/Stagecoach-MTicket-Mobile-Android-Dev-b6-6-release.apk |



