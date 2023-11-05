Feature: Kitapyurdu Testi
  @bc
  Scenario: Kitapyurdunda kitap aramasi yapilir
    Given kullanici kitapyurdu sayfasina gider
    And kitapyurdu arama kutusunda verilen kitaplar aratilir ve sepete eklenir
    |kitaplar|
    |Suc ve Ceza|
    |Simyaci|
    And kullanici sayfayi yeniler
    And kullanici sayfayi kapatir
