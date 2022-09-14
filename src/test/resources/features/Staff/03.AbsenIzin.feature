Feature: Absen Izin

  @tag1
  Scenario: Staff get form absen izin	
    When Staff go to web ptdika
    And Staff enter own nik and password
    And Staff click button login
    And Staff click laporan kegiatan
    And Staff choose dan click absen izin
    Then Staff at form absen izin

  