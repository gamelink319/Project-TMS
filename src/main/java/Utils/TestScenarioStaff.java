package Utils;

public enum TestScenarioStaff {
	
	T1("login website"),
	T2("select absen staff"),
	T3("input form absen masuk");
	
	
	private String testTMS;
	
	TestScenarioStaff(String value) {
		testTMS = value;
	}
	
	public String getTestTMSStaff() {
		return testTMS;
	}
}