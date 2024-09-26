// src/main/java/com/example/propertyrating/service/PropertyService.java
package com.example.propertyrating.service;

import com.example.propertyrating.model.PropertyRating;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    public PropertyRating getPropertyRating(int propertyId) {
        // Example data, in a real system you would fetch this from a database
        double trafficScore = 8.0;
        double safetyScore = 7.0;
        double userReviewScore = 9.0;

        return new PropertyRating(trafficScore, safetyScore, userReviewScore);
    }
}
