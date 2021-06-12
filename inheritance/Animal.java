//INHERITANCE

class Animal{ //ANIMAL is a parent class 


    Animal()
    {
        System.out.println("i am an animal"); //contructors and private methods will not be inherited by the child class
    }
    void eat()
    {
        System.out.println("I am eating");
    }

    public static void main(String[] args) {

        Bird penguin = new Bird(); // i am an animal
        Fish tuna = new Fish();// i am an animal 
        Fish clownfish = new Fish(); // i am an animal
        tuna.eat();// i am eating
        penguin.eat();// i am eating

        /* the above output comes the way it does due to the fact that , when a child creates its object, 
        it automatically calls the parent constructor as the compiler automatically invokes the super class constructor , therefore , 
        a parent/super class constroctor will be called the number of times a new child object is instantiated or created , there is no way to
        invoke a parent constructor via the child object other than compiler doing it automatically on its own*/
        
    }
}


//Bird is a child classs

class Bird extends Animal{
void fly()
{
    System.out.println("i am flying"); // this method is only accessible to the bird class 
}
    

}

class Fish extends Animal{
    void swim()
    {
        System.out.println("i am swimming");
    }
        
    
}
