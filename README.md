# Calculator - Java Swing Application

## Description
This is a simple calculator application built with Java Swing that supports basic arithmetic operations including addition, subtraction, multiplication, and division.

## Features
- **Addition (ADD)**: Performs addition of two numbers
- **Subtraction (SUB)**: Performs subtraction of two numbers
- **Multiplication (MUL)**: Performs multiplication of two numbers
- **Division (DIV)**: Performs division of two numbers (with division by zero handling)
- **Clear (CLEAR)**: Clears all input fields and results

## User Interface
The application has a simple interface with:
- 2 input fields for the first and second numbers
- 1 result display field (read-only)
- 5 function buttons: ADD, SUB, MUL, DIV, CLEAR

## System Requirements
- Java Development Kit (JDK) 8 or higher
- Java-supported operating system (Windows, macOS, Linux)

## How to Run the Application

### Step 1: Compile
```bash
javac Calculator.java
```

### Step 2: Run the Application
```bash
java Calculator
```

## How to Use
1. Start the application
2. Enter the first number in the "First Number" field
3. Enter the second number in the "Second Number" field
4. Click the button corresponding to the desired operation:
   - **ADD**: Add two numbers
   - **SUB**: Subtract the second number from the first number
   - **MUL**: Multiply two numbers
   - **DIV**: Divide the first number by the second number
5. The result will be displayed in the "Result" field
6. Use the **CLEAR** button to clear all fields and perform a new calculation

## Error Handling
- **Division by Zero**: When performing division with a divisor of 0, the application will display "Div by 0"
- **Number Format Error**: If an invalid number format is entered, the application will throw a NumberFormatException

## Source Code Structure
- **Main class**: `Calculator`
- **GUI Framework**: Java Swing (JFrame, JLabel, JTextField, JButton)
- **Event Handling**: ActionListener to handle button click events

## Notes
- The application uses `Double.parseDouble()` to convert strings to double values
- Supports decimal numbers
- Interface uses absolute positioning with `setBounds()`

## Author
Calculator Java Swing Application

## Version
Version 1.0
