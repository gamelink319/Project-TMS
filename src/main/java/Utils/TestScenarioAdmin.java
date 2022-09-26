package Utils;

public enum TestScenarioAdmin {
	
	T1("Staff not type NIK"),
	T2("Staff not type password"),
	T3("Staff invalid login"),
	T4("Staff valid login"),
	T5("Staff get form absen izin"),
	T6("Staff showing button choose"),
	T7("Staff showing select box divisi"),
	T8("Staff showing select box nama shift"),
	T9("Staff showing select box type absen"),
	T10("Staff showing text area keterangan"),
	T11("Staff showing button submit"),
	T12("Staff not upload foto"),
	T13("Staff upload wrong type"),
	T14("Staff upload correct type"),
	T15("Divisi not choosen"),
	T16("Staff select attraction"),
	T17("Staff select rent car"),
	T18("Staff select call center"),
	T19("Tipe shift not choosen"),
	T20("Staff select call center 1"),
	T21("Staff select call center 2"),
	T22("Nama shift not choosen"),
	T23("Staff select non shift"),
	T24("Staff select D1"),
	T25("Staff select D2"),
	T26("Staff select D3"),
	T27("Staff senin pagi"),
	T28("Staff senin middle"),
	T29("Staff senin siang"),
	T30("Tipe Absen not choosen"),
	T31("Staff select WFH"),
	T32("Staff select WFO"),
	T33("Null text"),
	T34("Staff input text"),
	T35("Data not received"),
	T36("Data sent successfully"),
	T37("Staff valid logout from navbar"),
	T38("Staff valid logout from profil"),
	T39("Staff login website"),
	T40("Staff select form absen sakit"),
	T41("Staff failed upload file1"),
	T42("input data form absen sakit"),
	T43("input divisi"),
	T44("input shift"),
	T45("input tipe absen"),
	T46("input keterangan"),
	T47("submit success"),
	T48("Staff logout website"),
	T49("Staff Login Website"),
	T50("Staff Choose form absen off"),
	T51("Staff failed upload foto"),
	T52("Staff input data form absen off"),
	T53("input divisis"),
	T54("input shifts"),
	T55("input tipe absens"),
	T56("input keterangann"),
	T57("submit berhasil"),
	T58("Logout website"),
	T59("Staff Login Website"),
	T60("Select Absen Staff"),
	T61("Input Form Absen Masuk Selfie Null"),
	T62("Input Form Absen Masuk Divisi Null"),
	T63("Input Form Absen Masuk Tipe Shift Null"),
	T64("Input Form Absen Masuk Nama Shift Null"),
	T65("Input Form Absen Masuk Tipe Absen Null"),
	T66("Input Form Absen Masuk Keterangan Null"),
	T67("Input Form Absen Masuk"),
	T68("Input Form Absen Pulang"),
	T69("Admin valid login"),
	T70("Admin Select Absen from dashboard to masuk"),
	T71("Admin input form absen masuk position call center"),
	T72("Admin input form absen masuk position administrasi"),
	T73("Admin input form absen masuk position spg"),
	T74("Admin input form absen masuk position null"),
	T75("Admin input form absen masuk branch bandung"),
	T76("Admin input form absen masuk branch jakarta"),
	T77("Admin input form absen masuk branch surabaya"),
	T78("Admin input form absen masuk branch null"),
	T79("Admin input form absen masuk unit airasia"),
	T80("Admin input form absen masuk unit bca api"),
	T81("Admin input form absen masuk unit it programmer"),
	T82("Admin input form absen masuk unit null"),
	T83("Admin input form absen masuk start date lebih dari 1bulan dari end date"),
	T84("Admin input form absen masuk start date lebih tinggi dari end date"),
	T85("Admin input form absen masuk end date lebih dari 1bulan dari start date"),
	T86("Admin input form absen masuk end date lebih rendah dari start date"),
	T87("Admin input form absen masuk possition all"),
	T88("Admin input form absen masuk branch all"),
	T89("Admin input form absen masuk unit all"),
	T90("Admin input form absen masuk start date true"),
	T91("Admin input form absen masuk end date true"),
	T92("Admin Select Absen from dashboard to pulang"),
	T93("Admin input form absen pulang position call center"),
	T94("Admin input form absen pulang position administrasi"),
	T95("Admin input form absen pulang position spg"),
	T96("Admin input form absen pulang position null"),
	T97("Admin input form absen pulang branch bandung"),
	T98("Admin input form absen pulang branch jakarta"),
	T99("Admin input form absen pulang branch surabaya"),
	T100("Admin input form absen pulang branch null"),
	T101("Admin input form absen pulang unit airasia"),
	T102("Admin input form absen pulang unit bca api"),
	T103("Admin input form absen pulang unit it programmer"),
	T104("Admin input form absen pulang unit null"),
	T105("Admin input form absen pulang start date lebih dari 1bulan dari end date"),
	T106("Admin input form absen pulang start date lebih tinggi dari end date"),
	T107("Admin input form absen pulang end date lebih dari 1bulan dari start date"),
	T108("Admin input form absen pulang end date lebih rendah dari start date"),
	T109("Admin input form absen pulang possition all"),
	T110("Admin input form absen pulang branch all"),
	T111("Admin input form absen pulang unit all"),
	T112("Admin input form absen pulang start date true"),
	T113("Admin input form absen pulang end date true"),
	T114("Admin Select Absen from dashboard to sakit"),
	T115("Admin input form absen sakit position call center"),
	T116("Admin input form absen sakit position administrasi"),
	T117("Admin input form absen sakit position spg"),
	T118("Admin input form absen sakit position null"),
	T119("Admin input form absen sakit branch bandung"),
	T120("Admin input form absen sakit branch jakarta"),
	T121("Admin input form absen sakit branch surabaya"),
	T122("Admin input form absen sakit branch null"),
	T123("Admin input form absen sakit unit airasia"),
	T124("Admin input form absen sakit unit bca api"),
	T125("Admin input form absen sakit unit it programmer"),
	T126("Admin input form absen sakit unit null"),
	T127("Admin input form absen sakit start date lebih dari 1bulan dari end date"),
	T128("Admin input form absen sakit start date lebih tinggi dari end date"),
	T129("Admin input form absen sakit end date lebih dari 1bulan dari start date"),
	T130("Admin input form absen sakit end date lebih rendah dari start date"),
	T131("Admin input form absen sakit possition all"),
	T132("Admin input form absen sakit branch all"),
	T133("Admin input form absen sakit unit all"),
	T134("Admin input form absen sakit start date true"),
	T135("Admin input form absen sakit end date true"),
	T136("Admin Select Absen from dashboard to off"),
	T137("Admin input form absen off position call center"),
	T138("Admin input form absen off position administrasi"),
	T139("Admin input form absen off position spg"),
	T140("Admin input form absen off position null"),
	T141("Admin input form absen off branch bandung"),
	T142("Admin input form absen off branch jakarta"),
	T143("Admin input form absen off branch surabaya"),
	T144("Admin input form absen off branch null"),
	T145("Admin input form absen off unit airasia"),
	T146("Admin input form absen off unit bca api"),
	T147("Admin input form absen off unit it programmer"),
	T148("Admin input form absen off unit null"),
	T149("Admin input form absen off start date lebih dari 1bulan dari end date"),
	T150("Admin input form absen off start date lebih tinggi dari end date"),
	T151("Admin input form absen off end date lebih dari 1bulan dari start date"),
	T152("Admin input form absen off end date lebih rendah dari start date"),
	T153("Admin input form absen off possition all"),
	T154("Admin input form absen off branch all"),
	T155("Admin input form absen off unit all"),
	T156("Admin input form absen off start date true"),
	T157("Admin input form absen off end date true"),
	T158("Admin Select Absen from dashboard to shifting"),
	T159("Admin input form absen shifting position call center"),
	T160("Admin input form absen shifting position administrasi"),
	T161("Admin input form absen shifting position spg"),
	T162("Admin input form absen shifting position null"),
	T163("Admin input form absen shifting branch bandung"),
	T164("Admin input form absen shifting branch jakarta"),
	T165("Admin input form absen shifting branch surabaya"),
	T166("Admin input form absen shifting branch null"),
	T167("Admin input form absen shifting unit airasia"),
	T168("Admin input form absen shifting unit bca api"),
	T169("Admin input form absen shifting unit it programmer"),
	T170("Admin input form absen shifting unit null"),
	T171("Admin input form absen shifting start date lebih dari 1bulan dari end date"),
	T172("Admin input form absen shifting start date lebih tinggi dari end date"),
	T173("Admin input form absen shifting end date lebih dari 1bulan dari start date"),
	T174("Admin input form absen shifting end date lebih rendah dari start date"),
	T175("Admin input form absen shifting possition all"),
	T176("Admin input form absen shifting branch all"),
	T177("Admin input form absen shifting unit all"),
	T178("Admin input form absen shifting start date true"),
	T179("Admin input form absen shifting end date true"),
	T180("Admin Select Absen from dashboard to non shifting"),
	T181("Admin input form absen non shifting position call center"),
	T182("Admin input form absen non shifting position administrasi"),
	T183("Admin input form absen non shifting position spg"),
	T184("Admin input form absen non shifting position null"),
	T185("Admin input form absen non shifting branch bandung"),
	T186("Admin input form absen non shifting branch jakarta"),
	T187("Admin input form absen non shifting branch surabaya"),
	T188("Admin input form absen non shifting branch null"),
	T189("Admin input form absen non shifting unit airasia"),
	T190("Admin input form absen non shifting unit bca api"),
	T191("Admin input form absen non shifting unit it programmer"),
	T192("Admin input form absen non shifting unit null"),
	T193("Admin input form absen non shifting start date lebih dari 1bulan dari end date"),
	T194("Admin input form absen non shifting start date lebih tinggi dari end date"),
	T195("Admin input form absen non shifting end date lebih dari 1bulan dari start date"),
	T196("Admin input form absen non shifting end date lebih rendah dari start date"),
	T197("Admin input form absen non shifting possition all"),
	T198("Admin input form absen non shifting branch all"),
	T199("Admin input form absen non shifting unit all"),
	T200("Admin input form absen non shifting start date true"),
	T201("Admin input form absen non shifting end date true"),
	T202("Admin Checking file"),
	T203("Admin Logout");
	
	private String testTMS;
	
	TestScenarioAdmin(String value) {
		testTMS = value;
	}
	
	public String getTestTMSAdmin() {
		return testTMS;
	}
}
/* 
 --------------------AdminLogin----------------
T01("Admin invalid login"),
T02("Admin Login null username"),
T03("Admin Login null password"),
T04("Admin valid login"),
T05("Admin Logout"); 
 
------------------- AdminReportMasuk-----------------
T01("Admin valid login"),
T02("Admin Select Absen from dashboard"),
T03("Admin input form absen masuk position call center"),
T04("Admin input form absen masuk position administrasi"),
T05("Admin input form absen masuk position spg"),
T06("Admin input form absen masuk position null"),
T07("Admin input form absen masuk branch bandung"),
T08("Admin input form absen masuk branch jakarta"),
T09("Admin input form absen masuk branch surabaya"),
T10("Admin input form absen masuk branch null"),
T11("Admin input form absen masuk unit airasia"),
T12("Admin input form absen masuk unit bca api"),
T13("Admin input form absen masuk unit it programmer"),
T14("Admin input form absen masuk unit null"),
T15("Admin input form absen masuk start date lebih dari 1bulan dari end date"),
T16("Admin input form absen masuk start date lebih tinggi dari end date"),
T17("Admin input form absen masuk end date lebih dari 1bulan dari start date"),
T18("Admin input form absen masuk end date lebih rendah dari start date"),
T19("Admin input form absen masuk possition all"),
T20("Admin input form absen masuk branch all"),
T21("Admin input form absen masuk unit all"),
T22("Admin input form absen masuk start date true"),
T23("Admin input form absen masuk end date true"),
T24("Admin Checking file"),
T25("Admin Logout");

------------------Admin Report Pulang-------------------
T01("Admin valid login"),
T02("Admin Select Absen from dashboard"),
T03("Admin input form absen pulang position call center"),
T04("Admin input form absen pulang position administrasi"),
T05("Admin input form absen pulang position spg"),
T06("Admin input form absen pulang position null"),
T07("Admin input form absen pulang branch bandung"),
T08("Admin input form absen pulang branch jakarta"),
T09("Admin input form absen pulang branch surabaya"),
T10("Admin input form absen pulang branch null"),
T11("Admin input form absen pulang unit airasia"),
T12("Admin input form absen pulang unit bca api"),
T13("Admin input form absen pulang unit it programmer"),
T14("Admin input form absen pulang unit null"),
T15("Admin input form absen pulang start date lebih dari 1bulan dari end date"),
T16("Admin input form absen pulang start date lebih tinggi dari end date"),
T17("Admin input form absen pulang end date lebih dari 1bulan dari start date"),
T18("Admin input form absen pulang end date lebih rendah dari start date"),
T19("Admin input form absen pulang possition all"),
T20("Admin input form absen pulang branch all"),
T21("Admin input form absen pulang unit all"),
T22("Admin input form absen pulang start date true"),
T23("Admin input form absen pulang end date true"),
T24("Admin Checking file");
T25("Admin Logout");

----------------------Admin Report Sakit-----------------------
T01("Admin valid login"),
T02("Admin Select Absen from dashboard"),
T03("Admin input form absen sakit position call center"),
T04("Admin input form absen sakit position administrasi"),
T05("Admin input form absen sakit position spg"),
T06("Admin input form absen sakit position null"),
T07("Admin input form absen sakit branch bandung"),
T08("Admin input form absen sakit branch jakarta"),
T09("Admin input form absen sakit branch surabaya"),
T10("Admin input form absen sakit branch null"),
T11("Admin input form absen sakit unit airasia"),
T12("Admin input form absen sakit unit bca api"),
T13("Admin input form absen sakit unit it programmer"),
T14("Admin input form absen sakit unit null"),
T15("Admin input form absen sakit start date lebih dari 1bulan dari end date"),
T16("Admin input form absen sakit start date lebih tinggi dari end date"),
T17("Admin input form absen sakit end date lebih dari 1bulan dari start date"),
T18("Admin input form absen sakit end date lebih rendah dari start date"),
T19("Admin input form absen sakit possition all"),
T20("Admin input form absen sakit branch all"),
T21("Admin input form absen sakit unit all"),
T22("Admin input form absen sakit start date true"),
T23("Admin input form absen sakit end date true"),
T24("Admin Checking file"),
T25("Admin Logout");

---------------------Admin Report Off---------------------------
T01("Admin valid login"),
T02("Admin Select Absen from dashboard"),
T03("Admin input form absen off position call center"),
T04("Admin input form absen off position administrasi"),
T05("Admin input form absen off position spg"),
T06("Admin input form absen off position null"),
T07("Admin input form absen off branch bandung"),
T08("Admin input form absen off branch jakarta"),
T09("Admin input form absen off branch surabaya"),
T10("Admin input form absen off branch null"),
T11("Admin input form absen off unit airasia"),
T12("Admin input form absen off unit bca api"),
T13("Admin input form absen off unit it programmer"),
T14("Admin input form absen off unit null"),
T15("Admin input form absen off start date lebih dari 1bulan dari end date"),
T16("Admin input form absen off start date lebih tinggi dari end date"),
T17("Admin input form absen off end date lebih dari 1bulan dari start date"),
T18("Admin input form absen off end date lebih rendah dari start date"),
T19("Admin input form absen off possition all"),
T20("Admin input form absen off branch all"),
T21("Admin input form absen off unit all"),
T22("Admin input form absen off start date true"),
T23("Admin input form absen off end date true"),
T24("Admin Checking file");
T25("Admin Logout");

------------------------Admin Report Shifting---------------------
T01("Admin valid login"),
T02("Admin Select Absen from dashboard"),
T03("Admin input form absen shifting position call center"),
T04("Admin input form absen shifting position administrasi"),
T05("Admin input form absen shifting position spg"),
T06("Admin input form absen shifting position null"),
T07("Admin input form absen shifting branch bandung"),
T08("Admin input form absen shifting branch jakarta"),
T09("Admin input form absen shifting branch surabaya"),
T10("Admin input form absen shifting branch null"),
T11("Admin input form absen shifting unit airasia"),
T12("Admin input form absen shifting unit bca api"),
T13("Admin input form absen shifting unit it programmer"),
T14("Admin input form absen shifting unit null"),
T15("Admin input form absen shifting start date lebih dari 1bulan dari end date"),
T16("Admin input form absen shifting start date lebih tinggi dari end date"),
T17("Admin input form absen shifting end date lebih dari 1bulan dari start date"),
T18("Admin input form absen shifting end date lebih rendah dari start date"),
T19("Admin input form absen shifting possition all"),
T20("Admin input form absen shifting branch all"),
T21("Admin input form absen shifting unit all"),
T22("Admin input form absen shifting start date true"),
T23("Admin input form absen shifting end date true"),
T24("Admin Checking file");
T25("Admin Logout");

------------------------Admin Report Non Shifting---------------------
T01("Admin valid login"),
T02("Admin Select Absen from dashboard"),
T03("Admin input form absen non shifting position call center"),
T04("Admin input form absen non shifting position administrasi"),
T05("Admin input form absen non shifting position spg"),
T06("Admin input form absen non shifting position null"),
T07("Admin input form absen non shifting branch bandung"),
T08("Admin input form absen non shifting branch jakarta"),
T09("Admin input form absen non shifting branch surabaya"),
T10("Admin input form absen non shifting branch null"),
T11("Admin input form absen non shifting unit airasia"),
T12("Admin input form absen non shifting unit bca api"),
T13("Admin input form absen non shifting unit it programmer"),
T14("Admin input form absen non shifting unit null"),
T15("Admin input form absen non shifting start date lebih dari 1bulan dari end date"),
T16("Admin input form absen non shifting start date lebih tinggi dari end date"),
T17("Admin input form absen non shifting end date lebih dari 1bulan dari start date"),
T18("Admin input form absen non shifting end date lebih rendah dari start date"),
T19("Admin input form absen non shifting possition all"),
T20("Admin input form absen non shifting branch all"),
T21("Admin input form absen non shifting unit all"),
T22("Admin input form absen non shifting start date true"),
T23("Admin input form absen non shifting end date true"),
T24("Admin Checking file"),
T25("Admin Logout");
*/
