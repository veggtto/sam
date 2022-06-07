package com.sam.image.web;

import com.sam.image.entity.ImageEntity;
import com.sam.image.service.ImageUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/image")
public class ImageWebEndpoint {

    private ImageUserService imageUserService;

    @Autowired
    void autowired(ImageUserService imageUserService){
        this.imageUserService=imageUserService;
    }

    @GetMapping("/list")
    public Object list() {
        return imageUserService.list();
    }

    @PostMapping("/add")
    public Object add(@RequestBody ImageEntity entity) {
        return imageUserService.save(entity);
    }
}
