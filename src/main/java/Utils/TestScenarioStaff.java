package Utils;

public enum TestScenarioStaff {
	
	T1("Staff login website"),
	T2("Select absen staff"),
	T3("Input form absen masuk"),
	T4("Input form absen pulang");
	
	
	private String testTMS;
	
	TestScenarioStaff(String value) {
		testTMS = value;
	}
	
	public String getTestTMSStaff() {
		return testTMS;
	}
}