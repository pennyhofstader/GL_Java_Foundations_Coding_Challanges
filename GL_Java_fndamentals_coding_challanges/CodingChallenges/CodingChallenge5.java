package CodingChallenges;

// Write a program to implement Constructor

// Create a class ConstructorDemo.
// Create a default constructor for the class and print “I am default constructor.”
// Execute the constructor created.
// Create a parameterized constructor with arguments of type  integer, float, string and character.
// Print “I am Parameterized constructor. I take various arguments as input.”.
// Create squares from integer and float values and print them in new lines.
// Print string and character in new lines.
// Execute the class constructors 

class ConstructorPracticeOne{

    ConstructorPracticeOne(){
        System.out.println("This is a default contructor");
    }

    ConstructorPracticeOne(String s , int num , float f, double d){
        System.out.println("I am a parameterised constructor and i take various inputs as well like String = " + s + " int = " + num + " float = " + f + " double = " + d);
       
    }
}

public class CodingChallenge5 {
    public static void main(String[] args) {


        ConstructorPracticeOne constuc = new ConstructorPracticeOne();
        ConstructorPracticeOne constu = new ConstructorPracticeOne("Mohit" , 5 , 5.5f , 5.25858);


        
    }
    
}
