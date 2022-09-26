Feature: Full Project TMS
  
  @tag1
  Scenario: Staff not type NIK
    When Staff go to web ptdika g
    And Staff enter password g
    And Staff click button login g
    Then Staff invalid loginA1 g

	@tag2    
  Scenario: Staff not type password
    When Staff go to web ptdika g
    And Staff enter nik g
    And Staff click button login g
    Then Staff invalid loginA2 g
    
  @tag3
  Scenario: Staff invalid login
  	When Staff go to web ptdika g
    And Staff enter NIK password invalid g
    And Staff click button login g
    Then Staff invalid loginA3 g
        
  @tag4
  Scenario: Staff valid login
  	When Staff go to web ptdika g
    And Staff enter NIK password valid g
    And Staff click button login g
    Then Staff valid login g
    
  @tag5
  Scenario: Staff get form absen izin
    When Staff click laporan kegiatan g
    And Staff choose dan click absen izin g
    Then Staff at form absen izin g
    
	@tag6
	Scenario: Staff showing button choose
		Then Staff see button choose g
		
	@tag7
	Scenario: Staff showing select box divisi
		Then Staff see select box divisi g
		
	@tag8
	Scenario: Staff showing select box nama shift
		Then Staff see select box nama shift g
		
	@tag9
	Scenario: Staff showing select box type absen
		Then Staff see select box type absen g
		
	@tag10
	Scenario: Staff showing text area keterangan
		Then Staff see text area keterangan g
		
	@tag11
	Scenario: Staff showing button submit
		Then Staff see button submit g
		
	@tag12
  Scenario: Staff not upload foto
    And Staff clik submit g
    Then Staff get required from btn choose file g
    
  @tag13
  Scenario: Staff upload wrong type
  	When Staff choose file1 g
  	Then image not shown g
  	
  @tag14
  Scenario: Staff upload correct type
  	When Staff choose file2 g
  	Then image preview g
  	
  @tag15
  Scenario: Divisi not choosen
  	When Staff clik submit g
  	Then Staff get required from select box divisi g

	@tag16
	Scenario: Staff select attraction
		When Staff choose attraction g
		Then Division has choosen attraction g
		
	@tag17
	Scenario: Staff select rent car
		When Staff choose rent car g
		Then Division has choosen rent car g
		
	@tag18
	Scenario: Staff select call center
		When Staff choose call center g
		Then Division has choosen and showing tipe shift g
		
	@tag19
	Scenario: Tipe shift not choosen
	  When Staff clik submit g
		Then Staff get alert from select box tipe shift g
		
	@tag20
	Scenario: Staff select call center 1 g
		When Staff click call center 1 g
		Then Tipe shift has choosen call center 1 g	
		
	@tag21
	Scenario: Staff select call center 2 g
		When Staff click call center 2 g
		Then Tipe shift has choosen call center 2 g
		
	@tag22
	Scenario: Nama shift not choosen
	  When Staff choose attraction g
  	And Staff clik submit g
		Then Staff get stack name shift g
		
	@tag23
	Scenario: Staff select non shift
		When Staff click select box name shift g
		And Staff choose non shift g
		Then Non shift has choosen g
		
	@tag24
	Scenario: Staff select D1 
		When Staff click select box name shift g
		And Staff choose D1 g
		Then D1 has choosen g
		
	@tag25
	Scenario: Staff select D2 
		When Staff click select box name shift g
		And Staff choose D2 g
		Then D2 has choosen g
		
	@tag26
	Scenario: Staff select D3 
		When Staff click select box name shift g
		And Staff choose D3 g
		Then D3 has choosen g
		
	@tag27
	Scenario: Staff senin pagi 
		When Staff click select box name shift g
		And Staff choose senin pagi g
		Then Senin pagi has choosen g
		
	@tag28
	Scenario: Staff senin middle 
		When Staff click select box name shift g
		And Staff choose senin middle g
		Then Senin middle has choosen g
		
	@tag29
	Scenario: Staff senin siang 
		When Staff click select box name shift g
		And Staff choose senin siang g
		Then Senin siang has choosen g
		
	@tag30
	Scenario: Tipe Absen not choosen
	  When Staff clik submit g
		Then Staff get required from select box tipe absen g
		
	@tag31
	Scenario: Staff select WFH
		When Staff click WFH g
		Then WFH has choosen g
		
	@tag32
	Scenario: Staff select WFO
		When Staff click WFO g
		Then WFO has choosen g
		
	@tag33
	Scenario: Null text
  	When Staff clik submit g
		Then Staff get required from text area g
		
	@tag34
	Scenario: Staff input text
		When Staff fill in text g
		Then Text area has been filled g
		
	@tag35
	Scenario: Data not received
  	When Staff choose file1 g
  	And Staff clik submit g
		Then Get warning sentence g
		 And Staff click logout pada navbar g
    Then Staff masuk ke halaman sign in g
		
		
	@tag36
	Scenario: Data sent successfully
	  When Staff go to web ptdika g
  	And Staff enter NIK password valid g
  	And Staff click button login g
  	And Staff click laporan kegiatan g
  	And Staff choose dan click absen izin g
  	And Staff choose file2 g
  	And Staff choose attraction g
  	And Staff click select box name shift g
  	And Staff choose non shift g
  	And Staff click WFH g
  	And Staff fill in text g	
  	And Refresh page
  #	And Staff clik submit g
  #	Then Success input data g
  	
  @tag37
  Scenario: Staff valid logout from navbar
    And Staff click logout pada navbar g
    Then Staff masuk ke halaman sign in g

  @tag38
  Scenario: Staff valid logout from profil
  	When Staff enter NIK password valid g
    And Staff click button login g
    And Staff click profil g
    And Staff click logout pada profil g
    Then Staff masuk ke halaman sign in g

    
Scenario: Staff Login Website
#	Given Staff go to web TMS
When Staff go to web ptdika g
	When Staff Input Username and Password n1	
	And Staff click button login n1
	Then Staff Valid Login n1
	
Scenario: Staff select form absen sakit
	When Click tab laporan kegiatan n1
	And Click On Tab Absen Sakit n1
	Then Staff get attributeD1 n1

Scenario: Staff failed upload file1
	When Staff choose file2 n1
	Then image not shown n1
	
Scenario: input data form absen sakit
	When Staff Upload Foto n1
	And Click Submit n1
	Then Get Attribute n1
	
Scenario: input divisi
	When Staff Choose Divisi n1
	And Click Submit n1
	Then Staff Not Choose Nama Shift n1
	
Scenario: input shift
	When Staff Choose Nama Shift n1
	And Click Shift n1
	And Click Submit n1
	Then Null tipe absen n1
	
Scenario: input tipe absen
	When Staff Select Tipe Absen n1
	And Click Submit n1
	Then Null keterangan n1
	
Scenario: input keterangan
	When Staff Input Keterangan n1
	And Staff choose file2 n1
	And Click Submit n1
	Then Get warning sentence n1

Scenario: submit success
	When Staff go to web ptdika g
	When Staff Input Username and Password n1	
	And Staff click button login n1
	When Click tab laporan kegiatan n1
	And Click On Tab Absen Sakit n1
	And Staff Upload Foto n1
	And Staff Choose Divisi n1
	And Staff Choose Nama Shift n1
	And Click Shift n1
	And Staff Select Tipe Absen n1
	And Staff Input Keterangan n1
#	And Click Submit n1
#	Then Success input data n1

Scenario: Staff logout website
	When Staff Logout n1
	Then Staff back to login TMS n1
	
	
Scenario: Staff Login Website
#	Given Staff Login Website
When Staff go to web ptdika g
	When Input Username and Password n	
	And Klik Btn Login n
	Then Staff Valid Login Website n
	
Scenario: Staff Choose form absen off
	When Tab Laporan Kegiatan n
	And Tab Absen Off n
	Then Staff Get Select File n
	
Scenario: Staff failed upload foto
	When Staff choose wrong file n
	Then Image Not show n

Scenario: Staff input data form absen off
	When Staff Upload Foto Selfie n
	And Click Submit n
	Then Not Divis n
	
Scenario: input divisis
	When Choose Divisi n
	And Click Submit n
	Then No Choose Nama Shift n

Scenario: input shifts
	When Choose Nama Shift n
	And Click shift n
	And Click Submit n
	Then Tipe absen kosong n
	
Scenario: input tipe absens
	When Staff Choose Tipe Absen n
	And Click Submit n
	Then Null Keterangan n

Scenario: input keterangann
	When Input Keterangan n
	And Staff choose wrong file n
	And Submit n
	Then Get warning n
		And Refresh page

Scenario: submit berhasil
#	Given Staff Login Website
When Staff go to web ptdika g
	When Input Username and Password n	
	And Klik Btn Login n
	When Tab Laporan Kegiatan n
	And Tab Absen Off n
	And Staff Upload Foto Selfie n
	And Choose Divisi n
	And Choose Nama Shift n
	And Click shift n
	And Staff Choose Tipe Absen n
	And Input Keterangan n
#	And Click Submit n
#	Then Input data berhasil n

	
Scenario: Logout website
	When Logout Website n
	Then Back To Login TMS n
	
	
Scenario: Staff Login Website
#	Given Staff Login Website
When Staff go to web ptdika g
	When Input Username and Password r
	And Klik Btn Login r
	Then Staff Valid Login r
	
	Scenario: Select Absen Staff
	When Staff Click On Tab Laporan Kegiatan r
	And Click On Absen Masuk r
	Then Staff Valid On Tab Absen Masuk r
	
	
	Scenario: Input Form Absen Masuk Selfie Null
	When Staff Input Upload Foto Selfie Null r
	And Staff Select Divisi r
	And Staff Select Tipe Shift r 
	And Staff Select Nama Shift r 
	And Staff select Tipe Absen r 
	And Staff Input Keterangan r 
	Then Click Submit FAIL r
	And Refresh Page r
	
	Scenario: Input Form Absen Masuk Divisi Null
	When Staff Input Upload Foto Selfie r 
	And Staff Select Divisi Null r 
	And Staff select Tipe Absen r 
	And Staff Input Keterangan r 
	Then Click Submit FAIL r
	And Refresh Page r
	
		Scenario: Input Form Absen Masuk Tipe Shift Null
	When Staff Input Upload Foto Selfie r 
	And Staff Select Divisi r
	And Staff Select Tipe Shift Null r 
	And Staff select Tipe Absen r 
	And Staff Input Keterangan r 
	Then Click Submit FAIL r
	And Refresh Page r
	
		Scenario: Input Form Absen Masuk Nama Shift Null
	When Staff Input Upload Foto Selfie r 
	And Staff Select Divisi r 
	And Staff Select Tipe Shift r 
	And Staff Select Nama Shift Null r 
	And Staff select Tipe Absen r
	And Staff Input Keterangan r 
	Then Click Submit FAIL r
	And Refresh Page r
	
		Scenario: Input Form Absen Masuk Tipe Absen Null
	When Staff Input Upload Foto Selfie r 
	And Staff Select Divisi r 
	And Staff Select Tipe Shift r 
	And Staff Select Nama Shift r 
	And Staff select Tipe Absen Null r 
	And Staff Input Keterangan r 
	Then Click Submit FAIL r
	And Refresh Page r
	
		Scenario: Input Form Absen Masuk Keterangan Null
	When Staff Input Upload Foto Selfie r
	And Staff Select Divisi r 
	And Staff Select Tipe Shift r 
	And Staff Select Nama Shift r 
	And Staff select Tipe Absen r 
	And Staff Input Keterangan Null r 
	Then Click Submit FAIL r
	And Refresh Page r
	
	Scenario: Input Form Absen Masuk 
	When Staff Input Upload Foto Selfie r
	And Staff Select Divisi r
	And Staff Select Tipe Shift r
	And Staff Select Nama Shift r
	And Staff select Tipe Absen r
	And Staff Input Keterangan r
	Then Click Submit r

	Scenario: Input Form Absen Pulang
	When Staff Click On Tab Laporan Kegiatan Two r
	And Click On Absen Pulang r
	When Staff Valid On Tab Absen Pulang r
	And Staff Input Upload Foto Selfie r
	And Staff Select Divisi Pulang r
	And Staff Select Tipe Shift Pulang r
	And Staff Select Nama Shift Pulang r
	And Staff Select Tipe Absen Pulang r
	And Staff Input Keterangan Pulang r
	Then Click Submit r
		
Scenario: Admin valid login
	When Staff go to web ptdika g
	When Admin enter username True and password True
	And Admin click button login
	Then Admin valid login
	
Scenario: Admin Select Absen from dashboard to Masuk
	When Admin click list absen
	And Admin choose absen masuk
	Then Admin go to absen masuk
	
Scenario: Admin input form absen masuk position call center
	When Admin select position call center 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen masuk position admin credit
	When Admin select position admin credit
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen masuk position spg
	When Admin select position spg 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen masuk position null
	When Admin select position null 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen masuk branch bandung
	When Admin select position all 
	And Admin select branch bandung
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen masuk branch jakarta
	When Admin select position all 
	And Admin select branch jakarta
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen masuk branch surabaya
	When Admin select position all 
	And Admin select branch surabaya
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen masuk branch null
	When Admin select position all 
	And Admin select branch null
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen masuk unit airasia
	When Admin select position all 
	And Admin select branch all
	When Admin select unit airasia
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen masuk unit bca api
	When Admin select position all 
	And Admin select branch all
	When Admin select unit bca api
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen masuk branch it programmer
	When Admin select position all 
	And Admin select branch all
	When Admin select unit it programmer
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen masuk unit null
	When Admin select position all 
	And Admin select branch all
	When Admin select unit null
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen masuk start date lebih dari 1bulan dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih dari 1bulan and end date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen masuk start date lebih tinggi dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih tinggi dari end date
	Then Admin validate No Data
	
Scenario: Admin input form absen masuk end date lebih dari 1bulan dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih dari 1bulan and start date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen masuk end date lebih rendah dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih rendah dari start date
	Then Admin validate No Data

Scenario: Admin input form absen masuk Position all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen masuk brach all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen masuk unit all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen masuk start date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen masuk end date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	
	Scenario: Admin Select Absen from dashboard to pulang
	When Admin click list absen
	And Admin choose absen pulang
	Then Admin go to absen pulang
	
Scenario: Admin input form absen pulang position call center
	When Admin select position call center 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen pulang position admin credit
	When Admin select position admin credit
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen pulang position spg
	When Admin select position spg 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen pulang position null
	When Admin select position null 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen pulang branch bandung
	When Admin select position all 
	And Admin select branch bandung
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen pulang branch jakarta
	When Admin select position all 
	And Admin select branch jakarta
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen pulang branch surabaya
	When Admin select position all 
	And Admin select branch surabaya
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen pulang branch null
	When Admin select position all 
	And Admin select branch null
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen pulang unit airasia
	When Admin select position all 
	And Admin select branch all
	When Admin select unit airasia
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen pulang unit bca api
	When Admin select position all 
	And Admin select branch all
	When Admin select unit bca api
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen pulang branch it programmer
	When Admin select position all 
	And Admin select branch all
	When Admin select unit it programmer
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen pulang unit null
	When Admin select position all 
	And Admin select branch all
	When Admin select unit null
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen pulang start date lebih dari 1bulan dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih dari 1bulan and end date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen pulang start date lebih tinggi dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih tinggi dari end date
	Then Admin validate No Data
	
Scenario: Admin input form absen pulang end date lebih dari 1bulan dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih dari 1bulan and start date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen pulang end date lebih rendah dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih rendah dari start date
	Then Admin validate No Data
	
Scenario: Admin input form absen pulang position all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen pulang branch all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen pulang unit all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen pulang start date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen pulang end date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	
Scenario: Admin Select Absen from dashboard to sakit
	When Admin click list absen
	And Admin choose absen sakit
	Then Admin go to absen sakit
	
Scenario: Admin input form absen sakit position call center
	When Admin select position call center 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen sakit position admin credit
	When Admin select position admin credit
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen sakit position spg
	When Admin select position spg 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen sakit position null
	When Admin select position null 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen sakit branch bandung
	When Admin select position all 
	And Admin select branch bandung
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen sakit branch jakarta
	When Admin select position all 
	And Admin select branch jakarta
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen sakit branch surabaya
	When Admin select position all 
	And Admin select branch surabaya
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen sakit branch null
	When Admin select position all 
	And Admin select branch null
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen sakit unit airasia
	When Admin select position all 
	And Admin select branch all
	When Admin select unit airasia
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen sakit unit bca api
	When Admin select position all 
	And Admin select branch all
	When Admin select unit bca api
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen sakit branch it programmer
	When Admin select position all 
	And Admin select branch all
	When Admin select unit it programmer
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen sakit unit null
	When Admin select position all 
	And Admin select branch all
	When Admin select unit null
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen sakit start date lebih dari 1bulan dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih dari 1bulan and end date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen sakit start date lebih tinggi dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih tinggi dari end date
	Then Admin validate No Data
	
Scenario: Admin input form absen sakit end date lebih dari 1bulan dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih dari 1bulan and start date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen sakit end date lebih rendah dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih rendah dari start date
	Then Admin validate No Data
	
Scenario: Admin input form absen sakit Position all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen sakit brach all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen sakit unit all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen sakit start date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen sakit end date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	
	Scenario: Admin Select Absen from dashboard to off
	When Admin click list absen
	And Admin choose absen off
	Then Admin go to absen off
	
Scenario: Admin input form absen off position call center
	When Admin select position call center 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen off position admin credit
	When Admin select position admin credit
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen off position spg
	When Admin select position spg 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen off position null
	When Admin select position null 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen off branch bandung
	When Admin select position all 
	And Admin select branch bandung
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen off branch jakarta
	When Admin select position all 
	And Admin select branch jakarta
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen off branch surabaya
	When Admin select position all 
	And Admin select branch surabaya
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen off branch null
	When Admin select position all 
	And Admin select branch null
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen off unit airasia
	When Admin select position all 
	And Admin select branch all
	When Admin select unit airasia
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen off unit bca api
	When Admin select position all 
	And Admin select branch all
	When Admin select unit bca api
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen off branch it programmer
	When Admin select position all 
	And Admin select branch all
	When Admin select unit it programmer
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen off unit null
	When Admin select position all 
	And Admin select branch all
	When Admin select unit null
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen off start date lebih dari 1bulan dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih dari 1bulan and end date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen off start date lebih tinggi dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih tinggi dari end date
	Then Admin validate No Data
	
Scenario: Admin input form absen off end date lebih dari 1bulan dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih dari 1bulan and start date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen off end date lebih rendah dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih rendah dari start date
	Then Admin validate No Data

Scenario: Admin input form absen off Position all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen off brach all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen off unit all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen off start date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen off end date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	
	Scenario: Admin Select Absen from dashboard to shifting
	When Admin click list absen
	And Admin choose absen shifting
	Then Admin go to absen shifting
	
Scenario: Admin input form absen shifting position call center
	When Admin select position call center 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen shifting position admin credit
	When Admin select position manager
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen shifting position spg
	When Admin select position spg 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen shifting position null
	When Admin select position null 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen shifting branch bandung
	When Admin select position all 
	And Admin select branch bandung
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen shifting branch jakarta
	When Admin select position all 
	And Admin select branch jakarta
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen shifting branch surabaya
	When Admin select position all 
	And Admin select branch surabaya
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen shifting branch null
	When Admin select position all 
	And Admin select branch null
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen shifting unit airasia
	When Admin select position all 
	And Admin select branch all
	When Admin select unit airasia
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen shifting unit bca api
	When Admin select position all 
	And Admin select branch all
	When Admin select unit bca api
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen shifting branch it programmer
	When Admin select position all 
	And Admin select branch all
	When Admin select unit it programmer
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen shifting unit null
	When Admin select position all 
	And Admin select branch all
	When Admin select unit null
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen shifting start date lebih dari 1bulan dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih dari 1bulan and end date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen shifting start date lebih tinggi dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih tinggi dari end date
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen shifting end date lebih dari 1bulan dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih dari 1bulan and start date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen shifting end date lebih rendah dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih rendah dari start date
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen shifting Position all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen shifting brach all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen shifting unit all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen shifting start date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen shifting end date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	
	Scenario: Admin Select Absen from dashboard to non shifting
	When Admin click list absen
	And Admin choose absen non shifting
	Then Admin go to absen non shifting
	
Scenario: Admin input form absen non shifting position call center
	When Admin select position call center 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen non shifting position admin credit
	When Admin select position admin credit
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen non shifting position spg
	When Admin select position spg 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen non shifting position null
	When Admin select position null 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen non shifting branch bandung
	When Admin select position all 
	And Admin select branch bandung
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen non shifting branch jakarta
	When Admin select position all 
	And Admin select branch jakarta
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen non shifting branch surabaya
	When Admin select position all 
	And Admin select branch surabaya
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen non shifting branch null
	When Admin select position all 
	And Admin select branch null
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen non shifting unit airasia
	When Admin select position all 
	And Admin select branch all
	When Admin select unit airasia
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen non shifting unit bca api
	When Admin select position all 
	And Admin select branch all
	When Admin select unit bca api
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen non shifting branch it programmer
	When Admin select position all 
	And Admin select branch all
	When Admin select unit it programmer
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen non shifting unit null
	When Admin select position all 
	And Admin select branch all
	When Admin select unit null
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen non shifting start date lebih dari 1bulan dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih dari 1bulan and end date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen non shifting start date lebih tinggi dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih tinggi dari end date
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen non shifting end date lebih dari 1bulan dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih dari 1bulan and start date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen non shifting end date lebih rendah dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih rendah dari start date
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen non shifting Position all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen non shifting brach all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen non shifting unit all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen non shifting start date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen non shifting end date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data

Scenario: Admin Checking file
	When Admin checking exist file
	
Scenario: Admin Logout
	When Admin click btnLogout
	Then Admin back to login TMS