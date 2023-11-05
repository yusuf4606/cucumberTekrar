Feature: US001 Amazon Testi
  Background: Amazon sayfasina gidilir
    Given kullanici parametreli method ile "https://amazon.com/" sayfasina gider
    And kullanici sayfayi yeniler
    * kullanici 2 saniye bekler


  @c
  Scenario: Arama kutusunda Nokia aratilir
    And kullanici parametreli method ile amazonda "Nokia" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfayi yeniler
    And kullanici sayfayi kapatir


  Scenario: Arama kutusunda Iphone aratilir
    And kullanici parametreli method ile amazonda "iphone" aratir
    And kullanici 2 saniye bekler
    And kullanici sayfayi yeniler
    And kullanici sayfayi kapatir

