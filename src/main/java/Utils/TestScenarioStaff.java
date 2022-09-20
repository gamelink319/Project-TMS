package Utils;

public enum TestScenarioStaff {
	

//	T1("Staff login website"),
//	T2("Staff select form absen sakit"),
//	T3("Staff failed upload file1"),
//	T4("input data form absen sakit"),
//	T5("input divisi"),
//	T6("input shift"),
//	T7("input tipe absen"),
//	T8("input keterangan"),
//	T9("submit success"),
//	T10("Staff logout website");
	
	T1("Staff Login Website"),
	T2("Staff Choose form absen off"),
	T3("Staff failed upload foto"),
	T4("Staff input data form absen off"),
	T5("input divisis"),
	T6("input shifts"),
	T7("input tipe absens"),
	T8("input keterangann"),
	T9("submit berhasil"),
	T10("Logout website");
	
	private String testTMS;
	
	TestScenarioStaff(String value) {
		testTMS = value;
	}
	
	public String getTestTMSStaff() {
		return testTMS;
	}
}