package com.example.belicV2.clothes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClothesController {

    private final ClothesService clothesService;

    @Autowired
    public ClothesController(ClothesService clothesService) {
        this.clothesService = clothesService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/clothes")
    public List<Clothes> getClothes() {
        return clothesService.getClothes();
    }

    @PostMapping("/clothes")
    public void setClothes( @RequestBody Clothes clothes){
        clothesService.addClothes(clothes);
    }
}
