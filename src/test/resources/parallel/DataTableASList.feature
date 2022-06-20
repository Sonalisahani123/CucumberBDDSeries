Feature: User Registration

Scenario: User registration with different data
  Given user is on registraion page
  When user enters following user details
   |sonali|sahani|s.sahani@gmail.com|8888|Bangalore|
   |sunil|sahani|su.sahani@gmail.com|9999|Odisha|
  Then user registration should be successfull