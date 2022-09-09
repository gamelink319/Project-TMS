Feature: Login Staff
  
  @tag1
  Scenario: Staff not type NIK
    When Staff go to web ptdika
    And Staff enter password
    And Staff click button login
    Then Staff invalid login

	@tag2    
  Scenario: Staff not type password
    When Staff enter NIK
    And Staff click button login
    Then Staff invalid login
    
  @tag3
  Scenario: Staff invalid login
    When Staff enter NIK password invalid
    And Staff click button login
    Then Staff invalid login
    
  @tag3
  Scenario: Staff valid login
    When Staff enter NIK password valid
    And Staff click button login
    Then Staff valid login

