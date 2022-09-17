package Utils;

public enum TestScenario {
	
	T1("Staff not type NIK"),
	T2("Staff not type password"),
	T3("Staff invalid login"),
	T4("Staff valid login"),
	T5("Staff get form absen izin"),
	T6("Staff showing button choose"),
	T7("Staff showing select box divisi"),
	T8(" Staff showing select box nama shift"),
	T9("Staff showing select box type absen"),
	T10("Staff showing text area keterangan"),
	T11("Staff showing button submit"),
	T12("Staff not upload foto"),
	T13("Staff upload wrong type"),
	T14("Staff upload correct type"),
	T15("Divisi not choosen"),
	T16("Staff select attraction"),
	T17("Staff select rent car"),
	T18("Staff select call center"),
	T19("Tipe shift not choosen"),
	T20("Staff select call center 1"),
	T21("Staff select call center 2"),
	T22("Nama shift not choosen"),
	T23("Staff select non shift"),
	T24("Staff select D1"),
	T25("Staff select D2"),
	T26("Staff select D3"),
	T27("Staff senin pagi"),
	T28("Staff senin middle"),
	T29("Staff senin siang"),
	T30("Tipe Absen not choosen"),
	T31("Staff select WFH"),
	T32("Staff select WFO"),
	T33("Null text"),
	T34("Staff input text"),
	T35("Data not received"),
	T36("Data sent successfully"),
	T37("Staff valid logout from navbar"),
	T38("Staff valid logout from profil");
	
	
	
	private String testTMS;
	
	TestScenario(String value) {
		testTMS = value;
	}
	
	public String getTestTMS() {
		return testTMS;
	}
}