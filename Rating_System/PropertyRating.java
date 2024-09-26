// PropertyRating.java
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

// PropertyService.java
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    public PropertyRating getPropertyRating(int propertyId) {
        double trafficScore = 8.0;
        double safetyScore = 7.0;
        double userReviewScore = 9.0;

        PropertyRating propertyRating = new PropertyRating(trafficScore, safetyScore, userReviewScore);
        return propertyRating;
    }
}

// PropertyController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getTrafficData")
    public String getTrafficData(@RequestParam String location) {
        return "Traffic data for location: " + location;
    }

    @GetMapping("/getSafetyData")
    public String getSafetyData(@RequestParam String location) {
        return "Safety data for location: " + location;
    }
}

// Application.java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
