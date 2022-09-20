Feature: Scenario Staff Absen Sakit

Scenario: Staff Login Website
	Given Staff go to web TMS
	When Staff Input Username and Password	
	And Staff click button login
	Then Staff Valid Login
	
Scenario: Staff select form absen sakit
	When Click tab laporan kegiatan	
	And Click On Tab Absen Sakit
	Then Staff get attributeD1

Scenario: Staff failed upload file1
	When Staff choose file2
	Then image not shown
	
Scenario: input data form absen sakit
	When Staff Upload Foto
	And Click Submit
	Then Get Attribute
	
Scenario: input divisi
	When Staff Choose Divisi
	And Click Submit
	Then Staff Not Choose Nama Shift
	
Scenario: input shift
	When Staff Choose Nama Shift
	And Click Shift
	And Click Submit
	Then Null tipe absen
	
Scenario: input tipe absen
	When Staff Select Tipe Absen
	And Click Submit
	Then Null keterangan
	
Scenario: input keterangan
	When Staff Input Keterangan
	And Staff choose file2
	And Click Submit
	Then Get warning sentence

Scenario: submit success
	Given Staff go to web TMS
	When Staff Input Username and Password	
	And Staff click button login
	When Click tab laporan kegiatan	
	And Click On Tab Absen Sakit
	And Staff Upload Foto
	And Staff Choose Divisi
	And Staff Choose Nama Shift
	And Click Shift
	And Staff Select Tipe Absen
	And Staff Input Keterangan
	And Click Submit
	Then Success input data
	
Scenario: Staff logout website
	When Staff Logout
	Then Staff back to login TMS