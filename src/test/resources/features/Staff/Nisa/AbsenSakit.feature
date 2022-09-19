Feature: Scenario Staff Absen Sakit

Scenario: Staff Login Website
	Given Staff go to web TMS
	When Staff Input Username and Password	
	And Staff click button login
	Then Staff Valid Login
	
Scenario: Staff select form absen sakit
	When Click tab laporan kegiatan	
	And Click On Tab Absen Sakit
	Then Staff Valid To Absen Sakit

Scenario: Staff input data form absen sakit
	When Staff Upload Foto
	And Staff Choose Divisi
	And Staff Choose Nama Shift
	And Staff Select Tipe Absen
	And Staff Input Keterangan
	Then Click Submit
	
Scenario: Staff logout website
	When Staff Logout
	Then Staff back to login TMS