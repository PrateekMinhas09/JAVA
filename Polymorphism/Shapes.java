//POLYMORPHISM
// of 2 types - 1. Compile Time/Static Polymorphism , 2. RunTime/Dynamic Polymorphism 
/* Compile Time Polymorphism is achieved through method overloading while run time polumorphism is achieved through method overwriting and inheritance */

//Bellow is an example of "METHOD OVERLOADING" where the methods should have same names, be in same class but have different arguments, sequence
class Shapes
{
  void corners()//--1
  {
      System.out.println("corners are null not 0");
  }

  void corners(int a)//--2 
  {
      System.out.println("corners are"+" "+ a);
  }

  void corners(int b, String WhoAmI)//--3
  {
    System.out.println("corners are"+" "+ b + " "+ "i am a"+ " "+ WhoAmI);
  }
  void corners(String WhoAmI, int b)//--4
  {
    System.out.println("corners are"+" "+ b + " "+ "i am a"+ " "+ WhoAmI);
  }

  void corners(String a)
  {
    System.out.println("corners are"+" "+ a);
  }


  private void edges()
  {
    System.out.println("private edge method");
  }

  //3 and 4 have same arguments but different sequence 
//all methods have same names but different functionalities 
  public static void main(String[] args) {
      Shapes shape = new Shapes();
      
      shape.corners();// will invoke 1
      shape.corners(10);//will invoke 2
      shape.corners(0,"circle");//will invoke 3
      shape.corners("hexagon", 10);//will invoke 4


      //special case of Automatic promotion 
    shape.corners("pentagon");// Will invoke 5
    shape.corners('a');//here a is a char , it will not call 5 , it will call method 2 , it will convert the char into its equivalent ascii value 
    //Automatic promotion is when one datatype is converted to another, if no matching equivalent datatype argument is found to be passed through as 
    // byte-> short -> int 
    //char -> int -> float, long -> double


    //method overriding
    /*here method 3 of class shapes is being overridden by method 3a of class square*/
    Square sq1 = new Square();
    sq1.corners(4, "square of class square");
    shape.corners(0,"circle of class shapes");

    sq1.edges

  }
}
//bellow i have created another class for the purpose of demonstrating method overriding or runtime/dynamic polymorphism.
  class Square extends Shapes{

    void corners(int b, String WhoAmI)// --3(a) which is the same as method 3 in class Shapes, everything about the method is same ,from arguments to its sequence
    
  {
    System.out.println("corners are"+" "+ b + " "+ "i am a"+ " "+ WhoAmI);
  }

  public void edges()// here a private edge method of class shapes is being overridded by a public edge method of its significant child class
  //while method overriing , one can not reduce the accessesability of the method ,child class will have a greater acess than the parent class.
  //private < protected < Default < public 
  //parrent ---------------> child(while overriding)
  {
    System.out.println("public edge method in the child class");
  }

  }

