@mTicket
Feature: Hamburger Menu Options

  Scenario Outline: Access all menu options on the Hamburger menu Jira SMT-94
    Given I am using Appium to run APK automation tests for device "<Device>" and Android version "<Version>"
    And I am using the "<APK>" local path
    Then I launch the App on the Device

    Then I validate the Virgin Trains Splash screen is displayed

    And I select the Skip button
    And I select the Login button
    Then I enter an Email address of "<Email>"
    And I enter a Password of "<Password>"
    Then I enter a Device Name of "<Device Name>"
    Then I select the LogOut button
    And I confirm to LogOut
    And I confirm to Cancel

    Then I select Register

    Then I select to Open the Hamburger Menu
    And I select Passenger Charter from the Menu
    And I select the Back button on the device
    Then I select to Open the Hamburger Menu
    And I select Live Travel Updates from the Menu
    And I select the Back button on the device
    Then I select to Open the Hamburger Menu
    And I select How busy is my train from the Menu
    And I select the Back button on the device
    Then I select to Open the Hamburger Menu
    And I select Journey Planner from the Menu
    And I select the Back button on the device
    Then I select to Open the Hamburger Menu
    And I select Settings from the Menu
    Then I select to Open the Hamburger Menu

    And I select Help from the Menu
    Then I select the How do I activate and use my m-ticket link
    And I select the Back button on the device
    Then I select the Where do I find my m-ticket link
    And I select the Back button on the device
    Then I select the What Journey/ticket types are available link
    And I select the Back button on the device
    Then I select the How do I transfer my m-ticket to another device link
    And I select the Back button on the device
    Then I select to Open the Hamburger Menu

    And I select Feedback from the Menu
    And I select the Back button on the device
    And I select the Back button on the device
    Then I select to Open the Hamburger Menu
    And I select Live Train Times from the Menu
    And I select the Back button on the device
    Then I select to Open the Hamburger Menu
    And I select About from the Menu
    Then I select to Open the Hamburger Menu
    And I select Social Hub from the Menu
    And I select the Back button on the device
    Then I select to Open the Hamburger Menu
    And I select Download Beam App from the Menu
    And I select the Back button on the device
    Then I select to Open the Hamburger Menu
    And I select Home from the Menu

    Then I select Buy Tickets
    And I select the Back button on the device
    And I select Ticket Wallet
    And I select the Back button on the device
    And I select My Account
    And I select the Back button on the device
    And I select Help & Info
    Then I select to Open the Hamburger Menu
    Then I select to Close the Hamburger Menu

    Examples:
      | Device                | Version | APK                                                                                      |
      | Galaxy_S7_Edge_API_22 | 5.1     | /Users/steveyoung/Documents/Repos/MTicket-development-debug.apk                          |
#      | Nexus_7_API_22        | 5.1     | /Users/steveyoung/Documents/Repos/MTicket-development-debug.apk                          |
#      | Nexus_One_API_22      | 5.1     | /Users/steveyoung/Documents/Repos/MTicket-development-debug.apk                          |
#      | Nexus_7_API_22        | 5.1.1   | /Users/steveyoung/Documents/Repos/Stagecoach-MTicket-Mobile-Android-Dev-b6-6-release.apk |
#      | Nexus_One_API_22      | 5.1.1   | /Users/steveyoung/Documents/Repos/Stagecoach-MTicket-Mobile-Android-Dev-b6-6-release.apk |



