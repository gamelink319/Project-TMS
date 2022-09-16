Feature: Staff choose nama shift

  @tag1
	Scenario: Nama shift not choosen
	  When Staff go wo web ptdikaG1
  	And Staff enter own nik passwordG1
  	And Staff click button loginG1
  	And Staff click laporan kegiatanG1
  	And Staff choose and click absen izinG1
  	And Staff upload fotoG1
  	And Staff choose divisiG1
  	And Staff click submitG1
		Then Staff get alertG1
		
	@tag2
	Scenario: Staff select non shift
		When Staff click box name shift
		And Staff choose non shift
		Then Nama shift has choosenG2

 
