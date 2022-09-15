package Utils;

public enum TestScenario {
	
	T1("Staff not upload foto"),
	T2("Staff upload wrong type"),
	T3("SStaff upload correct type");
//	T4("Staff showing select box nama shift"),
//	T5("Staff showing select box type absen"),
//	T6("Staff showing text area keterangan"),
//	T7("Staff showing button submit");
	
	
	private String testTMS;
	
	TestScenario(String value) {
		testTMS = value;
	}
	
	public String getTestTMS() {
		return testTMS;
	}
}