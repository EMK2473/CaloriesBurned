# Calories Burned
![Github license](https://img.shields.io/badge/mit-blue.svg)
 
 Licensing: [mit](https://choosealicense.com/licenses/mit/)

## Table of Contents
- [Description](#description)
- [Installation Requirements](#installation-requirements)
- [Application Usage](#application-usage)
- [License](#licensing-information)
- [Contributions](#contributions)
- [Tests Commands](#tests-commands)
- [Questions](#questions)
## Description
OOP Lab Module: A Java program that calculates the number of calories burned during exercise based on user input for age, weight, heart rate, and time.

## Installation Requirements
Ensure you have Java Development Kit (JDK) installed on your system. You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or use a package manager like Homebrew for macOS or apt-get for Linux.  

Using terminal commands: 

- Clone or download the repository: 
```Java 
- git clone https://github.com/your-username/CaloriesBurned.git 
```

- Navigate to the project directory: 
```Java
- cd CaloriesBurned 
```
- Compile the CaloriesBurned.java file: 
```Java
- javac CaloriesBurned.java 
```
- Run the program: 
```Java
- java CaloriesBurned
```

## Application Usage
The program will prompt you to enter the following values:  

- Age (in years) 
- Weight (in pounds) 
- Heart Rate (in beats per minute) 
- Time (in minutes of exercise) 

After entering these values, the program will calculate the total calories burned using the following formula: 
```Java
caloriesBurned = (age * 0.2757 + weight * 0.03295 + heartRate * 1.0781 - 75.4991) * time / 8.368
```

## Contributions
Eric Keeton

## Test Commands
You can test the program by running it with various input values and verifying that the calorie calculation matches expectations based on the formula provided. 

## Questions
For Questions, contact me at emk2473@gmail.com or visit My Github: [EMK2473](https://github.com/EMK2473)