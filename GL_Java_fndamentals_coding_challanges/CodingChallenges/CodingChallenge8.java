package CodingChallenges;

// Write a program to do the following

// Create integer non-static variable var1 and a static variable var2 and assign value 10 to var1 & var2.
// create two methods method1 and method2.
// In method1, use increment operator to increment var1 and use print statement to print var1.
// Similarly perform for method2 with var2.
// Create three objects obj1, obj2, obj3.
// Execute method1 with all the objects.
// Similarly perform for method2.
// (Optional) Replace static with final for var2 and run the program. Note your observations.
 

class staticPractice{

    int var1 = 10;
    static int var2 = 10;

    void method1(){
        var1++;
        System.out.println(var1);
    }

        void method2(){
            var2++;
                System.out.println(var2);
            

    }
}


public class CodingChallenge8 {
    public static void main(String[] args) {

        staticPractice Obj1 = new staticPractice();
        staticPractice Obj2 = new staticPractice();
        staticPractice Obj3 = new staticPractice();

        System.out.println("without static");
        Obj1.method1();
        Obj2.method1();
        Obj3.method1();
      
        System.out.println("with static");
        Obj1.method2();
        Obj2.method2();
        Obj3.method2();
      
        
    }
    
}
