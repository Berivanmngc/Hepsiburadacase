# Hepsiburadacase
Bu projeninin Aamacı; 
Andriod uygulama için test otomasyonu yazmak.(Projede Hepsi Burada uygulaması kullanılmıştır)
Projede kullanılan uygulama ve teknolojiler;
-Appium
-Intellij IDEA
-Android Studio-Emülator

Projeninin Aşamaları;
Android Studio AVD manager üzerinden "Create virtual device" seçeneğine tıklayarak bir cihaz oluşturulur
Oluşturduğumuz cihazı emülatör de çalıştırarak,cihaza Hepsi burada uygulamasını yüklenilir
Uygulamayı ayağa kaldırmak için activity ve packagename bilgilerine ihtiyacımız var,bunun için cihaza apk info uygulamasını indirerek bu bilgileri alınır
Appium da cihaz'ın ve uygulamanın "deviceName", "platformName", "platformVersion","appPackage","appActivity" bilgilerini girerek emulatöre bağlanılır
Appium inspector penceresinden element bilgilerini alarak Intellij Idea uygulaması üzerinden test caseleri java ile yazılır
