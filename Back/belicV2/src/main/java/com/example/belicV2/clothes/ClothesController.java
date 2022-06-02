package com.example.belicV2.clothes;

import com.example.belicV2.image.Image;
import com.example.belicV2.image.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClothesController {

    private final ImageRepository imageRepository;
    private final ClothesRepository clothesRepository;
    private final ClothesService clothesService;

    @Autowired
    public ClothesController(ImageRepository imageRepository, ClothesRepository clothesRepository, ClothesService clothesService) {
        this.imageRepository = imageRepository;
        this.clothesRepository = clothesRepository;
        this.clothesService = clothesService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/clothes")
    public List<Clothes> getClothes() {
        return clothesService.getClothes();
    }

    @PostMapping("/clothes/save")
    public void setClothes( @RequestBody Clothes clothes){
        clothesService.addClothes(clothes);
    }

    @PutMapping("/{clothesId}/img/{imgId}")
    Clothes enroll(
            @PathVariable Integer clothesId,
            @PathVariable Integer imgId
    ){
            Clothes clothes = clothesRepository.findById(clothesId).get();
            Image image = imageRepository.findById(imgId).get();
            clothes.enrrol(image);
            return clothesRepository.save(clothes);
    }
}
