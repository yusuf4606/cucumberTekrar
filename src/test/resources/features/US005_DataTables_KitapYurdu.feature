Feature: Kitapyurdu Testi
  Scenario: Kitapyurdunda Login islemleri
Given kullanici kitapyurdu sayfasina gider
    Then kullanici 2 saniye bekler
    And kitapyurdunda verilen email ve password ile giris yapar
    |email  bilgileri             |password bilgileri |
    |jaced.ortels@yopmail.com     |b171team02|
    |kaeson.kaylon@free2ducks.com |b111t023  |
    And kullanici 2 saniye bekler
    And kullanici sayfayi kapatir


