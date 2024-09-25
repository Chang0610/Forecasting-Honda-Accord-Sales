# Forecasting Honda Accord Sales

## Project Overview

This project aims to predict the monthly sales of Honda Accord in the United States using linear regression and advanced machine learning models. Accurate sales forecasting helps Honda optimize production schedules to better meet customer demand while reducing inventory costs.

The dataset contains monthly sales data from January 2014 to November 2023 along with several economic indicators such as unemployment rates, consumer price indices (CPI), and Google search query volumes related to the Honda Accord.

The project involves:
- Building regression models using the given economic indicators.
- Improving the model by addressing seasonality in sales data.
- Evaluating models using metrics like R-squared (R²), Root Mean Squared Error (RMSE), and Mean Absolute Error (MAE).
- Hyperparameter tuning and testing advanced models such as Random Forest and Gradient Boosting.

## Key Features
1. **Data Preprocessing**: 
   - The dataset undergoes basic preprocessing, including handling missing values and log transformation of `AccordSales` to stabilize variance.
   
2. **Linear Regression Model**:
   - A linear regression model is built using independent variables like `Unemployment`, `AccordQueries`, `CPIEnergy`, `CPIAll`, and `MilesTraveled`. 
   
3. **Ridge and Lasso Regularization**:
   - Regularization techniques like Ridge and Lasso are used to mitigate overfitting and handle multicollinearity issues.

4. **Advanced Models**:
   - Random Forest and Gradient Boosting models are implemented and evaluated to improve predictive accuracy.

5. **Hyperparameter Tuning**:
   - Hyperparameter tuning for the Random Forest model is performed using GridSearchCV to identify the best model configuration.

6. **Model Evaluation**:
   - The models are evaluated using the following metrics:
     - **Training Set R²**
     - **Out-of-sample R² (OSR²)**
     - **RMSE**
     - **MAE**

7. **Seasonality**:
   - Seasonality is addressed by introducing the `MonthFactor` variable to capture monthly fluctuations in sales.

## Dataset

The dataset (`Accord-242A-Fall24.csv`) contains the following variables:
- `MonthNumeric`: Month as a number (1 = January, 2 = February, etc.).
- `MonthFactor`: Month as a name (January, February, etc.).
- `Year`: Observation year.
- `AccordSales`: The number of Honda Accords sold.
- `Unemployment`: U.S. unemployment rate.
- `AccordQueries`: Normalized approximation of Google search volumes for "Honda Accord."
- `CPIAll`: Consumer Price Index for all products.
- `CPIEnergy`: Consumer Price Index for the energy sector.
- `MilesTraveled`: Total monthly miles traveled in the U.S. (in millions).

## Instructions

### Prerequisites
Ensure you have Python 3.8 or higher installed. Install the necessary dependencies by running:

```bash
pip install -r requirements.txt
```

### Running the Project

1. **Run the Jupyter Notebook**: The project is implemented in `Forecasting Honda Accord Sales Improved.ipynb`. You can open this file using Jupyter to train models, evaluate them, and conduct hyperparameter tuning.
   
2. **Deploy the Model**:
   You can deploy the best model using Flask. Run the `app.py` file to start the server.

```bash
python app.py
```

Send a POST request to `/predict` with the features to get predictions.

### Example POST Request
```bash
POST /predict
{
    "features": [unemployment, AccordQueries, CPIEnergy, CPIAll, MilesTraveled]
}
```

### Model Evaluation

The models are evaluated using several key metrics:
- **Training Set R²**: Proportion of variance explained by the model on the training set.
- **OSR²**: Out-of-sample R² on the testing set to assess model generalization.
- **RMSE**: Root Mean Squared Error, measuring prediction accuracy.
- **MAE**: Mean Absolute Error, quantifying the average error magnitude.

## Results

1. **Ridge Regression**: Achieved an RMSE of **0.41** on the test set.
2. **Lasso Regression**: Achieved an RMSE of **0.59** on the test set.
3. **Random Forest**: After hyperparameter tuning, achieved an RMSE of **0.58** on the test set with the following parameters: `max_depth=10`, `n_estimators=200`.
4. **Gradient Boosting**: Achieved an RMSE of **0.56** on the test set.
