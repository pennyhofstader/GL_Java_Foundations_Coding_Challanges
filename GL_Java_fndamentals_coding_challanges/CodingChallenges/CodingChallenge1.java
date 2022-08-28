package CodingChallenges;

// Write an algorithm to create a class Customer that contains 

//           fullName(String) and age(int) as variables in class. 

// Create a main method, assign values to the variables in the main method and print the values of variables using the object of Customer class in the main method. 

// After writing the algorithm, write suitable code, run the program, and check the output.

class Customer{

    String fullName ;
    int age ;

    void displayDetails(){
        System.out.println("My name  is " + fullName + " and my age is " + age);
    }
}

public class CodingChallenge1 {

    public static void main(String[] args) {

        Customer khushi = new Customer();
        khushi.fullName = "Khsuhi Bedi";
        khushi.age = 24;

        khushi.displayDetails();
        
    }
    
}
