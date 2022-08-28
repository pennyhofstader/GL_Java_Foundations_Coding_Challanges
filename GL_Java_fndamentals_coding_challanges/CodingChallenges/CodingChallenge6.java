package CodingChallenges;

// Write a program in java to exploit constructor overloading. (cube and cuboid volume calculation)

// i) Create a class ThreeDimensionShape with three variables  width, height, depth of type double;
// ii) Create three constructors 
// Doesn’t accepts any parameter
// Accepts 1 parameter of type double(length)
// Accepts 3 parameters of type double(width, height, depth)
// iii) Create a method volume of return type double that returns a product of width, height, and depth.

// iv) in case of No argument constructor make length=width=depth = 0;
// v) in case of 1 argument constructor make length=width=depth = value passed;



class ThreeDimentionalShape{
    double width;
    double height;
    double depth;

    ThreeDimentionalShape(){
        width = height = depth = 0;
    }

    ThreeDimentionalShape(double length){
        length = width = height = depth;
    }

    ThreeDimentionalShape(double w, double h, double  d){
        width = w;
        height = h;
        depth = d;
    }

    double vol;
    

    double volume(){
        vol =  width * height * depth;
        return vol;
        
    }

  

}

public class CodingChallenge6 {
    public static void main(String[] args) {

        ThreeDimentionalShape cube = new ThreeDimentionalShape();
        ThreeDimentionalShape cuveOne = new ThreeDimentionalShape(8);
        ThreeDimentionalShape cuvetne = new ThreeDimentionalShape(8,5,4);
        System.out.println();

      System.out.println(cube.volume());
      System.out.println(cuveOne.volume());
      System.out.println(cuvetne.volume());
        


        

       

     
    }

    





    
    
}
