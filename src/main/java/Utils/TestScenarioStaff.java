package Utils;

public enum TestScenarioStaff {
	
	T1("Staff Login Website"),
	T2("Select Absen Staff"),
	T3("Input Form Absen Masuk Selfie Null"),
	T4("Input Form Absen Masuk Divisi Null"),
	T5("Input Form Absen Masuk Tipe Shift Null"),
	T6("Input Form Absen Masuk Nama Shift Null"),
	T7("Input Form Absen Masuk Tipe Absen Null"),
	T8("Input Form Absen Masuk Keterangan Null"),
	T9("Input Form Absen Masuk"),
	T10("Input Form Absen Pulang");
	
	
	private String testTMS;
	
	TestScenarioStaff(String value) {
		testTMS = value;
	}
	
	public String getTestTMSStaff() {
		return testTMS;
	}
}