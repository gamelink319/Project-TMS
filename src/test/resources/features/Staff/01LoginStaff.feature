Feature : Login User

	Scenario: Staff Login Website
	Given staff login website 
	When input username and password
	And Klik button login
	Then Staff valid login
	
	Scenario: Select absen staff
	When Staff click On Tab laporan kegiatan
	And Click on absen masuk
	Then Staff valid on tab absen masuk
	
	Scenario: Input form absen masuk 
	When Staff Input Upload Foto Selfie
	And Staff Select Divisi
	And Staff Select Tipe Shift
	And Staff Select Nama Shift
	And Staff select Tipe Absen
	And Staff Input Keterangan
	Then Click submit
	
	Scenario: Input form absen pulang 
	When Staff click On Tab Laporan Kegiatan Two 
	And Click on absen pulang
	When Staff valid on tab absen pulang
	And Staff input upload foto selfie
	And Staff select divisi Pulang
	And Staff select tipe Shift Pulang
	And Staff select nama Shift Pulang
	And Staff select tipe Absen Pulang
	And Staff input keterangan Pulang
	Then Click submit
	 