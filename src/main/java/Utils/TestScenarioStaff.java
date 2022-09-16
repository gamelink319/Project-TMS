package Utils;

public enum TestScenarioStaff {
	
	T1("Staff Login Website"),
	T2("Select Absen Staff"),
	T3("Input Form Absen Masuk"),
	T4("Input Form Absen Pulang");
	
	
	private String testTMS;
	
	TestScenarioStaff(String value) {
		testTMS = value;
	}
	
	public String getTestTMSStaff() {
		return testTMS;
	}
}