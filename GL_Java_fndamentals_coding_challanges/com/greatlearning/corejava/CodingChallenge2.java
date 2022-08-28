package com.greatlearning.corejava;
// Write an algorithm to implement access modifier functionality. 
// Create two separate classes Health & HealthDriver inside  com.greatlearning.corejava; package 

// Declare variables age(int), weight(float) & bmi(float) inside class Health as protected.

// Display all the variable in class HealthDriver

 

// After writing the algorithm, write suitable code, run the program, and check the output.

class Health{
    public int age;
    protected float weight;
    protected float bmi;

    void displayHealthDetails(){
        System.out.println("age = " + age + " weight = " + weight + " bmi = " + bmi);
    }

}


public class CodingChallenge2 {

    public static void main(String[] args) {
        Health h = new Health();
        h.age = 24;
        h.weight = 65f;
        h.bmi = 24.5f;

        h.displayHealthDetails();

    }

    
}
