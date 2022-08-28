package CodingChallenges;

// Write an algorithm to create a class ConstructorDemo with default and parameterized constructors. Introduce yourself in both default and parameterized constructors and execute them.

 

// After writing the algorithm, write suitable code, run the program, and check the output.

class ConstructorPractice{

    ConstructorPractice(){
        System.out.println("This is a default contructor");
    }

    ConstructorPractice(String s){
        System.out.println("This is a " + s);
       
    }
}

public class CodingChallenge4 {
    public static void main(String[] args) {

        ConstructorPractice b = new ConstructorPractice();
        ConstructorPractice v = new ConstructorPractice("Parameterised Constructor");
        
    }
    
}
