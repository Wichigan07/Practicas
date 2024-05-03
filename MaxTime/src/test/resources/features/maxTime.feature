# Autor: Kevin Gonzalez
  @stories
  Feature: MaxTime
    @scenario1
    Scenario: Fill the working day in maximum time
      Given that I have worked the nine working hours
      When I request to fill the working day
      Then the working day must be filled with the nine working hours



