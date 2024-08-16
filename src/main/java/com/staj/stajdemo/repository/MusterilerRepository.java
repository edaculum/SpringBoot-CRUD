package com.staj.stajdemo.repository;

// repository'ler bir interface olarak oluşturulmalıdır

import com.staj.stajdemo.model.Musteriler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
//@RequiredArgsConstructor
public interface MusterilerRepository extends JpaRepository<Musteriler, Integer> {

   // Musteriler findFirstByName(String name);


    //List<Musteriler> findAllByName(String name);


    //gönderdeğim name LIKE ile arasın ve onları getirsin
    List<Musteriler> findAllByNameContainingIgnoreCase(String name);

    public void deleteById(Integer id);


   // findFirstByName diyip name parametresinde verilen müşterilerin hepsini getirebiliriz.
    // tek bir tane getirmeyeceği için List<> şeklinde tanımlarız
}
