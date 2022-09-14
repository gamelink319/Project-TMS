package Utils;

public enum TestScenarioAdmin {
	
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
	T19("Admin input form absen sakit positife"),
	T20("Admin Logout");

	private String testTMS;
	
	TestScenarioAdmin(String value) {
		testTMS = value;
	}
	
	public String getTestTMSAdmin() {
		return testTMS;
	}
}