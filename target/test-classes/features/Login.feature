# encoding: iso-8859-1

  #Author: leonardote-10@hotmail.com

Feature: Login
  I as a user of the application
  I want to access the application with my username and password
  To make a purchase

  Scenario Outline: : Successful login
    Given that the User want do login in the application
    When he enter credentials <User> <Password>
    Then he must access the homepage

    Examples:
      | User                      | Password |
      | leonardote-10@hotmail.com | Practic4 |