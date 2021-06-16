//ABSTRACTION


//abstraction can be achieved through abstract class as well as interfaces 


abstract class  vehicle{

    int no_of_tyres;

    abstract void Start(); //abstract class is required to write abstract methods , these methods have to be defined 
    //in the child class or whichever class inherits the abstract class
    //abstract class can not be instantiated , they are an abstract

void handle()
{
    System.out.println("i am in handle method");
}
    public static void main(String[] args) {
        car c1 = new car();
        c1.Start();
      

    }

}


class car extends vehicle{

    int no_of_tyres = 4;// abstract datatype is deined in child class
    

    void Start()
    {
        super.handle();//how to call non abstract methods from an abstract class , we use the super keyword in a child class method and call that method instead
System.out.println("engine of car has started");
    }

}

class scooter extends vehicle {

int no_of_tyres=2;

void Start()
{
    System.out.println("engine of car has started");

}
}

//INTERFACES
//blue print of the class
//multiple inheritance can be achieved through interfaces 
//all methods inside an interface are of public abstract by default 
interface Vehicle_interface1 {

    void starti1();// no need to declare it as an abstract method as compile automatically does it for you as it is inside an interface 
    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.starti1();
        b1.starti2();
        
        
    }

}

interface Vehicle_interface2{

    void starti2();// methods are of public access type

}
//example of multiple inherticane as well
class Bus implements Vehicle_interface1,Vehicle_interface2
{
    public void starti1()// we have to declare them as public as the accessability can not be less than that of a parent class , and parent class has public access modifier , INheritance concept 
    {
System.out.println("in bus starti1");
    }
  public void starti2()
    {
        System.out.println("in bus starti2");
    }
}

