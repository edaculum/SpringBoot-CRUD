# Spring Boot CRUD REST API Örneği

Bu proje, **Spring Boot** kullanılarak geliştirilmiş basit bir **RESTful API** örneğidir.  
Amaç, temel CRUD (Create, Read, Update, Delete) işlemlerinin nasıl gerçekleştirileceğini göstermektir.  
Uygulama, **Musteriler (müşteriler)** tablosu üzerinde işlemler yapar ve veriler **PostgreSQL** veritabanına kaydedilir.  

Repo klonlanarak Postman veya tarayıcı üzerinden test edilebilir.

---

##  Teknolojiler ve Araçlar

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- Lombok
- PostgreSQL
- Postman (API testleri için)

---

##  Öğrenim Amacı

Bu proje, Spring Boot ile REST API geliştirmeyi öğrenmek isteyenler için temel bir örnektir.  
Katmanlı mimarinin (Controller, Service, Repository) nasıl birlikte çalıştığını gösterir.

---

## Genel Mimari Açıklama

### **Model (Entity)**
- `Musteriler` sınıfı, veritabanındaki **ec_musteriler** tablosunu temsil eder.

### **Repository**
- `MusterilerRepository`, Spring Data JPA aracılığıyla CRUD işlemlerini otomatik olarak sağlar.

### **Service**
- `MusteriService`, iş mantığını barındırır ve Controller ile Repository arasında köprü görevi görür.

### **Controller**
- `MusteriController`, gelen HTTP isteklerini karşılar ve ilgili servis metoduna yönlendirir.

---
