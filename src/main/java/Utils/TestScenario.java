package Utils;

public enum TestScenario {
	
	T1("Staff valid loginB1"),
	T2("Staff valid loginB2");
	
	
	private String testTMS;
	
	TestScenario(String value) {
		testTMS = value;
	}
	
	public String getTestTMS() {
		return testTMS;
	}
}