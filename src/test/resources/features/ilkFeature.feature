Feature:Kitapyurdu Sayfasi Testi
@a1 @b
Scenario: KitapYurdu sayfasinda arama kutusunda kitap aratilir
  Given kullanici kitapyurdu sayfasina gider
  And kullanici 2 saniye bekler
  Then kullanici kitapyurdu arama kutusunda Suc ve Ceza aratir
  And kullanici 6 saniye bekler
  And kullanici cikan sonuclardan ilk urunu sepete ekler
  And kullanici 2 saniye bekler
  And kullanici sayfayi kapatir



