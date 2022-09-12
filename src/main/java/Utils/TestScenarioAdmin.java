package Utils;

public enum TestScenarioAdmin {
	
	T1("Admin valid login"),
	T2("Admin Select Absen from dashboard"),
	T3("Admin input form absen masuk position null"),
	T4("Admin input form absen masuk true");
	
	private String testTMS;
	
	TestScenarioAdmin(String value) {
		testTMS = value;
	}
	
	public String getTestTMSAdmin() {
		return testTMS;
	}
}

//T1("Admin valid login"),
//T2("Admin invalid login"),
//T3("Admin Login null username"),
//T4("Admin Login null password");

//T1("Admin valid login"),
//T2("Admin Select Absen from dashboard"),
//T3("Admin input form absen masuk");