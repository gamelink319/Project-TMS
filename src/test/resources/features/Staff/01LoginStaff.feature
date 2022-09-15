Feature: Absen Masuk

Scenario: login website
Given  staff login website 
When input username and password
And klik button login
Then staff valid login 

Scenario: select absen staff
When staff click on tab laporan kegiatan
And click on absen masuk 
Then staff valid on tab absen masuk 

Scenario: input form absen masuk 
When Staff Input Upload Foto Selfie 
And Staff Select Divisi
And Staff Select Tipe Shift
And Staff Select Nama Shift
And Staff select Tipe Absen
And Staff Input Keterangan
Then Click submit
