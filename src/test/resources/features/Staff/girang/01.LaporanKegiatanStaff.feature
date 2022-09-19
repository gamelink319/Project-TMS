Feature: Login Staff
  
  @tag1
  Scenario: Staff not type NIK
    When Staff go to web ptdika
    And Staff enter password
    And Staff click button login
    Then Staff invalid loginA1

	@tag2    
  Scenario: Staff not type password
    When Staff go to web ptdika
    And Staff enter nik
    And Staff click button login
    Then Staff invalid loginA2
    
  @tag3
  Scenario: Staff invalid login
  	When Staff go to web ptdika
    And Staff enter NIK password invalid
    And Staff click button login
    Then Staff invalid loginA3
        
  @tag4
  Scenario: Staff valid login
  	When Staff go to web ptdika
    And Staff enter NIK password valid
    And Staff click button login
    Then Staff valid login
    
  @tag5
  Scenario: Staff get form absen izin
    When Staff click laporan kegiatan
    And Staff choose dan click absen izin
    Then Staff at form absen izin
    
	@tag6
	Scenario: Staff showing button choose
		Then Staff see button choose
		
	@tag7
	Scenario: Staff showing select box divisi
		Then Staff see select box divisi
		
	@tag8
	Scenario: Staff showing select box nama shift
		Then Staff see select box nama shift
		
	@tag9
	Scenario: Staff showing select box type absen
		Then Staff see select box type absen
		
	@tag10
	Scenario: Staff showing text area keterangan
		Then Staff see text area keterangan
		
	@tag11
	Scenario: Staff showing button submit
		Then Staff see button submit
		
	@tag12
  Scenario: Staff not upload foto
    And Staff clik submit
    Then Staff get required from btn choose file
    
  @tag13
  Scenario: Staff upload wrong type
  	When Staff choose file1
  	Then image not shown
  	
  @tag14
  Scenario: Staff upload correct type
  	When Staff choose file2
  	Then image preview
  	
  @tag15
  Scenario: Divisi not choosen
  	When Staff clik submit
  	Then Staff get required from select box divisi

	@tag16
	Scenario: Staff select attraction
		When Staff choose attraction
		Then Division has choosen attraction
		
	@tag17
	Scenario: Staff select rent car
		When Staff choose rent car
		Then Division has choosen rent car
		
	@tag18
	Scenario: Staff select call center
		When Staff choose call center
		Then Division has choosen and showing tipe shift 
		
	@tag19
	Scenario: Tipe shift not choosen
	  When Staff clik submit
		Then Staff get alert from select box tipe shift
		
	@tag20
	Scenario: Staff select call center 1
		When Staff click call center 1
		Then Tipe shift has choosen call center 1	
		
	@tag21
	Scenario: Staff select call center 2
		When Staff click call center 2
		Then Tipe shift has choosen call center 2
		
	@tag22
	Scenario: Nama shift not choosen
	  When Staff choose attraction
  	And Staff clik submit
		Then Staff get stack name shift
		
	@tag23
	Scenario: Staff select non shift
		When Staff click select box name shift
		And Staff choose non shift
		Then Non shift has choosen
		
	@tag24
	Scenario: Staff select D1 
		When Staff click select box name shift
		And Staff choose D1
		Then D1 has choosen	
		
	@tag25
	Scenario: Staff select D2 
		When Staff click select box name shift
		And Staff choose D2
		Then D2 has choosen
		
	@tag26
	Scenario: Staff select D3 
		When Staff click select box name shift
		And Staff choose D3
		Then D3 has choosen
		
	@tag27
	Scenario: Staff senin pagi 
		When Staff click select box name shift
		And Staff choose senin pagi
		Then Senin pagi has choosen
		
	@tag28
	Scenario: Staff senin middle 
		When Staff click select box name shift
		And Staff choose senin middle
		Then Senin middle has choosen
		
	@tag29
	Scenario: Staff senin siang 
		When Staff click select box name shift
		And Staff choose senin siang
		Then Senin siang has choosen
		
	@tag30
	Scenario: Tipe Absen not choosen
	  When Staff clik submit
		Then Staff get required from select box tipe absen
		
	@tag31
	Scenario: Staff select WFH
		When Staff click WFH
		Then WFH has choosen
		
	@tag32
	Scenario: Staff select WFO
		When Staff click WFO
		Then WFO has choosen
		
	@tag33
	Scenario: Null text
  	When Staff clik submit
		Then Staff get required from text area
		
	@tag34
	Scenario: Staff input text
		When Staff fill in text
		Then Text area has been filled
		
	@tag35
	Scenario: Data not received
  	When Staff choose file1
  	And Staff clik submit
		Then Get warning sentence
		
	@tag36
	Scenario: Data sent successfully
	  When Staff go to web ptdika
  	And Staff enter NIK password valid
  	And Staff click button login
  	And Staff click laporan kegiatan
  	And Staff choose dan click absen izin
  	And Staff choose file2
  	And Staff choose attraction
  	And Staff click select box name shift
  	And Staff choose non shift
  	And Staff click WFH
  	And Staff fill in text
  	And Staff clik submit
  	Then Success input data
  	
  @tag37
  Scenario: Staff valid logout from navbar
    And Staff click logout pada navbar
    Then Staff masuk ke halaman sign in

  @tag38
  Scenario: Staff valid logout from profil
  	When Staff enter NIK password valid
    And Staff click button login
    And Staff click profil
    And Staff click logout pada profil
    Then Staff masuk ke halaman sign in 