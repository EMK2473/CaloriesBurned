package CaloriesBurned;

import java.util.Scanner;

public class CaloriesBurned {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int age = scnr.nextInt();
      int weight = scnr.nextInt();
      int heartRate = scnr.nextInt();
      int time = scnr.nextInt();
      
      double caloriesBurned = (age * 0.2757 + weight * 0.03295 + heartRate * 1.0781 - 75.4991) * time / 8.368;
      System.out.printf("Calories: %.2f calories\n", caloriesBurned);
      scnr.close();
    }
} 
