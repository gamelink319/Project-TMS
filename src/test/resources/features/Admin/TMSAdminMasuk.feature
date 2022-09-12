Feature: Admin Positife Absen

Scenario: Admin valid login
	Given Admin go to web TMS
	When Admin enter username True and password True
	And Admin click button login
	Then Admin valid login
	
Scenario: Admin Select Absen from dashboard
	When Admin click list absen
	And Admin choose absen masuk
	Then Admin go to absen masuk
	
Scenario: Admin input form absen masuk position null
	When Admin select position null 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date
	Then Admin validate No Data
	
	Scenario: Admin input form absen masuk true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date
	And Admin click export data 
	Then Admin validate data