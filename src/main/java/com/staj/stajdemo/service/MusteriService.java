package com.staj.stajdemo.service;

import com.staj.stajdemo.model.Musteriler;
import com.staj.stajdemo.repository.MusterilerRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


// bu katman MusterilerRepository üzerinden kaydetme,güncelleme.. gibi işlemleri yapar
//@RequiredArgsConstructor: final ve @NonNull alanlar için constructor sağlar.
//@AllArgsConstructor: Tüm alanlar için constructor sağlar.
//@NoArgsConstructor: Parametresiz constructor sağlar.
@Service
@RequiredArgsConstructor

public class MusteriService {
    private final MusterilerRepository musterilerRepository;

    public List<Musteriler> getAllMusteriler() {
        return musterilerRepository.findAll();
    }

    public Musteriler addMusteri(Musteriler musteri) {
        // gelen öğrenciyi direkt database'e kaydeder
        return musterilerRepository.save(musteri);
    }

    //tek bir kişiyi döner
    // public Musteriler findByName(String name) {
        //musterilerRepository'deki ismi ... olan ilk kişiyi döner
    //  return musterilerRepository.findFirstByName(name);
    //}


    //public List<Musteriler> findByName(String name) {
    //    return musterilerRepository.findAllByName(name);
    //}

    public List<Musteriler> findByName(String name) {
        return musterilerRepository.findAllByNameContainingIgnoreCase(name);
    }


    public void deleteMusteriById(int id) {
        musterilerRepository.deleteById(id);
    }
}


