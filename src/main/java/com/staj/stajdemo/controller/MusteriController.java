package com.staj.stajdemo.controller;

import com.staj.stajdemo.model.Musteriler;
import com.staj.stajdemo.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//RequestMapping bu sınıfa gelen HTTP isteklerinin temel URL'sini belirtir.
@RequestMapping("/musteriler")
@RequiredArgsConstructor
public class MusteriController {

    private final MusteriService musteriService;

    //public MusteriController (MusteriService musteriService) {
    //  this.musteriService = new MusteriService();
   //}


    // önce dataları çekelim. Tüm müşterileri getirmek için
    // MusteriService gidip gelAllMusteriler() metoddaki dataları getir
    //http://localhost:8080/musteriler
    @GetMapping
    public List<Musteriler> getMusteriler() {
        return musteriService.getAllMusteriler();
    }

    @PostMapping
    public Musteriler addMusteriler(@RequestBody Musteriler musteri) {
        return musteriService.addMusteri(musteri);
    }

    //http://localhost:8080/musteriler/Yıldız
    //@GetMapping("/{name}")
    //public Musteriler findByName(@PathVariable String name) {
        //isim parametresi verdiğimiz zaman musteriService deki findByName'e bu parametreyi gönderir
    //    return musteriService.findByName(name);
    //}

    @GetMapping("/{name}")
    public List<Musteriler> findByName(@PathVariable String name) {
        //isim parametresi verdiğimiz zaman musteriService deki findByName'e bu parametreyi gönderir
        return musteriService.findByName(name);
    }

// Yıldız ve yıldız çağırdığımda bunların hepsi gelsin. Yani küçük harf büyük harf fark etmesin
// hatta içinde yıl, yı, y ... gibi şeyler geçen herkes gelsin. İlk önce Repository'de findAllByNameContainingIgnoreCase olarak bunu oluştururuz.
//Bunu MusteriService'deki findByName metoduna ordan da MusterilerRepository'deki findAllByNameContainingIgnoreCase
// metoduna giderek yapar.


    @DeleteMapping("/{id}")
    public void deleteMusteriler(@PathVariable int id) {
        musteriService.deleteMusteriById(id);
    }


}
