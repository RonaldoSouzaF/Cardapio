package com.example.Cardapio.Dto;

import com.example.Cardapio.model.Food;

import java.util.UUID;

public record FoodResponseDto(UUID id, String title, String image, Integer price) {
    public FoodResponseDto(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }

}
