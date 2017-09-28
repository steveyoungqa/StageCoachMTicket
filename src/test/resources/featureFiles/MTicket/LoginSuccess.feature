@loginSuccess
Feature: Login page (2.a / 2.b) - Login - successful Jira SMT-92

  Scenario Outline: Login with existing user
    Given I am using Appium to run APK automation tests for device "<Device>" and Android version "<Version>"
    And I am using the "<APK>" local path
    Then I launch the App on the Device
    Then I validate the Virgin Trains Splash screen is displayed
#    And I select the Login button
#    Then I enter an Email address of "<Email>"
#    And I enter a Password of "<Password>"
#    Then I enter a Unique Device Name of "<Device Name>"
#    And I select the Login button
    Then I select to Open the Hamburger Menu
    And I select Passenger Charter from the Menu
    And I select the Back button on the device
#    Then I select the LogOut button
#    And I confirm to LogOut
#    And I confirm to Cancel



    Examples:
      | Device                | Version | APK                                                                               | Email            | Password  | Device Name          |
      | Galaxy_S7_Edge_API_22 | 5.1     | /Users/steveyoung/Documents/Repos/stagecoach-mticket-automation/m-ticket-rspa.apk | klaudia@dogfi.sh | Password2 | Automation Galaxy S7 |
#      | Galaxy_S7_Edge_API_22 | 5.1     | /Users/steveyoung/Documents/Repos/stagecoach-mticket-automation/oldMTicket.apk | klaudia@dogfi.sh | Password2 | Automation Galaxy S7 |
#      | Nexus_7_API_22        | 5.1     | /Users/steveyoung/Documents/Repos/MTicket-development-debug.apk                          |                |          |                      |
#      | Nexus_One_API_22      | 5.1     | /Users/steveyoung/Documents/Repos/MTicket-development-debug.apk                          |                |          |                      |
#      | Nexus_7_API_22        | 5.1.1   | /Users/steveyoung/Documents/Repos/Stagecoach-MTicket-Mobile-Android-Dev-b6-6-release.apk |                |          |                      |
#      | Nexus_One_API_22      | 5.1.1   | /Users/steveyoung/Documents/Repos/Stagecoach-MTicket-Mobile-Android-Dev-b6-6-release.apk |                |          |                      |



