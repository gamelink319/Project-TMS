Feature: Scenario Staff Absen Off

Scenario: Staff Login Website
	Given Staff Login Website
	When Input Username and Password	
	And Klik Btn Login
	Then Staff Valid Login Website
	
Scenario: Staff Choose form absen off
	When Tab Laporan Kegiatan	
	And Tab Absen Off
	Then Valid Absen Off

Scenario: Staff input data form absen off
	When Staff Upload Foto Selfie
	And Choose Divisi
	And Staff Choose Tipe Shift
	And Choose Nama Shift
	And Staff Choose Tipe Absen
	And Input Keterangan
	Then Submit
	
Scenario: Staff logout website
	When Logout Website
	Then Back To Login TMS