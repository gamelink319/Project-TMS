Feature: Absen Izin

  @tag1
  Scenario: Staff get form absen izinC1	
    When Staff go to web ptdikaC1
    And Staff enter own nik and passwordC1
    And Staff click button loginC1
    And Staff click laporan kegiatanC1
    And Staff choose dan click absen izinC1
    Then Staff at form absen izin
    
	@tag2
	Scenario: Staff showing button choose
		Then Staff see button choose
		
	@tag3
	Scenario: Staff showing select box divisi
		Then Staff see select box divisi
		
	@tag4
	Scenario: Staff showing select box nama shift
		Then Staff see select box nama shift
		
	@tag5
	Scenario: Staff showing select box type absen
		Then Staff see select box type absen
		
	@tag6
	Scenario: Staff showing text area keterangan
		Then Staff see text area keterangan
		
	@tag7
	Scenario: Staff showing button submit
		Then Staff see button submit
     

  