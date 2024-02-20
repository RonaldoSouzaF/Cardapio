package com.example.Cardapio.repository;

import com.example.Cardapio.model.Food;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


public interface FoodRepository extends JpaRepository<Food, UUID> {
}
