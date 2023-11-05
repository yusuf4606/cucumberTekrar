Feature: Kitapyurdunda login islemleri
  Scenario Outline: Kitapyurdu sayfasina kayitli kullanici adi ve sifrelerle giris yapilir
    Given kullanici kitapyurdu sayfasina gider
    And kullanici 2 saniye bekler
    And kitapyurdu sayfasinda girisyap butonuna tiklar
    And verilen "<email>" ve "<password>" lerle giris yapar
    And kullanici sayfayi yeniler
    And kullanici sayfayi kapatir
    Examples:
      | email | password |
      | kyEmail1 | b171team02 |
      | kyEmail2 | b111t023 |



  Scenario Outline: KitapYurdu sayfasinda arama kutusunda kitap aratir
    Given kullanici kitapyurdu sayfasina gider
    And kullanici 2 saniye bekler
    Then kitapyurdu arama kutusunda verilen "<kitaplar>" aratilir
    And kullanici 2 saniye bekler
    And kullanici cikan sonuclardan ilk urunu sepete ekler
    And kullanici 2 saniye bekler
    And kullanici sayfayi kapatir
    Examples:
      | kitaplar |
      | Dirilis |
      | Simyaci |
      | Yuzuklerin Efendisi |




