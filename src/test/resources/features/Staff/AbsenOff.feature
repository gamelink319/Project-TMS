Feature: Scenario Staff Absen Off

Scenario: Staff Login Website
	Given Staff Login Website
	When Input Username and Password	
	And Klik Btn Login
	Then Staff Valid Login Website
	
Scenario: Staff Choose form absen off
	When Tab Laporan Kegiatan	
	And Tab Absen Off
	Then Staff Get Select File
	
Scenario: Staff failed upload foto
	When Staff choose wrong file
	Then Image Not show

Scenario: Staff input data form absen off
	When Staff Upload Foto Selfie
	And Click Submit
	Then Not Divis
Scenario: input divisis
	When Choose Divisi
	And Click Submit
	Then No Choose Nama Shift

Scenario: input shifts
	When Choose Nama Shift
	And Click shift
	And Click Submit
	Then Tipe absen kosong
	
Scenario: input tipe absens
	When Staff Choose Tipe Absen
	And Click Submit
	Then Null Keterangan

Scenario: input keterangann
	When Input Keterangan
	And Staff choose wrong file
	And Submit
	Then Get warning

Scenario: submit berhasil
	Given Staff Login Website
	When Input Username and Password	
	And Klik Btn Login
	When Tab Laporan Kegiatan	
	And Tab Absen Off
	And Staff Upload Foto Selfie
	And Choose Divisi
	And Choose Nama Shift
	And Click shift
	And Staff Choose Tipe Absen
	And Input Keterangan
	And Click Submit
	Then Input data berhasil

	
Scenario: Logout website
	When Logout Website
	Then Back To Login TMS