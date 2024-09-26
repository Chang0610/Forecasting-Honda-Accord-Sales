// src/main/java/com/example/propertyrating/gui/PropertyRatingGUI.java
import javax.swing.*;
import java.awt.*;

public class PropertyRatingGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Property Ratings");
        JLabel ratingLabel = new JLabel("Overall Rating: ");
        JButton showRatingButton = new JButton("Show Rating");

        showRatingButton.addActionListener(e -> {
            // Simulate getting the rating from the backend
            double rating = getRatingFromBackend(1);
            ratingLabel.setText("Overall Rating: " + rating);
        });

        frame.add(ratingLabel, BorderLayout.CENTER);
        frame.add(showRatingButton, BorderLayout.SOUTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    private static double getRatingFromBackend(int propertyId) {
        // Simulate calling the backend API
        return 8.5; // Example rating
    }
}
