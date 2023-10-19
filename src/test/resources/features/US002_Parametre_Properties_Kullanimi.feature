Feature: KitapYurdu testi
  Scenario: KitapYurdu sayfasinda arama kutusunda kitap aratilir
    Given kullanici kitapyurdu sayfasina gider
    And kullanici 2 saniye bekler
    Then kullanici kitapyurdunda properties den "kitap3" arama yapar
    And kullanici 2 saniye bekler
    And kullanici cikan sonuclardan ilk urunu sepete ekler
    And kullanici 2 saniye bekler
    And kullanici sayfayi kapatir