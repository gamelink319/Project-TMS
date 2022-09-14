Feature: Login Staff
  
  @tag1
  Scenario: Staff not type NIK
    When Staff go to web ptdikaA1
    And Staff enter password
    And Staff click button loginA1
    Then Staff invalid loginA1

	@tag2    
  Scenario: Staff not type password
    When Staff go to web ptdikaA2
    And Staff enter nik
    And Staff click button loginA2
    Then Staff invalid loginA2
    
  @tag3
  Scenario: Staff invalid login
  	When Staff go to web ptdikaA3
    And Staff enter NIK password invalid
    And Staff click button loginA3
    Then Staff invalid loginA3
        
  @tag3
  Scenario: Staff valid login
  	When Staff go to web ptdikaA4
    And Staff enter NIK password valid
    And Staff click button loginA4
    Then Staff valid login

