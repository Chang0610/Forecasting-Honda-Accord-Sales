// src/main/java/com/example/propertyrating/model/PropertyRating.java
package com.example.propertyrating.model;

public class PropertyRating {
    private double trafficScore;
    private double safetyScore;
    private double userReviewScore;

    public PropertyRating(double trafficScore, double safetyScore, double userReviewScore) {
        this.trafficScore = trafficScore;
        this.safetyScore = safetyScore;
        this.userReviewScore = userReviewScore;
    }

    public double calculateOverallRating() {
        return (trafficScore * 0.4) + (safetyScore * 0.3) + (userReviewScore * 0.3);
    }
}
