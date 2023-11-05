Feature: Kitapyurdunda login islemleri

  @bc
  Scenario Outline: Kitapyurdu sayfasina kayitli kullanici adi ve sifrelerle login yapilir
    Given kullanici kitapyurdu sayfasina gider
    And kullanici 2 saniye bekler
    And kitapyurdu sayfasinda girisyap butonuna tiklar
    And verilen "<email>" ve "<password>" lerle giris yapar
    And kullanici adina imleci surukler
    And kullanici sayfayi yeniler
    And kullanici sayfayi kapatir
    Examples:
      | email                    | password   |
      | jaced.ortels@yopmail.com | b171team02 |
