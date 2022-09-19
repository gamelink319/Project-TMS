package Utils;

public enum TestScenarioStaff {
	
	T01("Staff Login Website"),
	T02("Select Absen Staff"),
	T03("Input Form Absen Masuk Selfie Null"),
	T04("Input Form Absen Masuk Divisi Null"),
	T05("Input Form Absen Masuk Tipe Shift Null"),
	T06("Input Form Absen Masuk Nama Shift Null"),
	T07("Input Form Absen Masuk Tipe Absen Null"),
	T08("Input Form Absen Masuk Keterangan Null"),
	T09("Input Form Absen Masuk"),
	T10("Input Form Absen Pulang");
	
	private String testTMS;
	
	TestScenarioStaff(String value) {
		testTMS = value;
	}
	
	public String getTestTMSStaff() {
		return testTMS;
	}
}