Feature: Logout Staff

  @tag1
  Scenario: Staff valid loginB1
  	When Staff go to web ptdikaB1
    And Staff enter NIK password validB1
    And Staff click button loginB1
    And Staff click logout pada navbar
    Then Staff masuk ke halaman sign inB1

  @tag2
  Scenario: Staff valid loginB2
  	When Staff enter NIK password validB2
    And Staff click button loginB2
    And Staff click profil
    And Staff click logout pada profil
    Then Staff masuk ke halaman sign inB2
    

   
