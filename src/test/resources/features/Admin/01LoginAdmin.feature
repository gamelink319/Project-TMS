Feature: Login Admin
	
Scenario: Admin invalid login
	Given Admin go to web TMS
	When Admin enter username false and password false
	And Admin click button login
	Then Admin invalid credentials
	
Scenario: Admin Login null username
	When Admin enter username false and password true
	And Admin click button login
	Then Admin invalid credentials

Scenario: Admin Login null password
	When Admin enter username true and password false
	And Admin click button login
	Then Admin invalid credentials
	
Scenario: Admin valid login
	When Admin enter username True and password True
	And Admin click button login
	Then Admin valid login

Scenario: Admin Logout
	When Admin click btnLogout
	Then Admin back to login TMS