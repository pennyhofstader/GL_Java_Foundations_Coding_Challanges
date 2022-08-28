package CodingChallenges;

// Write an algorithm to create class Area and find area of the circle using final keyword for pi value.
// After writing the algorithm, write suitable code, run the program, and check the output.

class Area{

    double PiValue = Math.PI;
    double radius;

    public double setRadius(){
        return radius;
    }

    public void getRadius(int r){
        radius = r;
    }

     double getArea(){
        return PiValue * radius * radius;
    }




}

public class CodingChallenge7 {
    public static void main(String[] args) {

        Area a = new Area();
        a.getRadius(4);
        a.setRadius();
        System.out.println("The area of the circle is " + a.getArea()); 
    }
    
}
