# Yılan Oyunu 

### Kurallar 

- W,A,S,D ile yön verilerek çıkan yemleri yemeye ve hiçbiryere çarpmadan ilerlemeye çalışılır.
  - W -> Yukarı
  - A -> Sola
  - S -> Aşağı
  - D -> Sağa
- Yılan kendine yönlendirilirse oyun sonlandırılır.
- Duvara çarpınca oyun sonlanır.
- Kendine çarpınca oyun sonlanır.

### Girdi Bilgileri

- Girdi tek karakter olarak alınır.
- Eğer iki karakter olarak girdi alınırsa tekrar komut almaya yönlendirilir.
- Eğer yön dışında farklı bir karakter girilirse tekrar komut almaya yönlendirilir.


# Sınıflar

Uygulama 2 pakettir. Paketin ilkinde uygulama kontrolleri ve komutları vardır. Bu paket 4 sınıf halinda yazılmıştır. Ve ayrı bir 
pakette ise main metodu tetiklenmiştir. Sınıflardan ilki girdinin alındığı [Controller](https://github.com/Mustafa1919/Yilan-Oyunu/blob/master/src/mustafa/game/Controller.java)
sınıfı. Bu sınıfta kullanıcıdan komutlar alınmakta ve seçilen komut return edilmektedir. [Map](https://github.com/Mustafa1919/Yilan-Oyunu/blob/master/src/mustafa/game/Map.java)
sınıfı harita ile ilgili metodları içerir. [Logic](https://github.com/Mustafa1919/Yilan-Oyunu/blob/master/src/mustafa/game/Logic.java)
sınıfı oyun kontrollerini gerçekleştirir. Son olarak [Snake](https://github.com/Mustafa1919/Yilan-Oyunu/blob/master/src/mustafa/game/Snake.java)
sınıfı oyunun başlangıcını tetikler. Bu sınıfları daha detaylı inceleyelim.

### [Controller](https://github.com/Mustafa1919/Yilan-Oyunu/blob/master/src/mustafa/game/Controller.java)

Bu sınıf sadece kullanıcı girdisini alarak gerekli kontrolleri yapar(tek karatermi girdi?, doğru yön komutlarımı girildi? gibi). 
Ve seçilen yön karakteri geri dönüş değeri olarak döndürür.

### [Map](https://github.com/Mustafa1919/Yilan-Oyunu/blob/master/src/mustafa/game/Map.java)

Map sınıfı haritanın düzenlenmesi, yemin yerleştirilmesi ve haritanın çizilmesini sağlar.

1. initMap metodu
   - Haritanın başlangıc halini hazırlar.
   - Kenarlıkları çizer ve kalan yerlere boşluk değerini atar.
   
2. generateFeed metodu
   - Rasgele bir konumda yem üretir ve bunu haritaya yerleştirir.
   - Eğer rastgele seçilen yerde yılan bulunuyorsa yemi tekrar üreterek boş bir alan bulur.
   
3. printMap metodu
   - Haritayı kullanıcıya görünecek haliyle çizer. 

### [Logic](https://github.com/Mustafa1919/Yilan-Oyunu/blob/master/src/mustafa/game/Logic.java)

Logic sınıfı oyun kontrollerini yapıldığı sınıftır. Yılan yemi yedi mi?, duvara çarptı mı?, Kendine çarptı mı?

1. ifFeed metodu
   - Bir int dizi parametre olarak alır ve boolean bir değer döndürür.
   - Alınan parametre yılanın baş kısmının bulunduğu koordinatlardır. 
   - Eğer yılan yemi yediyse true, yemediyse false değer döndürür.

2. ifSelfHit metodu
   - Bir int dizi parametre olarak alır ve boolean bir değer döndürür.
   - Alınan parametre yılanın baş kısmının bulunduğu koordinatlardır. 
   - Eğer yılan seçilen koordinatta kendine çarpıyorsa true, çarpmıyorsa false değer döndürür.
   
 3. ifHitBorder metodu
    - Bir int dizi parametre olarak alır ve boolean bir değer döndürür.
    - Alınan parametre yılanın baş kısmının bulunduğu koordinatlardır. 
    - Eğer yılan baş kısmı kenarlıkların bulunduğu noktaya geliyorsa yılan duvara çarptığı saptanır.
      Duvara geldiği zaman true, duvara çarpmıyosa false değer döndürür.
  
  ### [Snake](https://github.com/Mustafa1919/Yilan-Oyunu/blob/master/src/mustafa/game/Snake.java)
  
  Snake sınıfı oyun başlangıcının tetiklendiği sınıftır. 
  
  1. startGame metodu
     - Yılanın harita üzerinde başlayacağı konum hesaplanır ve baş kısmı değeri bir dizide tutulur.
     - İlk başlıycağı koordinatlar üzerine yılan çizilir.
     - Yemin üretileceği metod çağrılır ve harita çizilir.
     - While döngüsü ile oyun başlar. 
     - Yön bilgileri gerekli metod çağrılarak alınır ve hangi yöne gideceği belirlenir.
     - Belirlenen yöne göre yılanın baş koordinatları güncellenir.
     - Oyunun sonlanıp sonlanmadığı kontrolü yapılır. Sonlanmadı ise yemi yedi mi kontrolu gerçikleştirilir.
     
   2. drawSnake metodu
      - Yılanın baş bilgileri kopyalanır. Ve yılan hareket ettirilir. 
      - Yılan hareketi adım adım gerçekleştirilir. 
  
 














