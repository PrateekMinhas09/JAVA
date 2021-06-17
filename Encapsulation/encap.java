//ENCAPSULATION 
//INFORMATION HIDING, security purpose
//just like a medicine capsule , main medicine (information in this case) is encapsulated/protected/secured
/*there are 2 steps to achieve encapsulation 

Step1: create private variables 
Step2: create getters and setters to access those variables*/


class Test{

    private int marks;// has been encapsulated 
    public void setmarks(int M_arks)
    {
        marks = M_arks;
    }

    public int getmarks()
    {
        return marks;
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.setmarks(4);
       int p = t.getmarks();
       System.out.println(p);
    }

}
