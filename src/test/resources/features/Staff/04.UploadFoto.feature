Feature: Staff select upload foto

  @tag1
  Scenario: Staff not upload foto
  	When Staff go to web ptdikaD1
    And Staff enter own nik and passwordD1
    And Staff click button loginD1
    And Staff click laporan kegiatanD1
    And Staff choose and click absen izinD1
    And Staff clik submitD1
    Then Staff get attributeD1
    
  @tag2
  Scenario: Staff upload wrong type
  	When Staff choose file1
  	Then image not shown
  	
  @tag3
  Scenario: Staff upload correct type
  	When Staff choose file2
  	Then image preview
  	
  	

  

  