Feature: Login Feature for Guru99 pages

  @SmokeTest
Scenario: Login to guru99 Demo site
  Given User is in Login Page
  When  UserName and Password fields are visible
  Then Enter username and password and Click on Login Button
  Then Users Should be able to go HomePage

