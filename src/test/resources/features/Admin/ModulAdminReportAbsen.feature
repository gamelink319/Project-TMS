Feature: Admin Report Absen
	
Scenario: Admin valid login
	Given Admin go to web TMS
	When Admin enter username True and password True
	And Admin click button login
	Then Admin valid login
	
Scenario: Admin Select Absen from dashboard to Masuk
	When Admin click list absen
	And Admin choose absen masuk
	Then Admin go to absen masuk
	
Scenario: Admin input form absen masuk position call center
	When Admin select position call center 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen masuk position admin credit
	When Admin select position admin credit
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen masuk position spg
	When Admin select position spg 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen masuk position null
	When Admin select position null 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen masuk branch bandung
	When Admin select position all 
	And Admin select branch bandung
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen masuk branch jakarta
	When Admin select position all 
	And Admin select branch jakarta
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen masuk branch surabaya
	When Admin select position all 
	And Admin select branch surabaya
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen masuk branch null
	When Admin select position all 
	And Admin select branch null
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen masuk unit airasia
	When Admin select position all 
	And Admin select branch all
	When Admin select unit airasia
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen masuk unit bca api
	When Admin select position all 
	And Admin select branch all
	When Admin select unit bca api
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen masuk branch it programmer
	When Admin select position all 
	And Admin select branch all
	When Admin select unit it programmer
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen masuk unit null
	When Admin select position all 
	And Admin select branch all
	When Admin select unit null
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen masuk start date lebih dari 1bulan dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih dari 1bulan and end date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen masuk start date lebih tinggi dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih tinggi dari end date
	Then Admin validate No Data
	
Scenario: Admin input form absen masuk end date lebih dari 1bulan dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih dari 1bulan and start date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen masuk end date lebih rendah dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih rendah dari start date
	Then Admin validate No Data

Scenario: Admin input form absen masuk Position all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen masuk brach all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen masuk unit all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen masuk start date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen masuk end date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	
	Scenario: Admin Select Absen from dashboard to pulang
	When Admin click list absen
	And Admin choose absen pulang
	Then Admin go to absen pulang
	
Scenario: Admin input form absen pulang position call center
	When Admin select position call center 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen pulang position admin credit
	When Admin select position admin credit
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen pulang position spg
	When Admin select position spg 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen pulang position null
	When Admin select position null 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen pulang branch bandung
	When Admin select position all 
	And Admin select branch bandung
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen pulang branch jakarta
	When Admin select position all 
	And Admin select branch jakarta
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen pulang branch surabaya
	When Admin select position all 
	And Admin select branch surabaya
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen pulang branch null
	When Admin select position all 
	And Admin select branch null
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen pulang unit airasia
	When Admin select position all 
	And Admin select branch all
	When Admin select unit airasia
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen pulang unit bca api
	When Admin select position all 
	And Admin select branch all
	When Admin select unit bca api
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen pulang branch it programmer
	When Admin select position all 
	And Admin select branch all
	When Admin select unit it programmer
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen pulang unit null
	When Admin select position all 
	And Admin select branch all
	When Admin select unit null
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen pulang start date lebih dari 1bulan dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih dari 1bulan and end date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen pulang start date lebih tinggi dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih tinggi dari end date
	Then Admin validate No Data
	
Scenario: Admin input form absen pulang end date lebih dari 1bulan dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih dari 1bulan and start date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen pulang end date lebih rendah dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih rendah dari start date
	Then Admin validate No Data
	
Scenario: Admin input form absen pulang position all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen pulang branch all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen pulang unit all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen pulang start date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen pulang end date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	
Scenario: Admin Select Absen from dashboard to sakit
	When Admin click list absen
	And Admin choose absen sakit
	Then Admin go to absen sakit
	
Scenario: Admin input form absen sakit position call center
	When Admin select position call center 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen sakit position admin credit
	When Admin select position admin credit
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen sakit position spg
	When Admin select position spg 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen sakit position null
	When Admin select position null 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen sakit branch bandung
	When Admin select position all 
	And Admin select branch bandung
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen sakit branch jakarta
	When Admin select position all 
	And Admin select branch jakarta
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen sakit branch surabaya
	When Admin select position all 
	And Admin select branch surabaya
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data
	
Scenario: Admin input form absen sakit branch null
	When Admin select position all 
	And Admin select branch null
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen sakit unit airasia
	When Admin select position all 
	And Admin select branch all
	When Admin select unit airasia
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen sakit unit bca api
	When Admin select position all 
	And Admin select branch all
	When Admin select unit bca api
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen sakit branch it programmer
	When Admin select position all 
	And Admin select branch all
	When Admin select unit it programmer
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen sakit unit null
	When Admin select position all 
	And Admin select branch all
	When Admin select unit null
	And Admin input start date true and end date true
	Then Admin validate No Data

Scenario: Admin input form absen sakit start date lebih dari 1bulan dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih dari 1bulan and end date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen sakit start date lebih tinggi dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih tinggi dari end date
	Then Admin validate No Data
	
Scenario: Admin input form absen sakit end date lebih dari 1bulan dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih dari 1bulan and start date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen sakit end date lebih rendah dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih rendah dari start date
	Then Admin validate No Data
	
Scenario: Admin input form absen sakit Position all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen sakit brach all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen sakit unit all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen sakit start date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen sakit end date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	
	Scenario: Admin Select Absen from dashboard to off
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
	Then Admin validate wrong input date
	
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
	Then Admin validate wrong input date
	
Scenario: Admin input form absen off end date lebih rendah dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih rendah dari start date
	Then Admin validate No Data

Scenario: Admin input form absen off Position all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen off brach all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen off unit all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen off start date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen off end date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	
	Scenario: Admin Select Absen from dashboard to shifting
	When Admin click list absen
	And Admin choose absen shifting
	Then Admin go to absen shifting
	
Scenario: Admin input form absen shifting position call center
	When Admin select position call center 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen shifting position admin credit
	When Admin select position manager
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen shifting position spg
	When Admin select position spg 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen shifting position null
	When Admin select position null 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen shifting branch bandung
	When Admin select position all 
	And Admin select branch bandung
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen shifting branch jakarta
	When Admin select position all 
	And Admin select branch jakarta
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen shifting branch surabaya
	When Admin select position all 
	And Admin select branch surabaya
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen shifting branch null
	When Admin select position all 
	And Admin select branch null
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen shifting unit airasia
	When Admin select position all 
	And Admin select branch all
	When Admin select unit airasia
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen shifting unit bca api
	When Admin select position all 
	And Admin select branch all
	When Admin select unit bca api
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen shifting branch it programmer
	When Admin select position all 
	And Admin select branch all
	When Admin select unit it programmer
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen shifting unit null
	When Admin select position all 
	And Admin select branch all
	When Admin select unit null
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen shifting start date lebih dari 1bulan dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih dari 1bulan and end date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen shifting start date lebih tinggi dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih tinggi dari end date
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen shifting end date lebih dari 1bulan dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih dari 1bulan and start date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen shifting end date lebih rendah dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih rendah dari start date
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen shifting Position all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen shifting brach all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen shifting unit all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen shifting start date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen shifting end date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	
	Scenario: Admin Select Absen from dashboard to non shifting
	When Admin click list absen
	And Admin choose absen non shifting
	Then Admin go to absen non shifting
	
Scenario: Admin input form absen non shifting position call center
	When Admin select position call center 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen non shifting position admin credit
	When Admin select position admin credit
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen non shifting position spg
	When Admin select position spg 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen non shifting position null
	When Admin select position null 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen non shifting branch bandung
	When Admin select position all 
	And Admin select branch bandung
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen non shifting branch jakarta
	When Admin select position all 
	And Admin select branch jakarta
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen non shifting branch surabaya
	When Admin select position all 
	And Admin select branch surabaya
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen non shifting branch null
	When Admin select position all 
	And Admin select branch null
	When Admin select unit all
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen non shifting unit airasia
	When Admin select position all 
	And Admin select branch all
	When Admin select unit airasia
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen non shifting unit bca api
	When Admin select position all 
	And Admin select branch all
	When Admin select unit bca api
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen non shifting branch it programmer
	When Admin select position all 
	And Admin select branch all
	When Admin select unit it programmer
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page
	
Scenario: Admin input form absen non shifting unit null
	When Admin select position all 
	And Admin select branch all
	When Admin select unit null
	And Admin input start date true and end date true
	Then Admin validate tidak ada data

Scenario: Admin input form absen non shifting start date lebih dari 1bulan dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih dari 1bulan and end date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen non shifting start date lebih tinggi dari end date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date lebih tinggi dari end date
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen non shifting end date lebih dari 1bulan dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih dari 1bulan and start date true
	Then Admin validate wrong input date
	
Scenario: Admin input form absen non shifting end date lebih rendah dari start date
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input end date lebih rendah dari start date
	Then Admin validate tidak ada data
	
Scenario: Admin input form absen non shifting Position all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen non shifting brach all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen non shifting unit all
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen non shifting start date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data
	And Refresh page

Scenario: Admin input form absen non shifting end date true
	When Admin select position all 
	And Admin select branch all
	When Admin select unit all
	And Admin input start date true and end date true
	And Admin click export data 
	Then Admin validate data

Scenario: Admin Checking file
	When Admin checking exist file
	
Scenario: Admin Logout
	When Admin click btnLogout
	Then Admin back to login TMS