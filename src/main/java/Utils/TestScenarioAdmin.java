package Utils;

public enum TestScenarioAdmin {
	
	T1(""),
	T2(""),
	T3("");
	
	private String testTMS;
	
	TestScenarioAdmin(String value) {
		testTMS = value;
	}
	
	public String getTestTMSAdmin() {
		return testTMS;
	}
}