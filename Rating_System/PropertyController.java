// src/main/java/com/example/propertyrating/controller/PropertyController.java
package com.example.propertyrating.controller;

import com.example.propertyrating.model.PropertyRating;
import com.example.propertyrating.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/getRating")
    public double getRating(@RequestParam int propertyId) {
        PropertyRating rating = propertyService.getPropertyRating(propertyId);
        return rating.calculateOverallRating();
    }
}
