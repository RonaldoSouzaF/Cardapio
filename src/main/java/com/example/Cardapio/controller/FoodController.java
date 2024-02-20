package com.example.Cardapio.controller;


import com.example.Cardapio.repository.FoodRepository;
import com.example.Cardapio.Dto.FoodRequestDto;
import com.example.Cardapio.Dto.FoodResponseDto;
import com.example.Cardapio.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired(required = true)
    private FoodRepository repository;
    @CrossOrigin(origins = "*",allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDto> getAll(){
        List<FoodResponseDto> foodList = repository.findAll().stream().map(FoodResponseDto::new).toList();
        return foodList;

    }
    @CrossOrigin(origins = "*",allowedHeaders = "*") //front //
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDto data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return;

    }






}
