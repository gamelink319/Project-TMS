Feature: Scenario Admin Absen Off

Scenario: Admin valid login
	Given Admin go to web TMS
	When Admin enter username True and password True
	And Admin click button login
	Then Admin valid login
	
Scenario: Admin Select Absen from dashboard
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
	Then Admin validate No Data
	
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
	Then Admin validate No Data
	
Scenario: Admin input form absen off end date lebih rendah dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih rendah dari start date
	Then Admin validate No Data
	
Scenario: Admin input form absen off Positife
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	
Scenario: Admin Logout
	When Admin click btnLogout
	Then Admin back to login TMS