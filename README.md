# Property Rating System

## Overview

This project is a **Property Rating System** developed using **Java Spring Boot** for the backend API, **Python** for K-Means clustering and sentiment analysis, and **Java Swing** for a simple GUI interface. The system evaluates rental properties and cameras based on factors such as traffic, safety, and user reviews, and provides a real-time rating.

## Features

- **Rating System**: Evaluates rental properties and cameras based on traffic, safety, and user reviews.
  
- **RESTful APIs**: Provides APIs for data collection and integration from sources like Google Maps and user-generated reviews.
  
- **K-Means Clustering**: Classifies properties and cameras based on their attributes to help users find the best options.
  
- **Sentiment Analysis**: Analyzes user reviews to classify feedback as positive or negative to improve rating accuracy.
  
- **Java Swing GUI**: Provides a simple user interface to interact with the rating system and view results in real time.

## Technology Stack

- **Backend**: Java, Spring Boot, REST APIs
  
- **Frontend**: Java Swing (for GUI)

- **Machine Learning**: Python, Scikit-learn, K-Means, SVM


### GUI Setup (Java Swing)

1. Compile and run the Java Swing GUI:
   ```bash
   javac src/main/java/com/example/propertyrating/gui/PropertyRatingGUI.java
   java src/main/java/com/example/propertyrating/gui/PropertyRatingGUI
   ```

This will open a simple user interface where you can see real-time ratings.


## API Endpoints

- `GET /api/getRating?propertyId={id}`: Fetch the rating for a property based on its ID.
