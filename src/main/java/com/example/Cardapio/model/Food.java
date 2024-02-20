package com.example.Cardapio.model;

import com.example.Cardapio.Dto.FoodRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "food")
@Entity
@EqualsAndHashCode(of = "id")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private String title;

    @Column
    private String image;

    @Column
    private Integer price;

    public Food(FoodRequestDto data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();


    }





}


