# Faz 2 - AI Pair Programming Logu

**AI'a sorduğum soru (Prompt):** "Sisteme dışarıdan bir WhatsApp servisi eklemek istiyorum ama metodları benim Bildirim interface'ime uymuyor. 
Adapter pattern burada uygun mu, yoksa Facade mı? Farkını açıkla."

**AI'ın Yanıtı:** AI, burada kesinlikle **Adapter** kullanmam gerektiğini söyledi. 
Nedenini de şöyle açıkladı: "Adapter, birbiriyle uyumsuz iki arayüzü (interface) konuşturmak için kullanılır. 
Facade ise çok karmaşık bir alt sistemin (örneğin onlarca sınıftan oluşan bir video işleme kütüphanesi) önüne basit bir arayüz koymak için kullanılır. 
Senin elinde karmaşık bir sistem yok, sadece metod isimleri ve parametreleri uyuşmayan bir sınıf var, bu yüzden Adapter tam biçilmiş kaftan."

**AI'ın Eksik Kaldığı Yer ve Benim Yorumum:** AI, WhatsApp entegrasyonu için doğru yönlendirdi ancak yönergedeki "mevcut kodu kırmadan özellik ekleme" kısmında bana tam bir vizyon çizemedi. 
Loglama işlemini her sınıfa tek tek eklememi önerecek kadar saçmaladığı bir an oldu. 
Ben müdahale edip "Decorator kullansak ana sınıfları değiştirmeden bu işi çözmez miyiz?" dediğimde "Evet, haklısın, Decorator (Dekoratör) OCP'ye çok daha uygun" diyerek kendini düzeltti. 
Sonuç olarak loglama için Decorator, WhatsApp için Adapter uyguladım.
