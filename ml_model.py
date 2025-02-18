# -*- coding: utf-8 -*-
"""My first ML model.ipynb

Automatically generated by Colab.

Original file is located at
    https://colab.research.google.com/drive/1ejLcdt2SiRivCNmATwmEMwigEg8ofSWn

# My First ML Project

# Load Data
"""

import pandas as pd
df = pd.read_csv("https://raw.githubusercontent.com/dataprofessor/data/refs/heads/master/delaney_solubility_with_descriptors.csv")
df

"""# Data Preparation

## Data Separation as x and y
"""

y = df['logS']
y

x = df.drop('logS', axis=1)
x

"""### Data Splitting"""

from sklearn.model_selection import train_test_split
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=100)

x_train

x_test

"""# **Model** **Building**

## Linear Regression

###**Training** **the** **Model**
"""

from sklearn.linear_model import LinearRegression
lr = LinearRegression()
lr.fit(x_train, y_train)

"""###**Applying the Model to make prediction**"""

y_lr_train_predict = lr.predict(x_train)
y_lr_test_predict = lr.predict(x_test)

y_lr_train_predict

y_lr_test_predict

"""###**Evaluate Model Performance**"""

from sklearn.metrics import mean_squared_error, r2_score
lr_train_mse = mean_squared_error(y_train, y_lr_train_predict)
lr_train_r2 = r2_score(y_train, y_lr_train_predict)
lr_test_mse = mean_squared_error(y_test, y_lr_test_predict)
lr_test_r2 = r2_score(y_test, y_lr_test_predict)

print(f"LR MSE on train data: {lr_train_mse}")
print(f"LR R2 on train data: {lr_train_r2}")
print(f"LR MSE on test data: {lr_test_mse}")
print(f"LR R2 on test data: {lr_test_r2}")

lr_results = pd.DataFrame(['Linear regression', lr_train_mse, lr_train_r2, lr_test_mse, lr_test_r2]).transpose()
lr_results.columns = ['Method', 'Training MSE', 'Training R2', 'Test MSE', 'Test R2']
lr_results

"""##**Random Forest**

###**Training the Model**
"""

from sklearn.ensemble import RandomForestRegressor
rf = RandomForestRegressor(max_depth=2, random_state=100)
rf.fit(x_train, y_train)

"""###**Applying the Model to make prediction**


"""

y_rf_train_predict = rf.predict(x_train)
y_rf_test_predict = rf.predict(x_test)

"""###**Evaluate Model Performance**"""

from sklearn.metrics import mean_squared_error, r2_score
rf_train_mse = mean_squared_error(y_train, y_rf_train_predict)
rf_train_r2 = r2_score(y_train, y_rf_train_predict)
rf_test_mse = mean_squared_error(y_test, y_rf_test_predict)
rf_test_r2 = r2_score(y_test, y_rf_test_predict)

rf_results = pd.DataFrame(['Linear regression', rf_train_mse, rf_train_r2, rf_test_mse, rf_test_r2]).transpose()
rf_results.columns = ['Method', 'Training MSE', 'Training R2', 'Test MSE', 'Test R2']
rf_results

"""##**Model Comparison**"""

df_models = pd.concat([lr_results, rf_results], axis=0).reset_index(drop=True)
df_models

df_models.reset_index(drop=True)

"""#**Data Visualization of Prediction Results**"""

import matplotlib.pyplot as plt
plt.scatter(x=y_train, y=y_lr_train_predict, alpha=0.8, label='Train')
plt.scatter(x=y_test, y=y_lr_test_predict, alpha=0.8, label='Test')
plt.legend()
plt.xlabel('True Value')
plt.ylabel('Predicted Value')
plt.title('Linear Regression Prediction')
plt.show()