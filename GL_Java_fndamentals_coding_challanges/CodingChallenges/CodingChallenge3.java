package CodingChallenges;

// Write an algorithm to implement access modifier functionality. 
// Create two separate classes Customer & CustomerDriver inside  com.greatlearning.corejava; package 

// Create various variables in class Customer of different access modifiers such as (private, public, protected) and initialize them with some values

// Try accessing and printing them in CustomerDriver class.

 

// After writing the algorithm, write suitable code, run the program, and check the output.

class CustomerDriver{
    protected String name;
    public String gender;
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    void printDetails(){
        System.out.println("My name is " + name + " , My age is " + getAge() + " , My gender is " + gender);
    }

}


public class CodingChallenge3 {
    public static void main(String[] args) {

        CustomerDriver customer = new CustomerDriver();
        customer.name = "Khushi";
        customer.gender = "Female";
        customer.setAge(24);
        customer.getAge();

        customer.printDetails();


        
    }
}
