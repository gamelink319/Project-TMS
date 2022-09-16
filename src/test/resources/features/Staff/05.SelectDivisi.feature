Feature: Staff choose divisi

  @tag1
  Scenario: Divisi not choosen
  	When Staff go wo web ptdikaE1
  	And Staff enter own nik passwordE1
  	And Staff click button loginE1
  	And Staff click laporan kegiatanE1
  	And Staff choose and click absen izinE1
  	And Staff upload fotoE1
  	And Staff click button submitE1
  	Then Staff get alertE1

	@tag2
	Scenario: Staff select attraction
		When Staff choose attraction
		Then Division has choosenE2
		
	@tag3
	Scenario: Staff select rent car
		When Staff choose rent car
		Then Division has choosenE3
		
	@tag4
	Scenario: Staff select call center
		When Staff choose call center
		Then Division has choosen and showing tipe shift 
		
	
		
 