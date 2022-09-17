package Utils;

public enum TestScenarioStaff {
	

	T1("Staff login website"),
	T2("Staff select form absen sakit"),
	T3("Staff input data form absen sakit"),
	T4("Staff logout website");
	
	private String testTMS;
	
	TestScenarioStaff(String value) {
		testTMS = value;
	}
	
	public String getTestTMSStaff() {
		return testTMS;
	}
}