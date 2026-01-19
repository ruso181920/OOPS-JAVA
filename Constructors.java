public class Constructors {
// Purpose: Its primary job is to set the initial values for the object's attributes (fields) when the object is created.
// Automatic Invocation: A constructor is called automatically at the moment an object is instantiated using the new keyword.
// Naming Convention: In most languages (like Java, C++, and C#), the constructor must have the exact same name as the class it belongs to.
// No Return Type: Constructors do not have a return type—not even void. Their sole purpose is to return a new instance of the class.

public static void main(String[] args) {
   
    Student s1=new Student();
    Student s2=new Student("Raushan", 01);
    Student s3=new Student("Abhishek");
    // this consrtuctor will give error as it is not created in the class
   // The compiler only provides a default constructor if you write NO constructors at all.
  // As soon as you define a parameterized constructor (like your Student(String name)),
  //  the compiler stops providing the automatic default one.   // Student s4=new Student(234);
   System.out.println(s2.name);
   System.out.println(s2.roll);
   System.out.println(s3.name);
}
}

class Student {
    String name;
    int roll;

// Types of Constructor
// Most programming languages support different ways to define constructors:
//1. Default Constructor: A constructor that takes no arguments. If you don't write any constructor, the compiler often provides a hidden "default" one for you.
    public Student() {

    }

// 2.Parameterized Constructor: A constructor that accepts specific values (parameters). This allows you to create objects with different initial data (e.g., new Student("Alex", 20)).
   public Student(String name) {
        this.name=name;
    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    //3. Copy Constructor: Used to create a new object by copying the data from an existing object of the same class.
    
    
}
