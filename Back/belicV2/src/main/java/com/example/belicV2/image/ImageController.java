package com.example.belicV2.image;


import com.example.belicV2.clothes.Clothes;
import com.example.belicV2.clothes.ClothesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ImageController {

    private final ImageRepository imageRepositoryl;

    private final ClothesRepository clothesRepository;

    @Autowired
    public ImageController(ImageRepository imageRepositoryl, ClothesRepository clothesRepository) {
        this.imageRepositoryl = imageRepositoryl;
        this.clothesRepository = clothesRepository;
    }


    @GetMapping("/img")
    public List<Image> getImg() {
        return imageRepositoryl.findAll();
    }

//    @PutMapping("/{clotheId}/img/{imgId}")
//    Clothes asingClothesToImage(
//            @PathVariable Integer clotheId,
//            @PathVariable Integer imgId
//    ){
//        Clothes clothes = clothesRepository.findById(clotheId).get();
//        Image image = imageRepositoryl.findById(imgId).get();
//        image.assingClothe(clothes);
//        re
//
//    }

}
