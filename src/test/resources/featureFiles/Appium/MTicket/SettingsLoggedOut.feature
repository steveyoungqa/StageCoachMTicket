@settingsLogOut
Feature: Settings Page -Logged out User Jira SMT-151

  Scenario Outline: Register a New User on a Mobile Device (Chrome)
    Given I am using Appium to run APK automation tests for device "<Device>" and Android version "<Version>"
    And I am using the "<APK>" local path
    Then I launch the App on the Device
    Then I validate the Virgin Trains Splash screen is displayed
    And I select the Skip button
    Then I select to Open the Hamburger Menu
    And I select Settings from the Menu


    Examples:
      | Device                | Version | APK                                                                                      |
      | Galaxy_S7_Edge_API_22 | 5.1     | /Users/steveyoung/Documents/Repos/MTicket-development-debug.apk                          |
#      | Nexus_7_API_22        | 5.1     | /Users/steveyoung/Documents/Repos/MTicket-development-debug.apk                          |
#      | Nexus_One_API_22      | 5.1     | /Users/steveyoung/Documents/Repos/MTicket-development-debug.apk                          |
#      | Nexus_7_API_22        | 5.1.1   | /Users/steveyoung/Documents/Repos/Stagecoach-MTicket-Mobile-Android-Dev-b6-6-release.apk |
#      | Nexus_One_API_22      | 5.1.1   | /Users/steveyoung/Documents/Repos/Stagecoach-MTicket-Mobile-Android-Dev-b6-6-release.apk |



