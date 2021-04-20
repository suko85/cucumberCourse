Feature: Application Login

    #Background:
    #Given validate the browser
    #When Browser is triggered
    #Then check if browser is started

  @RegTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username "jin" and password "1234"
    Then Home page is populated
    And Cards displayed are "true"

  @MobileTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username "john" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"

  @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username "john" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"

  @MobileTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username "john" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"


  @SanityTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with foollowing details
    |jenny|abcd|john@abcd.com|Australia|3242353|
    Then Home page is populated
    And Cards displayed are "false"

  @RegTest
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User login in to application with username <userName> and password <password>
    Then Home page is populated
    And Cards displayed are "true"
    Examples:
      | userName | password |
      | user1 | pwd1 |
      | user2 | pwd2 |
      | user3 | pwd3 |
      | user4 | pwd4 |
