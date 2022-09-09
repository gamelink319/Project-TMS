package Utils;

public enum TestScenarioStaff {
	
	T1(""),
	T2(""),
	T3("");
	
	private String testTMS;
	
	TestScenarioStaff(String value) {
		testTMS = value;
	}
	
	public String getTestTMSStaff() {
		return testTMS;
	}
}