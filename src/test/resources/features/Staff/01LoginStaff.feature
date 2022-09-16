Feature: Login User

	Scenario: Staff Login Website
	Given Staff Login Website 
	When Input Username and Password
	And Klik Btn Login
	Then Staff Valid Login
	
	Scenario: Select Absen Staff
	When Staff Click On Tab Laporan Kegiatan
	And Click On Absen Masuk
	Then Staff Valid On Tab Absen Masuk
	
	Scenario: Input Form Absen Masuk 
	When Staff Input Upload Foto Selfie
	And Staff Select Divisi
	And Staff Select Tipe Shift
	And Staff Select Nama Shift
	And Staff select Tipe Absen
	And Staff Input Keterangan
	Then Click Submit

	Scenario: Input Form Absen Pulang 
	When Staff Click On Tab Laporan Kegiatan Two 
	And Click On Absen Pulang
	When Staff Valid On Tab Absen Pulang
	And Staff Input Upload Foto Selfie
	And Staff Select Divisi Pulang
	And Staff Select Tipe Shift Pulang
	And Staff Select Nama Shift Pulang
	And Staff Select Tipe Absen Pulang
	And Staff Input Keterangan Pulang
	Then Click Submit