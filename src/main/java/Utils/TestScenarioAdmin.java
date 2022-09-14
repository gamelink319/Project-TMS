package Utils;

public enum TestScenarioAdmin {
	
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
	T19("Admin input form absen off positife"),
	T20("Admin Logout");

	private String testTMS;
	
	TestScenarioAdmin(String value) {
		testTMS = value;
	}
	
	public String getTestTMSAdmin() {
		return testTMS;
	}
}