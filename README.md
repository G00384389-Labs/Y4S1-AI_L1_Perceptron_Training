# Artifical Intelligence Lab 1 - Perceptron Lab: Training a Neural Network for Logical Operations
This is the first lab for the Artificial Intelligence Module for final year.

## Overview

This lab explores the fundamental concepts of artificial intelligence by training a **Rosenblatt Perceptron** to perform **logical AND** and **logical OR** operations. The perceptron, a simple type of artificial neural network, consists of a **linear combiner** and a **hard limiter**, which allows it to classify inputs based on a weighted sum and threshold activation.

By implementing and training a perceptron, this lab demonstrates how single-layer perceptrons can effectively classify **linearly separable data**, such as Boolean logic gates.

## Learning Objectives

- Understand the working principles of a **Rosenblatt perceptron**.
- Implement a perceptron to classify logical **AND** and **OR** operations.
- Train a perceptron using **gradient descent** and update its weights iteratively.
- Experiment with different learning rates, thresholds, and weight initializations.
- Analyze how the perceptron adjusts weights to correctly classify inputs.

## Implementation Steps

1. **Define the Training Data:**
   - Boolean truth tables for AND and OR operations.
   - Represent data as a 2D float array.

2. **Set Expected Outputs:**
   - Define expected truth values for logical operations.

3. **Initialize and Train the Perceptron:**
   - Create a perceptron with **two input variables**.
   - Randomly initialize weights.
   - Train the perceptron over **10,000 epochs**.

4. **Test the Perceptron:**
   - Iterate through the training data and verify predictions.
   - Adjust parameters to observe changes in learning behavior.
