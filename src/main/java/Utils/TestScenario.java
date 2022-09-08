package Utils;

public enum TestScenario {
	
	T1(""),
	T2(""),
	T3("");
	
	private String testTMS;
	
	TestScenario(String value) {
		testTMS = value;
	}
	
	public String getTestTMS() {
		return testTMS;
	}
}