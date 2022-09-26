Feature: Login Staff

Scenario: Staff Login Website
	Given Staff Login Website 
	When Input Username and Password
	And Klik Btn Login
	Then Staff Valid Login
	
	Scenario: Select Absen Staff
	When Staff Click On Tab Laporan Kegiatan
	And Click On Absen Masuk
	Then Staff Valid On Tab Absen Masuk
	
	
	Scenario: Input Form Absen Masuk Selfie Null
	When Staff Input Upload Foto Selfie Null
	And Staff Select Divisi 
	And Staff Select Tipe Shift 
	And Staff Select Nama Shift 
	And Staff select Tipe Absen 
	And Staff Input Keterangan 
	Then Click Submit FAIL
	And Refresh Page
	
	Scenario: Input Form Absen Masuk Divisi Null
	When Staff Input Upload Foto Selfie 
	And Staff Select Divisi Null 
	And Staff select Tipe Absen 
	And Staff Input Keterangan 
	Then Click Submit FAIL
	And Refresh Page
	
		Scenario: Input Form Absen Masuk Tipe Shift Null
	When Staff Input Upload Foto Selfie 
	And Staff Select Divisi 
	And Staff Select Tipe Shift Null 
	And Staff select Tipe Absen 
	And Staff Input Keterangan 
	Then Click Submit FAIL
	And Refresh Page
	
		Scenario: Input Form Absen Masuk Nama Shift Null
	When Staff Input Upload Foto Selfie 
	And Staff Select Divisi 
	And Staff Select Tipe Shift 
	And Staff Select Nama Shift Null 
	And Staff select Tipe Absen 
	And Staff Input Keterangan 
	Then Click Submit FAIL
	And Refresh Page
	
		Scenario: Input Form Absen Masuk Tipe Absen Null
	When Staff Input Upload Foto Selfie 
	And Staff Select Divisi 
	And Staff Select Tipe Shift 
	And Staff Select Nama Shift 
	And Staff select Tipe Absen Null 
	And Staff Input Keterangan 
	Then Click Submit FAIL
	And Refresh Page
	
		Scenario: Input Form Absen Masuk Keterangan Null
	When Staff Input Upload Foto Selfie 
	And Staff Select Divisi 
	And Staff Select Tipe Shift 
	And Staff Select Nama Shift 
	And Staff select Tipe Absen 
	And Staff Input Keterangan Null 
	Then Click Submit FAIL
	And Refresh Page
	
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