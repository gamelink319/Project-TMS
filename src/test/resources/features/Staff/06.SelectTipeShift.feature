Feature: As call center choose tipe shift

  @tag1
	Scenario: Tipe shift not choosen
	  When Staff go wo web ptdikaF1
  	And Staff enter own nik passwordF1
  	And Staff click button loginF1
  	And Staff click laporan kegiatanF1
  	And Staff choose and click absen izinF1
  	And Staff upload fotoF1
  	And Staff choose divisiF1
  	And Staff click submitF1
		Then Staff get alertF1
		
	@tag2
	Scenario: Staff select call center1
		When Staff click call center1
		Then Tipe shift has choosenE5	
		
	@tag3
	Scenario: Staff select call center2
		When Staff click call center2
		Then Tipe shift has choosenE6
		
	

  
