package com.example.belicV2.clothes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothesService {
    private final ClothesRepository clothesRepository;

    @Autowired
    public ClothesService(ClothesRepository clothesRepository) {
        this.clothesRepository = clothesRepository;
    }

    public List<Clothes> getClothes() {
        return clothesRepository.findAll();
    }

    public void addClothes(Clothes clothes) {
        clothesRepository.save(clothes);
    }
}
