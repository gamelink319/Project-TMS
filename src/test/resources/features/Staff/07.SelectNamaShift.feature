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
		And Staff choose non shiftG2
		Then Nama shift has choosenG2
		
	@tag3
	Scenario: Staff select D1 
		When Staff click D1
		And Staff choose non shiftG3
		Then Nama shift has choosenG3	
		
	@tag4
	Scenario: Staff select D2 
		When Staff click D2
		And Staff choose non shiftG4
		Then Nama shift has choosenG4
		
	@tag5
	Scenario: Staff select D3 
		When Staff click D3
		And Staff choose non shiftG5
		Then Nama shift has choosenG5
		
	@tag6
	Scenario: Staff senin pagi 
		When Staff senin pagi
		And Staff choose non shiftG6
		Then Nama shift has choosenG6
		
	@tag7
	Scenario: Staff senin middle 
		When Staff senin middle
		And Staff choose non shiftG7
		Then Nama shift has choosenG7 

 
