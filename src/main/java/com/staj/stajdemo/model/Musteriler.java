package com.staj.stajdemo.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.UUID;

@Entity
@Table(name="ec_musteriler")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Musteriler{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Nullable //dönüş değerinin null olabileceğini belirtir
    private Integer age;

    @NonNull//name alanı hiç bir zaman boş olamaz
    private String name;

    private String city;

}
