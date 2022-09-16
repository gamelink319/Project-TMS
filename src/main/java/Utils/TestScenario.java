package Utils;

public enum TestScenario {
	
	T1("Divisi not choosen"),
	T2("Staff select attraction"),
	T3("Staff select rent car"),
	T4("Staff select call center"),
	T5("Staff showing select box type absen"),
	T6("Staff showing text area keterangan"),
	T7("Staff showing button submit");
	
	
	private String testTMS;
	
	TestScenario(String value) {
		testTMS = value;
	}
	
	public String getTestTMS() {
		return testTMS;
	}
}