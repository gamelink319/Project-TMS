Feature: Login Staff
  
  @tag1
  Scenario: Staff not type NIK
    When Staff go to web ptdika
    And Staff enter password
    And Staff click button login1
    Then Staff invalid login1

	@tag2    
  Scenario: Staff not type password
    When Staff enter NIK
    And Staff click button login2
    Then Staff invalid login2
    
  @tag3
  Scenario: Staff invalid login
    When Staff enter NIK password invalid
    And Staff click button login3
    Then Staff invalid login3
        
  @tag3
  Scenario: Staff valid login
    When Staff enter NIK password valid
    And Staff click button login4
    Then Staff valid login

